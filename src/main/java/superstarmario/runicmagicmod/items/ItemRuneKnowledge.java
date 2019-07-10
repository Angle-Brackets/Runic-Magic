package superstarmario.runicmagicmod.items;

import net.minecraft.item.Item;
import superstarmario.runicmagicmod.RunicMagicMod;

public class ItemRuneKnowledge extends Item{

	public ItemRuneKnowledge(){
		super();
		setUnlocalizedName("rune_of_knowledge"); 
		setRegistryName("rune_of_knowledge");
		setCreativeTab(RunicMagicMod.runicMagicTab);
		
		RunicMagicMod.items.add(this);
	}
	
	
	
	
}
