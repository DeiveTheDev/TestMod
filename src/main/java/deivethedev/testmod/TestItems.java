package deivethedev.testmod;

import net.minecraft.core.item.Item;
import turniplabs.halplibe.helper.ItemBuilder;

import static deivethedev.testmod.TestMod.MOD_ID;
import static deivethedev.testmod.TestMod.LOGGER;

public class TestItems {

	// Importing the starting id that we set in TestConfig
	private static int startingID = TestConfig.CFG.getInt("IDs.startingItemID");
	private static int nextID() {return startingID++;} // just a little function to increase the id every new item

	// Declaring items

	public static Item banana;

	public static void initItems() {

		// Like block building but shorter, please check TestBlocks before this

		// Creating a simple item:
		banana = new ItemBuilder(MOD_ID)
			.build(new Item("item.banana", MOD_ID + ":item/banana", nextID()));

		LOGGER.info("Items initialized.");
	}
}
