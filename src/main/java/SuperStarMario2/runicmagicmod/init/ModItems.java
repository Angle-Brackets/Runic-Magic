package SuperStarMario2.runicmagicmod.init;

import java.util.List;

import SuperStarMario2.runicmagicmod.items.ItemBase;

import java.util.ArrayList;
import net.minecraft.item.Item;


public class ModItems {

	public static final List<Item> ITEMS = new ArrayList<Item>();
	
	public static final Item BLANK_RUNE = new ItemBase("blankRune");
	public static final Item DAMAGED_RUNE = new ItemBase("damagedRune");
	public static final Item ANCIENT_RUNE = new ItemBase("ancientRune");
	
}
