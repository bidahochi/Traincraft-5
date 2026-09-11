package train.common.track.attachment;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

/** Contract for an item that installs itself as an attachment on an existing track cell. */
public interface ITrackAttachmentItem
{
	/**
	 * Resolves the attachment that would be installed by the supplied track-cell interaction without changing the world.
	 *
	 * @param stack held attachment item
	 * @param world world containing the selected track cell
	 * @param cellX selected track-cell X coordinate
	 * @param cellY selected track-cell Y coordinate
	 * @param cellZ selected track-cell Z coordinate
	 * @param selectedSide selected block face
	 * @param hitX selected X position within the cell
	 * @param hitZ selected Z position within the cell
	 * @return non-installed attachment candidate, or {@code null} when this cell has no supported attachment path
	 */
	public TrackAttachment resolveTrackAttachment(ItemStack stack, World world,
			int cellX, int cellY, int cellZ, int selectedSide, float hitX, float hitZ);

	/**
	 * Handles installation after a rail block has already consumed the interaction.
	 *
	 * @param stack held attachment item
	 * @param player player performing the interaction
	 * @param world world containing the selected track cell
	 * @param cellX selected track-cell X coordinate
	 * @param cellY selected track-cell Y coordinate
	 * @param cellZ selected track-cell Z coordinate
	 * @param selectedSide selected block face
	 * @param hitX selected X position within the cell
	 * @param hitZ selected Z position within the cell
	 * @return whether the interaction belonged to a valid track cell
	 */
	public boolean installOnTrackCell(ItemStack stack, EntityPlayer player, World world,
			int cellX, int cellY, int cellZ, int selectedSide, float hitX, float hitZ);
}
