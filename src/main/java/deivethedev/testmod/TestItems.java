package deivethedev.testmod;

import net.minecraft.core.item.Item;
import turniplabs.halplibe.helper.ItemBuilder;

import static deivethedev.testmod.TestMod.*;

public class TestItems {

	//Declaring items

	public static Item testItem;

	public static void initItems() {

		//Like block building but shorter

		/*
		testItem = new ItemBuilder(MOD_ID)
			.build(new Item("item.testitem", MOD_ID + ":item/test_item", nextID()));

		 */

		LOGGER.info("Items initialized.");
	}
}
