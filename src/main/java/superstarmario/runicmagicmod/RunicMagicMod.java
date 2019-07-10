package superstarmario.runicmagicmod;

import java.util.ArrayList;
import java.util.List;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import superstarmario.runicmagicmod.items.*;
import superstarmario.runicmagicmod.proxy.CommonProxy;
import superstarmario.runicmagicmod.tabs.RunicTab;
import superstarmario.runicmagicmod.util.Reference;
import superstarmario.runicmagicmod.util.Variant;

@Mod(modid = Reference.MOD_ID, name = Reference.NAME, version = Reference.VERSION)

public class RunicMagicMod {

	public static CreativeTabs runicMagicTab = new RunicTab("runictab");
	public static List<Item> items = new ArrayList<Item>();
	
	@Instance
	public static RunicMagicMod instance;
	
	@SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.COMMON_PROXY_CLASS)
	public static CommonProxy proxy;
	
	
	
	//Items
	@Variant({"blank_rune", "ancient_rune", "damaged_rune"})
	public static Item rune = new ItemRune();
	
	public static Item stoneChisel = new ItemChisel("stone_chisel", 25);
	
	public static Item runeOfKnowledge = new ItemRuneKnowledge();
	
	
	@EventHandler
	public static void preInit(FMLPreInitializationEvent event){
		proxy.registerVariants();
	}

	@EventHandler
	public static void init(FMLInitializationEvent event){
		
	}
	
	@EventHandler
	public static void postInit(FMLPostInitializationEvent event){
		
	}
	
}
