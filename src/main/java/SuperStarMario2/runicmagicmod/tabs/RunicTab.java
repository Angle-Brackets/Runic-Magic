package SuperStarMario2.runicmagicmod.tabs;

import SuperStarMario2.runicmagicmod.init.ModItems;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class RunicTab extends CreativeTabs{

	public RunicTab(String label) {
		super("runictab");
		
	}
	
	public ItemStack getTabIconItem(){
			return new ItemStack(ModItems.BLANK_RUNE);
	}
}
