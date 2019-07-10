package superstarmario.runicmagicmod.proxy;

import java.lang.reflect.Field;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.RenderItem;
import net.minecraft.client.renderer.block.model.ModelBakery;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraft.block.Block;
import superstarmario.runicmagicmod.RunicMagicMod;
import superstarmario.runicmagicmod.util.Reference;
import superstarmario.runicmagicmod.util.Variant;

public class ClientProxy extends CommonProxy{
	
	public void registerTextures(){
		try{
			for(Field f : RunicMagicMod.class.getFields()){
				if(f.getType() != null){
					if(f.getType().getName().contains("Item")){
						Variant v = f.getAnnotation(Variant.class);
						if(v != null){
							if(v.skip()){
								continue;
							}
							for(int i = 0; i < v.value().length; i++){
								ModelLoader.setCustomModelResourceLocation((Item)f.get(null), i, new ModelResourceLocation(Reference.MOD_ID + ":" + v.value()[i], "inventory"));
							}
						}
						else{
							ModelLoader.setCustomModelResourceLocation((Item)f.get(null), 0, new ModelResourceLocation(Reference.MOD_ID + ":" + ((Item)f.get(null)).getUnlocalizedName().replace("item.", ""), "inventory"));
						}
					}
					else if(f.getType().getName().contains("Block")){
						Variant v = f.getAnnotation(Variant.class);
						if(v != null){
							if(v.skip()){
								continue;
							}
							for(int i = 0; i < v.value().length; i++){
								ModelLoader.setCustomModelResourceLocation((Item)f.get(null), i, new ModelResourceLocation(Reference.MOD_ID + ":" + v.value()[i], "inventory"));
							}
						}
						else{
							ModelLoader.setCustomModelResourceLocation((Item)f.get(null), 0, new ModelResourceLocation(Reference.MOD_ID + ":" + ((Block)f.get(null)).getUnlocalizedName().replace("tile.", ""), "inventory"));
						}
					}
				}
			}
		}
		catch(IllegalAccessException e){
			System.err.println("Failed to register a texture for an item or block.");
		}
	}

	@Override
	public void registerVariants(){
		try{
			for(Field f : RunicMagicMod.class.getFields()){
				if(f.getType() != null){
					if(f.getType().getName().contains("Item")){
						Variant v = f.getAnnotation(Variant.class);
						if(v != null){
							if(v.skip()){
								continue;
							}
							ResourceLocation[] s = new ResourceLocation[v.value().length];
							for(int i = 0; i < s.length; i++){
								s[i] = new ResourceLocation(Reference.MOD_ID, v.value()[i]);
								
							}
							ModelBakery.registerItemVariants((Item)f.get(null), s);
						}
					}
					else if(f.getType().getName().contains("Block")){
						Variant v = f.getAnnotation(Variant.class);
						if(v != null){
							if(v.skip()){
								continue;
							}
							ResourceLocation[] s = new ResourceLocation[v.value().length];
							for(int i = 0; i < s.length; i++){
								s[i] = new ResourceLocation(Reference.MOD_ID, v.value()[i]);
								
							}
							ModelBakery.registerItemVariants(Item.getItemFromBlock((Block)f.get(null)), s);
						}
					}
				}
			}
		}
		catch(IllegalAccessException e){
			System.err.println("Failed to register a variant of an item or block.");
		}
	}
	
}
