package train.common.api.crafting;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import train.common.recipes.ITCRecipe.TCStack;

public class RollingStockRecipe
{
    public RollingStockRecipe()
    {

    }

    private ItemStack planks;
    private ItemStack wheels;
    private ItemStack frame;
    private ItemStack coupler;
    private ItemStack chimney;
    private ItemStack cab;
    private ItemStack boiler;
    private ItemStack firebox;
    private ItemStack additional;
    private ItemStack dye;

    public ItemStack getExtraItem()
    {
        return extraItem;
    }

    public void setExtraItem(ItemStack extraItem)
    {
        this.extraItem = extraItem;
    }

    public ItemStack extraItem;

    public void setPlanks(ItemStack planks)
    {
        this.planks = planks;
    }

    public void setWheels(ItemStack wheels)
    {
        this.wheels = wheels;
    }

    public void setFrame(ItemStack frame)
    {
        this.frame = frame;
    }

    public void setCoupler(ItemStack coupler)
    {
        this.coupler = coupler;
    }

    public void setChimney(ItemStack chimney)
    {
        this.chimney = chimney;
    }

    public void setCab(ItemStack cab)
    {
        this.cab = cab;
    }

    public void setBoiler(ItemStack boiler)
    {
        this.boiler = boiler;
    }

    public void setFirebox(ItemStack firebox)
    {
        this.firebox = firebox;
    }

    public void setAdditional(ItemStack additional)
    {
        this.additional = additional;
    }

    public void setDye(ItemStack dye)
    {
        this.dye = dye;
    }

    // SPACER
    public void setPlanks(Item planks)
    {
        this.planks = TCStack.ItemStack(planks);
    }

    public void setWheels(Item wheels)
    {
        this.wheels = TCStack.ItemStack(wheels);
    }

    public void setFrame(Item frame)
    {
        this.frame = TCStack.ItemStack(frame);
    }

    public void setCoupler(Item coupler)
    {
        this.coupler = TCStack.ItemStack(coupler);
    }

    public void setChimney(Item chimney)
    {
        this.chimney = TCStack.ItemStack(chimney);
    }

    public void setCab(Item cab)
    {
        this.cab = TCStack.ItemStack(cab);
    }

    public void setBoiler(Item boiler)
    {
        this.boiler = TCStack.ItemStack(boiler);
    }

    public void setFirebox(Item firebox)
    {
        this.firebox = TCStack.ItemStack(firebox);
    }

    public void setAdditional(Item additional)
    {
        this.additional = TCStack.ItemStack(additional);
    }

    public void setDye(Item dye)
    {
        this.dye = TCStack.ItemStack(dye);
    }


}
