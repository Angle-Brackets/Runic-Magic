package superstarmario.runicmagicmod.items;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import superstarmario.runicmagicmod.RunicMagicMod;
import superstarmario.runicmagicmod.init.ModItems;

public class ItemChisel extends Item{

	public ItemChisel(String name, int dura){
		super();
		setUnlocalizedName(name);
		setRegistryName(name);
		setMaxDamage(dura);
		setMaxStackSize(1);
		
		RunicMagicMod.items.add(this);
		setCreativeTab(RunicMagicMod.runicMagicTab);
	}
	
	@Override
	public boolean hasContainerItem(ItemStack item) {
		return true;
	}
	
	@Override
	public ItemStack getContainerItem(ItemStack item) {
		return new ItemStack(this, 1, item.getItemDamage() + 1);
	}
}
