package superstarmario.runicmagicmod.items;

import java.util.List;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.NonNullList;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import superstarmario.runicmagicmod.RunicMagicMod;

public class ItemRune extends Item{

	public ItemRune(){
		super();
		setUnlocalizedName("rune"); //Name is like this for spacing and ID reasons.
		setRegistryName("rune");
		setCreativeTab(RunicMagicMod.runicMagicTab);
		setHasSubtypes(true);
		
		RunicMagicMod.items.add(this);
	}
	
	private String[] metanames = {"blank", "ancient", "damaged"};
	
	@Override
	@SideOnly(Side.CLIENT)
	public void getSubItems(CreativeTabs tab, NonNullList<ItemStack> items){
	    if(this.isInCreativeTab(tab)){
	        for(int i = 0; i < metanames.length; i++){
	            items.add(new ItemStack(this, 1, i));
	        }
	    }
	}
	
	@Override
	public int getMetadata(int meta){
		return meta;
	}
	
	@Override
	public String getUnlocalizedName(ItemStack s){
		//System.out.println("NAME: \n" + "item." + metanames[s.getMetadata()] + super.getUnlocalizedName() + ".");
		return "item." + metanames[s.getMetadata()] + "_" + super.getUnlocalizedName().replace("item.", "");
	}
	
}
