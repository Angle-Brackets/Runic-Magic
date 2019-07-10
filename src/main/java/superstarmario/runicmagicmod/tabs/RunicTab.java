package superstarmario.runicmagicmod.tabs;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import superstarmario.runicmagicmod.RunicMagicMod;
import superstarmario.runicmagicmod.init.ModItems;

public class RunicTab extends CreativeTabs{

	public RunicTab(String label) {
		super("runictab");
		
	}
	
	public ItemStack getTabIconItem(){
			return new ItemStack(RunicMagicMod.rune, 1, 0);
	}
}
