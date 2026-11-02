package train.client.gui;

import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.FontRenderer;
import net.minecraft.util.ChatComponentText;
import org.lwjgl.input.Keyboard;
import org.lwjgl.input.Mouse;
import train.common.Traincraft;
import train.common.core.network.PacketInterchangeReportBoardSettings;
import train.common.utils.interchangetransferreport.InterchangeTransferReportGenerator;
import train.common.utils.interchangetransferreport.InterchangeTransferReportGenerator.InterchangeReportDraft;
import train.common.utils.interchangetransferreport.InterchangeTransferReportGenerator.InterchangeReportRow;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class GuiInterchangeReport extends GuiScreen
{
    /*
     * Clipboard-style editor for an InterchangeReportDraft.
     *
     * The draft is created on the logical server from the clicked train, serialized through
     * PacketInterchangeReportGui, then edited locally here. Every scroll/reorder/delete operation
     * saves visible text fields back into draft.rows before controls are rebuilt. Export formats the
     * edited draft, so the final file reflects manual row order, added rows, deleted rows, and field edits.
     */
    // Row counts differ because the first view reserves space for board metadata.
    private static final int FIRST_PAGE_ROWS = 6;
    private static final int CONTINUATION_PAGE_ROWS = 7;
    private static final int MAX_ROWS_PER_PAGE = CONTINUATION_PAGE_ROWS;

    // Button id ranges are grouped by row action so visible-row indexes can be decoded from the id.
    private static final int BUTTON_EXPORT = 1;
    private static final int BUTTON_CANCEL = 2;
    private static final int BUTTON_REVERSE = 5;
    private static final int BUTTON_ADD_ROW = 6;
    private static final int BUTTON_LOADED_BASE = 100;
    private static final int BUTTON_HAZMAT_BASE = 200;
    private static final int BUTTON_MOVE_UP_BASE = 300;
    private static final int BUTTON_MOVE_DOWN_BASE = 400;
    private static final int BUTTON_DELETE_BASE = 500;

    // Sheet, grid, and column measurements are all relative to the top-left sheet origin.
    private static final int SHEET_WIDTH = 534;
    private static final int SHEET_HEIGHT = 224;
    private static final int GRID_LEFT = 10;
    private static final int GRID_RIGHT = SHEET_WIDTH - 10;
    private static final int GRID_HEADER_HEIGHT = 19;
    private static final int GRID_ROW_HEIGHT = 20;
    private static final int GRID_ROW_CONTROL_Y_OFFSET = 2;
    private static final int GRID_ROW_TEXT_Y_OFFSET = 5;
    private static final int BUTTON_GAP_BELOW_GRID = 7;
    private static final int COL_MOVE = 10;
    private static final int COL_NUMBER = 48;
    private static final int COL_CAR = 160;
    private static final int COL_LOAD_TYPE = 188;
    private static final int COL_DESTINATION = 230;//258 not 205
    private static final int COL_CUSTOMER = 300;//311 not 364
    private static final int COL_CARGO = 474;//485
    private static final int COL_HAZMAT = 500;//508
    private static final int COL_DELETE = SHEET_WIDTH - 10;//sheet width -10

    // Clipboard palette. Constant names include the color family so hex values are understandable.
    private static final int BROWN_CLIPBOARD_BOARD = 0xff72533a;
    private static final int IVORY_PAPER = 0xfff0eadb;
    private static final int TRANSLUCENT_DARK_BROWN_PAPER_SHADOW = 0xaa17120d;
    private static final int DARK_GRAY_METAL_CLIP = 0xff5f6265;
    private static final int CHARCOAL_METAL_CLIP_SHADOW = 0xff4f5153;
    private static final int LIGHT_GRAY_METAL_CLIP_HIGHLIGHT = 0xff9a9da0;
    private static final int TAN_GRID_LINE = 0xffb9aa8c;
    private static final int LIGHT_TAN_GRID_LINE = 0xffd7cbb5;
    private static final int TAN_HEADER_FILL = 0xffded2ba;
    private static final int PALE_TAN_ALT_ROW_FILL = 0xffe8dfcd;
    private static final int DARK_BROWN_TEXT = 0xff2d261a;
    private static final int MUTED_BROWN_TEXT = 0xff736850;
    private static final int MUTED_TAN_DISABLED_TEXT = 0xff9c927f;
    private static final int PALE_RED_HAND_BRAKE_ROW_FILL = 0xffead6c7;
    private static final int LIGHT_IVORY_HEADER_FIELD_FILL = 0xfff7f2e6;
    private static final int TRANSLUCENT_IVORY_ROW_FIELD_FILL = 0x99fffaf0;
    private static final int TRANSLUCENT_WHITE_ROW_AREA_FILL = 0x33ffffff;
    private static final int BROWN_BUTTON_BORDER = 0xff8f7b5d;
    private static final int MUTED_TAN_DISABLED_BUTTON_BORDER = 0xffb4aa96;
    private static final int TRANSLUCENT_WHITE_BUTTON_HIGHLIGHT = 0x66ffffff;
    private static final int PALE_TAN_DISABLED_BUTTON_FILL = 0xffded6c5;
    private static final int GREEN_EXPORT_BUTTON_FILL = 0xffb7cba8;
    private static final int LIGHT_GREEN_EXPORT_BUTTON_HOVER_FILL = 0xffc7d9c0;
    private static final int ORANGE_WARNING_BUTTON_FILL = 0xffd7ad7f;
    private static final int LIGHT_ORANGE_WARNING_BUTTON_HOVER_FILL = 0xffe5c29b;
    private static final int TAN_SMALL_BUTTON_FILL = 0xffddd0b8;
    private static final int LIGHT_TAN_SMALL_BUTTON_HOVER_FILL = 0xffe9ddc5;
    private static final int TAN_BUTTON_FILL = 0xffd9ccb6;
    private static final int LIGHT_TAN_BUTTON_HOVER_FILL = 0xffe6dac5;
    private static final int FIELD_TEXT_Y_OFFSET = 2;

    private final InterchangeReportDraft draft;

    // Only controls for currently visible rows exist; saveVisibleRows writes them back before rebuilds.
    private final List<RowControls> rowControls = new ArrayList<RowControls>();
    private int scrollRowOffset;
    private GuiTCTextField railroadField;
    private GuiTCTextField locationField;

    public GuiInterchangeReport(InterchangeReportDraft draft)
    {
        this.draft = draft;
    }

    @Override
    public void initGui()
    {
        Keyboard.enableRepeatEvents(true);
        rebuildControls();
    }

    @Override
    public void onGuiClosed()
    {
        saveVisibleRows();
        syncBoardSettings();
        Keyboard.enableRepeatEvents(false);
    }

    /*
     * Control construction
     *
     * Minecraft GUI controls are not virtualized for us, so the report rebuilds the buttons and text
     * boxes for only the currently visible row window. The draft remains the source of truth.
     */
    private void rebuildControls()
    {
        buttonList.clear();
        rowControls.clear();

        int left = getSheetLeft();
        int top = getSheetTop();

        buildHeaderFields(left, top);
        addActionButtons(left, top);
        addVisibleRowControls(left, top);
    }

    // Header fields are intentionally present only at the top of the scrolling sheet.
    private void buildHeaderFields(int left, int top)
    {
        railroadField = null;
        locationField = null;
        if (scrollRowOffset != 0)
        {
            return;
        }

        railroadField = createField(left + 72, top + 25, 170, 32, draft.railroad);
        locationField = createField(left + 384, top + 25, 120, 24, draft.location);
    }

    private void addActionButtons(int left, int top)
    {
        int actionY = getGridBottom(top) + BUTTON_GAP_BELOW_GRID;
        addActionButton(BUTTON_EXPORT, left + 13, actionY, 64, "Export", ClipboardButton.Style.PRIMARY);
        addActionButton(BUTTON_CANCEL, left + 82, actionY, 64, "Cancel", ClipboardButton.Style.NORMAL);
        addActionButton(BUTTON_REVERSE, left + 151, actionY, 76, "Reverse", ClipboardButton.Style.NORMAL);
        addActionButton(BUTTON_ADD_ROW, left + 232, actionY, 68, "Add Row", ClipboardButton.Style.NORMAL);
    }

    private void addActionButton(int id, int x, int y, int width, String text, ClipboardButton.Style style)
    {
        buttonList.add(new ClipboardButton(id, x, y, width, 18, text, style));
    }

    // Rebuild row controls from the draft each time scrolling or row order changes.
    private void addVisibleRowControls(int left, int top)
    {
        int startRow = scrollRowOffset;
        int rowsOnPage = getVisibleRowCount();
        for (int i = 0; i < rowsOnPage && startRow + i < draft.rows.size(); i++)
        {
            int rowIndex = startRow + i;
            int y = getRowControlTop(top, i);
            InterchangeReportRow row = draft.rows.get(rowIndex);
            RowControls controls = createRowControls(left, y, rowIndex, row);
            addRowButtons(left, y, i, rowIndex, row, controls);
            rowControls.add(controls);
        }
    }

    private RowControls createRowControls(int left, int y, int rowIndex, InterchangeReportRow row)
    {
        RowControls controls = new RowControls();
        controls.rowIndex = rowIndex;
        controls.typeX = left + COL_CAR + 3;
        controls.typeY = y + 1;
        controls.typeWidth = getColumnInnerWidth(COL_CAR, COL_LOAD_TYPE);
        controls.typeHeight = 17;
        controls.carX = left + COL_NUMBER + 3;
        controls.carY = y + 1;
        controls.carWidth = getColumnInnerWidth(COL_NUMBER, COL_CAR);
        controls.carHeight = 17;
        controls.car = createColumnField(left, y, COL_NUMBER, COL_CAR, InterchangeTransferReportGenerator.CAR_LIMIT, row.car);
        controls.destination = createColumnField(left, y, COL_LOAD_TYPE, COL_DESTINATION, InterchangeTransferReportGenerator.DESTINATION_LIMIT, row.destination);
        controls.customer = createColumnField(left, y, COL_DESTINATION, COL_CUSTOMER, InterchangeTransferReportGenerator.CUSTOMER_LIMIT, row.customer);
        controls.cargo = createColumnField(left, y, COL_CUSTOMER, COL_CARGO, InterchangeTransferReportGenerator.CARGO_LIMIT, row.cargo);
        return controls;
    }

    private GuiTCTextField createColumnField(int left, int rowY, int columnStart, int columnEnd, int limit, String text)
    {
        return createField(left + columnStart + 5, rowY + 3, columnEnd - columnStart - 10, limit, text);
    }

    private int getColumnInnerWidth(int columnStart, int columnEnd)
    {
        return columnEnd - columnStart - 6;
    }

    private int getColumnCenter(int columnStart, int columnEnd)
    {
        return columnStart + (columnEnd - columnStart) / 2;
    }

    private void addRowButtons(int left, int y, int visibleIndex, int rowIndex, InterchangeReportRow row, RowControls controls)
    {
        addRowButton(BUTTON_LOADED_BASE + visibleIndex, controls.typeX, y + 1, controls.typeWidth, 15, getLoadTypeLabel(row), ClipboardButton.Style.SMALL);
        addRowButton(BUTTON_HAZMAT_BASE + visibleIndex, left + COL_CARGO + 5, y + 1, 13, 15, row.hazmat ? "x" : "", row.hazmat ? ClipboardButton.Style.WARNING : ClipboardButton.Style.SMALL);
        addRowButton(BUTTON_DELETE_BASE + visibleIndex, left + COL_HAZMAT + 4, y + 1, 12, 15, "X", ClipboardButton.Style.SMALL);

        GuiButton upButton = new ClipboardButton(BUTTON_MOVE_UP_BASE + visibleIndex, left + 13, y, 10, 8, "^", ClipboardButton.Style.SMALL);
        GuiButton downButton = new ClipboardButton(BUTTON_MOVE_DOWN_BASE + visibleIndex, left + 13, y + 10, 10, 8, "v", ClipboardButton.Style.SMALL);
        upButton.enabled = rowIndex > 0;
        downButton.enabled = rowIndex < draft.rows.size() - 1;
        buttonList.add(upButton);
        buttonList.add(downButton);
    }

    private void addRowButton(int id, int x, int y, int width, int height, String text, ClipboardButton.Style style)
    {
        buttonList.add(new ClipboardButton(id, x, y, width, height, text, style));
    }

    // All editable fields share the Lockout Book-style text treatment.
    private GuiTCTextField createField(int x, int y, int width, int limit, String text)
    {
        GuiTCTextField field = new GuiTCTextField(fontRendererObj, x, y, width, 15);
        field.setMaxStringLength(limit);
        field.setText(text == null ? "" : text);
        field.setEnableBackgroundDrawing(false);
        field.setTextColor(DARK_BROWN_TEXT);
        field.setDrawTextShadow(false);
        field.setTextYOffset(FIELD_TEXT_Y_OFFSET);
        return field;
    }

    /*
     * Report editing actions
     *
     * All action handlers operate on draft.rows after saveVisibleRows() runs. This keeps text box
     * edits attached to the correct row when rows are moved, deleted, reversed, or scrolled away.
     */
    @Override
    protected void actionPerformed(GuiButton button)
    {
        // Persist edits before any action that can rebuild, reorder, or close the GUI.
        saveVisibleRows();

        if (button.id == BUTTON_EXPORT)
        {
            exportReport();
        }
        else if (button.id == BUTTON_CANCEL)
        {
            mc.thePlayer.closeScreen();
        }
        else if (button.id == BUTTON_REVERSE)
        {
            Collections.reverse(draft.rows);
            scrollRowOffset = 0;
            rebuildControls();
        }
        else if (button.id == BUTTON_ADD_ROW)
        {
            addRow();
        }
        else if (button.id >= BUTTON_LOADED_BASE && button.id < BUTTON_LOADED_BASE + MAX_ROWS_PER_PAGE)
        {
            InterchangeReportRow row = getVisibleRow(button.id - BUTTON_LOADED_BASE);
            if (row != null)
            {
                row.loaded = !row.loaded;
                rebuildControls();
            }
        }
        else if (button.id >= BUTTON_HAZMAT_BASE && button.id < BUTTON_HAZMAT_BASE + MAX_ROWS_PER_PAGE)
        {
            InterchangeReportRow row = getVisibleRow(button.id - BUTTON_HAZMAT_BASE);
            if (row != null)
            {
                row.hazmat = !row.hazmat;
                rebuildControls();
            }
        }
        else if (button.id >= BUTTON_MOVE_UP_BASE && button.id < BUTTON_MOVE_UP_BASE + MAX_ROWS_PER_PAGE)
        {
            moveRow(button.id - BUTTON_MOVE_UP_BASE, -1);
        }
        else if (button.id >= BUTTON_MOVE_DOWN_BASE && button.id < BUTTON_MOVE_DOWN_BASE + MAX_ROWS_PER_PAGE)
        {
            moveRow(button.id - BUTTON_MOVE_DOWN_BASE, 1);
        }
        else if (button.id >= BUTTON_DELETE_BASE && button.id < BUTTON_DELETE_BASE + MAX_ROWS_PER_PAGE)
        {
            deleteRow(button.id - BUTTON_DELETE_BASE);
        }
    }

    private void addRow()
    {
        InterchangeReportRow row = new InterchangeReportRow();
        row.car = "";
        row.carItemName = "Manual entry";
        row.loaded = false;
        row.typeCode = "O";
        row.typeName = "Other";
        row.destination = "";
        row.customer = "";
        row.cargo = "";
        row.hazmat = false;
        row.hazmatCode = "";
        row.handbrake = false;
        row.locomotive = false;
        draft.rows.add(row);
        scrollToRow(draft.rows.size() - 1);
        rebuildControls();
    }

    private void deleteRow(int visibleIndex)
    {
        if (visibleIndex >= rowControls.size())
        {
            return;
        }

        int rowIndex = rowControls.get(visibleIndex).rowIndex;
        if (rowIndex < 0 || rowIndex >= draft.rows.size())
        {
            return;
        }

        draft.rows.remove(rowIndex);
        clampScrollOffset();
        rebuildControls();
    }

    private void moveRow(int visibleIndex, int direction)
    {
        if (visibleIndex >= rowControls.size())
        {
            return;
        }

        int rowIndex = rowControls.get(visibleIndex).rowIndex;
        int targetIndex = rowIndex + direction;
        if (targetIndex < 0 || targetIndex >= draft.rows.size())
        {
            return;
        }

        Collections.swap(draft.rows, rowIndex, targetIndex);
        scrollToRow(targetIndex);
        rebuildControls();
    }

    private void exportReport()
    {
        saveHeaderFields();
        String report = new InterchangeTransferReportGenerator().FormatInterchangeTransferReport(draft);
        syncBoardSettings();
        new InterchangeTransferReportGenerator().createRawConsistReport(report);
        mc.thePlayer.addChatMessage(new ChatComponentText("Completed Interchange Report"));
        mc.thePlayer.closeScreen();
    }

    private void saveVisibleRows()
    {
        saveHeaderFields();

        // Text boxes are temporary view controls, so copy their values back into the draft model.
        for (RowControls controls : rowControls)
        {
            InterchangeReportRow row = draft.rows.get(controls.rowIndex);
            row.car = InterchangeTransferReportGenerator.limit(controls.car.getText(), InterchangeTransferReportGenerator.CAR_LIMIT);
            row.destination = InterchangeTransferReportGenerator.limit(controls.destination.getText(), InterchangeTransferReportGenerator.DESTINATION_LIMIT);
            row.customer = InterchangeTransferReportGenerator.limit(controls.customer.getText(), InterchangeTransferReportGenerator.CUSTOMER_LIMIT);
            row.cargo = InterchangeTransferReportGenerator.limit(controls.cargo.getText(), InterchangeTransferReportGenerator.CARGO_LIMIT);
        }
    }

    private void syncBoardSettings()
    {
        Traincraft.interchangeChannel.sendToServer(new PacketInterchangeReportBoardSettings(draft.boardSlot, draft.railroad));
    }

    /*
     * Rendering
     *
     * The clipboard/paper/table are custom drawn, while buttons still use GuiButton plumbing.
     * Text fields are drawn after super.drawScreen so typed text sits above the paper field cells.
     */
    // Draw order matters: custom backgrounds first, vanilla controls next, text fields and tooltips last.
    @Override
    public void drawScreen(int mouseX, int mouseY, float partialTicks)
    {
        drawDefaultBackground();

        int left = getSheetLeft();
        int top = getSheetTop();

        drawClipboard(left, top);
        drawGrid(left, top);
        drawCenteredPlainString("Interchange Report", left + SHEET_WIDTH / 2, top + 10, DARK_BROWN_TEXT);
        if (scrollRowOffset == 0)
        {
            drawHeaderFields(left, top);
        }

        drawColumnHeaders(left, top);
        drawRowNumbers(left, top);

        super.drawScreen(mouseX, mouseY, partialTicks);

        drawTextFields();

        drawScrollIndicator(left, top);
        drawCarTooltip(mouseX, mouseY);
        drawTypeTooltip(mouseX, mouseY);
    }

    private void drawHeaderFields(int left, int top)
    {
        drawPlainString("Railroad", left + 13, top + 29, MUTED_BROWN_TEXT);
        drawPlainString("Location", left + 322, top + 29, MUTED_BROWN_TEXT);
        drawFieldCell(left + 70, top + 23, 176, 18, true);
        drawFieldCell(left + 382, top + 23, 126, 18, true);
    }

    private void drawColumnHeaders(int left, int top)
    {
        int headerY = getGridHeaderTop(top) + 6;
        drawCenteredPlainString("#", left + getColumnCenter(COL_MOVE, COL_NUMBER), headerY, DARK_BROWN_TEXT);
        drawPlainString("CAR", left + COL_NUMBER + 5, headerY, DARK_BROWN_TEXT);
        drawCenteredPlainString("L/T", left + getColumnCenter(COL_CAR, COL_LOAD_TYPE), headerY, DARK_BROWN_TEXT);
        drawPlainString("DEST", left + COL_LOAD_TYPE + 5, headerY, DARK_BROWN_TEXT);
        drawPlainString("CSTMR", left + COL_DESTINATION + 5, headerY, DARK_BROWN_TEXT);
        drawPlainString("CARGO", left + COL_CUSTOMER + 5, headerY, DARK_BROWN_TEXT);
        drawCenteredPlainString("HAZ", left + getColumnCenter(COL_CARGO, COL_HAZMAT), headerY, DARK_BROWN_TEXT);
        drawCenteredPlainString("DEL", left + getColumnCenter(COL_HAZMAT, COL_DELETE), headerY, DARK_BROWN_TEXT);
    }

    private void drawRowNumbers(int left, int top)
    {
        int numberX = left + getColumnCenter(COL_MOVE, COL_NUMBER);
        for (RowControls controls : rowControls)
        {
            int rowNumber = controls.rowIndex + 1;
            int y = getRowTextTop(top, controls.rowIndex - scrollRowOffset);
            drawCenteredPlainString(String.valueOf(rowNumber), numberX, y, DARK_BROWN_TEXT);
        }
    }

    private void saveHeaderFields()
    {
        if (railroadField != null)
        {
            draft.railroad = railroadField.getText();
        }
        if (locationField != null)
        {
            draft.location = locationField.getText();
        }
    }

    private InterchangeReportRow getVisibleRow(int visibleIndex)
    {
        if (visibleIndex >= rowControls.size())
        {
            return null;
        }

        return draft.rows.get(rowControls.get(visibleIndex).rowIndex);
    }

    private void drawTextFields()
    {
        drawField(railroadField);
        drawField(locationField);
        for (RowControls controls : rowControls)
        {
            drawField(controls.car);
            drawField(controls.destination);
            drawField(controls.customer);
            drawField(controls.cargo);
        }
    }

    private void drawField(GuiTCTextField field)
    {
        if (field != null)
        {
            field.drawTextBox();
        }
    }

    private void drawPlainString(String text, int x, int y, int color)
    {
        fontRendererObj.drawString(text, x, y, color, false);
    }

    private void drawCenteredPlainString(String text, int x, int y, int color)
    {
        fontRendererObj.drawString(text, x - fontRendererObj.getStringWidth(text) / 2, y, color, false);
    }

    /*
     * Hover help
     *
     * The visible row controls carry hitboxes for non-editable cells too. Tooltips explain generated
     * values, like L/T type code and car item names, without adding more columns to the report.
     */
    private void drawTypeTooltip(int mouseX, int mouseY)
    {
        for (RowControls controls : rowControls)
        {
            if (mouseX >= controls.typeX && mouseY >= controls.typeY && mouseX < controls.typeX + controls.typeWidth && mouseY < controls.typeY + controls.typeHeight)
            {
                InterchangeReportRow row = draft.rows.get(controls.rowIndex);
                ArrayList<String> tooltip = new ArrayList<String>();
                tooltip.add("Load/type: " + getLoadTypeLabel(row));
                tooltip.add("Load status: " + (row.loaded ? "Loaded" : "Empty"));
                tooltip.add("Type code: " + row.typeCode);
                tooltip.add("Train type: " + (row.typeName == null || row.typeName.length() == 0 ? "Other" : row.typeName));
                tooltip.add("Click to toggle loaded/empty.");
                drawHoveringText(tooltip, mouseX, mouseY, fontRendererObj);
                return;
            }
        }
    }

    private void drawCarTooltip(int mouseX, int mouseY)
    {
        for (RowControls controls : rowControls)
        {
            if (mouseX >= controls.carX && mouseY >= controls.carY && mouseX < controls.carX + controls.carWidth && mouseY < controls.carY + controls.carHeight)
            {
                InterchangeReportRow row = draft.rows.get(controls.rowIndex);
                ArrayList<String> tooltip = new ArrayList<String>();
                tooltip.add("Car item: " + getCarItemName(row));
                if (row.handbrake)
                {
                    tooltip.add("Handbrake engaged");
                }
                if (row.car != null && row.car.length() > 0 && !row.car.equals(getCarItemName(row)))
                {
                    tooltip.add("Train note: " + row.car);
                }
                drawHoveringText(tooltip, mouseX, mouseY, fontRendererObj);
                return;
            }
        }
    }

    private String getLoadTypeLabel(InterchangeReportRow row)
    {
        String typeCode = row.typeCode == null || row.typeCode.length() == 0 ? "O" : row.typeCode;
        return (row.loaded ? "L" : "E") + "/" + typeCode;
    }

    private String getCarItemName(InterchangeReportRow row)
    {
        if (row.carItemName == null || row.carItemName.length() == 0)
        {
            return "Unknown";
        }

        return row.carItemName;
    }

    /*
     * Geometry and scrolling
     *
     * Scrolling is row-snapped, not pixel-snapped. Offset zero is special because it shows the
     * Railroad/Location metadata band; every other offset uses the taller continuation table.
     */
    private int getSheetLeft()
    {
        return Math.max(8, (width - SHEET_WIDTH) / 2);
    }

    private int getSheetTop()
    {
        return Math.max(12, (height - SHEET_HEIGHT) / 2);
    }

    private int getGridHeaderTop(int top)
    {
        // Scrolled views hide the metadata band and pull the grid upward.
        return scrollRowOffset == 0 ? top + 51 : top + 31;
    }

    private int getRowsTop(int top)
    {
        return getGridHeaderTop(top) + GRID_HEADER_HEIGHT;
    }

    private int getGridBottom(int top)
    {
        return getRowsTop(top) + getVisibleRowCount() * GRID_ROW_HEIGHT;
    }

    private int getRowTop(int top, int visibleIndex)
    {
        return getRowsTop(top) + visibleIndex * GRID_ROW_HEIGHT;
    }

    private int getRowControlTop(int top, int visibleIndex)
    {
        return getRowTop(top, visibleIndex) + GRID_ROW_CONTROL_Y_OFFSET;
    }

    private int getRowTextTop(int top, int visibleIndex)
    {
        return getRowTop(top, visibleIndex) + GRID_ROW_TEXT_Y_OFFSET;
    }

    private int getVisibleRowCount()
    {
        return scrollRowOffset == 0 ? FIRST_PAGE_ROWS : CONTINUATION_PAGE_ROWS;
    }

    private int getMaxScrollOffset()
    {
        if (draft.rows.size() <= FIRST_PAGE_ROWS)
        {
            return 0;
        }

        return Math.max(1, draft.rows.size() - CONTINUATION_PAGE_ROWS);
    }

    private void clampScrollOffset()
    {
        if (scrollRowOffset < 0)
        {
            scrollRowOffset = 0;
        }
        if (scrollRowOffset > getMaxScrollOffset())
        {
            scrollRowOffset = getMaxScrollOffset();
        }
    }

    private void scrollToRow(int rowIndex)
    {
        // Keep a row visible after add/move while preserving the first-view metadata state when possible.
        int visibleRows = rowIndex == 0 ? FIRST_PAGE_ROWS : CONTINUATION_PAGE_ROWS;
        if (rowIndex < scrollRowOffset)
        {
            scrollRowOffset = rowIndex;
        }
        else if (rowIndex >= scrollRowOffset + visibleRows)
        {
            scrollRowOffset = rowIndex - visibleRows + 1;
        }
        if (rowIndex >= FIRST_PAGE_ROWS && scrollRowOffset == 0)
        {
            scrollRowOffset = 1;
        }
        clampScrollOffset();
    }

    private void scrollRows(int deltaRows)
    {
        saveVisibleRows();
        scrollRowOffset += deltaRows;
        clampScrollOffset();
        rebuildControls();
    }

    private void drawScrollIndicator(int left, int top)
    {
        int maxScroll = getMaxScrollOffset();
        if (maxScroll <= 0)
        {
            return;
        }

        int trackX = left + SHEET_WIDTH - 8;
        int trackTop = getGridHeaderTop(top);
        int trackBottom = getGridBottom(top);
        int trackHeight = trackBottom - trackTop;
        int thumbHeight = Math.max(14, trackHeight * getVisibleRowCount() / Math.max(draft.rows.size(), getVisibleRowCount()));
        int thumbTravel = Math.max(1, trackHeight - thumbHeight);
        int thumbTop = trackTop + (thumbTravel * scrollRowOffset / maxScroll);

        drawRect(trackX, trackTop, trackX + 4, trackBottom, LIGHT_TAN_GRID_LINE);
        drawRect(trackX + 1, thumbTop, trackX + 3, thumbTop + thumbHeight, MUTED_BROWN_TEXT);
    }

    private void drawClipboard(int left, int top)
    {
        drawRect(left + 5, top + 6, left + SHEET_WIDTH + 5, top + SHEET_HEIGHT + 6, TRANSLUCENT_DARK_BROWN_PAPER_SHADOW);
        if (scrollRowOffset == 0)
        {
            drawRect(left, top, left + SHEET_WIDTH, top + SHEET_HEIGHT, BROWN_CLIPBOARD_BOARD);
            drawRect(left + 5, top + 7, left + SHEET_WIDTH - 5, top + SHEET_HEIGHT - 5, IVORY_PAPER);
            drawRect(left + 92, top, left + SHEET_WIDTH - 92, top + 13, DARK_GRAY_METAL_CLIP);
            drawRect(left + 105, top + 3, left + SHEET_WIDTH - 105, top + 6, LIGHT_GRAY_METAL_CLIP_HIGHLIGHT);
            drawRect(left + 128, top - 5, left + SHEET_WIDTH - 128, top + 8, CHARCOAL_METAL_CLIP_SHADOW);
            drawRect(left + 140, top - 2, left + SHEET_WIDTH - 140, top + 1, LIGHT_GRAY_METAL_CLIP_HIGHLIGHT);
        }
        else
        {
            drawRect(left, top, left + SHEET_WIDTH, top + SHEET_HEIGHT, BROWN_CLIPBOARD_BOARD);
            drawRect(left + 5, top, left + SHEET_WIDTH - 5, top + SHEET_HEIGHT - 5, IVORY_PAPER);
        }
    }

    // The grid is drawn separately from the row controls so empty scroll space still looks like paper.
    private void drawGrid(int left, int top)
    {
        int headerTop = getGridHeaderTop(top);
        int rowsTop = getRowsTop(top);
        int rowCount = getVisibleRowCount();
        int gridBottom = getGridBottom(top);

        drawRect(left + GRID_LEFT, headerTop, left + GRID_RIGHT, rowsTop, TAN_HEADER_FILL);
        drawRect(left + GRID_LEFT, rowsTop, left + GRID_RIGHT, gridBottom, TRANSLUCENT_WHITE_ROW_AREA_FILL);
        for (int i = 0; i < rowCount; i++)
        {
            int y = getRowTop(top, i);
            InterchangeReportRow row = scrollRowOffset + i < draft.rows.size() ? draft.rows.get(scrollRowOffset + i) : null;
            if (i % 2 == 1)
            {
                drawRect(left + GRID_LEFT, y, left + GRID_RIGHT, y + GRID_ROW_HEIGHT, PALE_TAN_ALT_ROW_FILL);
            }
            if (row != null && row.handbrake)
            {
                drawRect(left + GRID_LEFT, y, left + GRID_RIGHT, y + GRID_ROW_HEIGHT, PALE_RED_HAND_BRAKE_ROW_FILL);
            }
            drawRect(left + GRID_LEFT, y, left + GRID_RIGHT, y + 1, LIGHT_TAN_GRID_LINE);
        }
        drawRect(left + GRID_LEFT, gridBottom, left + GRID_RIGHT, gridBottom + 1, TAN_GRID_LINE);

        int[] columns = new int[] {COL_MOVE, COL_NUMBER, COL_CAR, COL_LOAD_TYPE, COL_DESTINATION, COL_CUSTOMER, COL_CARGO, COL_HAZMAT, COL_DELETE};
        for (int i = 0; i < columns.length; i++)
        {
            drawRect(left + columns[i], headerTop, left + columns[i] + 1, gridBottom + 1, TAN_GRID_LINE);
        }

        for (RowControls controls : rowControls)
        {
            int rowOffset = controls.rowIndex - scrollRowOffset;
            int y = getRowTop(top, rowOffset) + 1;
            drawColumnCell(left, y, COL_NUMBER, COL_CAR);
            drawColumnCell(left, y, COL_CAR, COL_LOAD_TYPE);
            drawColumnCell(left, y, COL_LOAD_TYPE, COL_DESTINATION);
            drawColumnCell(left, y, COL_DESTINATION, COL_CUSTOMER);
            drawColumnCell(left, y, COL_CUSTOMER, COL_CARGO);
        }
    }

    private void drawColumnCell(int left, int y, int columnStart, int columnEnd)
    {
        drawFieldCell(left + columnStart + 3, y + 1, getColumnInnerWidth(columnStart, columnEnd), 17, false);
    }

    private void drawFieldCell(int x, int y, int width, int height, boolean headerField)
    {
        int fill = headerField ? LIGHT_IVORY_HEADER_FIELD_FILL : TRANSLUCENT_IVORY_ROW_FIELD_FILL;
        drawRect(x, y, x + width, y + height, fill);
        drawRect(x, y + height - 1, x + width, y + height, LIGHT_TAN_GRID_LINE);
    }

    /*
     * Input delegation
     *
     * Text fields are not part of buttonList, so keyboard, mouse, and cursor ticks are forwarded
     * explicitly to the header fields and currently visible row fields.
     */
    @Override
    public void updateScreen()
    {
        tickField(railroadField);
        tickField(locationField);
        for (RowControls controls : rowControls)
        {
            tickField(controls.car);
            tickField(controls.destination);
            tickField(controls.customer);
            tickField(controls.cargo);
        }
    }

    private void tickField(GuiTCTextField field)
    {
        if (field != null && field.isFocused())
        {
            field.updateCursorCounter();
        }
    }

    @Override
    protected void keyTyped(char typedChar, int keyCode)
    {
        if (typeField(railroadField, typedChar, keyCode)
                || typeField(locationField, typedChar, keyCode)
                || typeVisibleRowField(typedChar, keyCode))
        {
            return;
        }

        if (typedChar == 1 || keyCode == Keyboard.KEY_ESCAPE)
        {
            mc.thePlayer.closeScreen();
            return;
        }

        super.keyTyped(typedChar, keyCode);
    }

    private boolean typeVisibleRowField(char typedChar, int keyCode)
    {
        for (RowControls controls : rowControls)
        {
            if (typeField(controls.car, typedChar, keyCode)
                    || typeField(controls.destination, typedChar, keyCode)
                    || typeField(controls.customer, typedChar, keyCode)
                    || typeField(controls.cargo, typedChar, keyCode))
            {
                return true;
            }
        }

        return false;
    }

    private boolean typeField(GuiTCTextField field, char typedChar, int keyCode)
    {
        return field != null && field.isFocused() && field.textboxKeyTyped(typedChar, keyCode);
    }

    @Override
    public void handleMouseInput()
    {
        int wheel = Mouse.getEventDWheel();
        if (wheel != 0)
        {
            scrollRows(wheel > 0 ? -1 : 1);
        }

        super.handleMouseInput();
    }

    @Override
    protected void mouseClicked(int mouseX, int mouseY, int mouseButton)
    {
        if (railroadField != null)
        {
            railroadField.mouseClicked(mouseX, mouseY, mouseButton);
        }
        if (locationField != null)
        {
            locationField.mouseClicked(mouseX, mouseY, mouseButton);
        }
        for (RowControls controls : rowControls)
        {
            controls.car.mouseClicked(mouseX, mouseY, mouseButton);
            controls.destination.mouseClicked(mouseX, mouseY, mouseButton);
            controls.customer.mouseClicked(mouseX, mouseY, mouseButton);
            controls.cargo.mouseClicked(mouseX, mouseY, mouseButton);
        }

        super.mouseClicked(mouseX, mouseY, mouseButton);
    }

    @Override
    public boolean doesGuiPauseGame()
    {
        return false;
    }

    // RowControls keeps the field widgets and hover hitboxes tied to their backing draft row.
    private static class RowControls
    {
        private int rowIndex;
        private int carX;
        private int carY;
        private int carWidth;
        private int carHeight;
        private int typeX;
        private int typeY;
        private int typeWidth;
        private int typeHeight;
        private GuiTCTextField car;
        private GuiTCTextField destination;
        private GuiTCTextField customer;
        private GuiTCTextField cargo;
    }

    // Plain button renderer that matches the clipboard sheet and avoids Minecraft's default blue buttons.
    private static class ClipboardButton extends GuiButton
    {
        private enum Style
        {
            NORMAL,
            PRIMARY,
            WARNING,
            SMALL
        }

        private final Style style;
        private final int textColorOverride;

        public ClipboardButton(int id, int x, int y, int width, int height, String text, Style style)
        {
            this(id, x, y, width, height, text, style, -1);
        }

        public ClipboardButton(int id, int x, int y, int width, int height, String text, Style style, int textColorOverride)
        {
            super(id, x, y, width, height, text);
            this.style = style;
            this.textColorOverride = textColorOverride;
        }

        @Override
        public void drawButton(Minecraft minecraft, int mouseX, int mouseY)
        {
            if (!visible)
            {
                return;
            }

            FontRenderer font = minecraft.fontRenderer;
            boolean hover = enabled && mouseX >= xPosition && mouseY >= yPosition && mouseX < xPosition + width && mouseY < yPosition + height;
            int fill = getFill(hover);
            int border = enabled ? BROWN_BUTTON_BORDER : MUTED_TAN_DISABLED_BUTTON_BORDER;
            drawRect(xPosition, yPosition, xPosition + width, yPosition + height, border);
            drawRect(xPosition + 1, yPosition + 1, xPosition + width - 1, yPosition + height - 1, fill);
            drawRect(xPosition + 1, yPosition + 1, xPosition + width - 1, yPosition + 2, TRANSLUCENT_WHITE_BUTTON_HIGHLIGHT);

            int color = enabled ? (textColorOverride != -1 ? textColorOverride : DARK_BROWN_TEXT) : MUTED_TAN_DISABLED_TEXT;
            int textX = xPosition + (width - font.getStringWidth(displayString)) / 2;
            int textY = yPosition + (height - 8) / 2;
            font.drawString(displayString, textX, textY, color, false);
        }

        private int getFill(boolean hover)
        {
            if (!enabled)
            {
                return PALE_TAN_DISABLED_BUTTON_FILL;
            }
            if (style == Style.PRIMARY)
            {
                return hover ? LIGHT_GREEN_EXPORT_BUTTON_HOVER_FILL : GREEN_EXPORT_BUTTON_FILL;
            }
            if (style == Style.WARNING)
            {
                return hover ? LIGHT_ORANGE_WARNING_BUTTON_HOVER_FILL : ORANGE_WARNING_BUTTON_FILL;
            }
            if (style == Style.SMALL)
            {
                return hover ? LIGHT_TAN_SMALL_BUTTON_HOVER_FILL : TAN_SMALL_BUTTON_FILL;
            }
            return hover ? LIGHT_TAN_BUTTON_HOVER_FILL : TAN_BUTTON_FILL;
        }
    }
}
