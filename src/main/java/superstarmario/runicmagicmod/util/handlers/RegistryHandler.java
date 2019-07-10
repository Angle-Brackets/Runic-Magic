package superstarmario.runicmagicmod.util.handlers;

import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import superstarmario.runicmagicmod.RunicMagicMod;
import superstarmario.runicmagicmod.init.ModItems;


@EventBusSubscriber
public class RegistryHandler {

	@SubscribeEvent
	public static void onItemRegister(RegistryEvent.Register<Item> event){
		event.getRegistry().registerAll(RunicMagicMod.items.toArray(new Item[0]));
	}
	
	@SubscribeEvent
	public static void onModelRegister(ModelRegistryEvent event){
		RunicMagicMod.proxy.registerTextures();
	}
}
