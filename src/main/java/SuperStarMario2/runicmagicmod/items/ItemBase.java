package SuperStarMario2.runicmagicmod.items;

import SuperStarMario2.runicmagicmod.Main;
import SuperStarMario2.runicmagicmod.init.ModItems;
import SuperStarMario2.runicmagicmod.util.IHasModel;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemBase extends Item implements IHasModel{

	public ItemBase(String name){
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(Main.runicMagicTab);
		
		ModItems.ITEMS.add(this);
	}
	
	
	
	@Override
	public void registerModels() {
		Main.proxy.registerItemRenderer(this, 0, "inventory");
	}

	
	

}
