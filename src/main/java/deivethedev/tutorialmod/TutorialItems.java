package deivethedev.tutorialmod;

import net.minecraft.core.item.Item;
import net.minecraft.core.item.ItemFood;
import turniplabs.halplibe.helper.ItemBuilder;

import static deivethedev.tutorialmod.TutorialMod.MOD_ID;
import static deivethedev.tutorialmod.TutorialMod.LOGGER;

public class TutorialItems {

	// Importing the starting id that we set in TestConfig
	private static int startingID = TutorialConfig.CFG.getInt("IDs.startingItemID");
	private static int nextID() {return startingID++;} // just a little function to increase the id every new item

	// Declaring items

	public static Item tutorialItem; // basic item
	public static Item banana; // food
	public static Item cookedBanana; // food
	public static Item woodChips; // fuel


	public static void initItems() {

		// Creating a simple block with no functionality

		// Like block building but shorter, please check TestBlocks before this

		// Creating a simple item (no durability and nothing else, just an image and name):
		tutorialItem = new ItemBuilder(MOD_ID)
			.build(new Item("item.tutorialitem", MOD_ID + ":item/tutorial_item", nextID()));
		//							Δ							Δ					 Δ
		//					  translation key		   (String) NamespaceID	      item id

		// Creating a food

		banana = new ItemBuilder(MOD_ID)
			.build(new ItemFood("item.banana", MOD_ID + ":item/banana", nextID(), 1, 20, false, 9));
		//						   Δ					 Δ			       Δ	  Δ	  Δ	   Δ     Δ
		//					 translation key	(String) NamespaceID	item id   |	  |	   |     stack max size
		//																		  |   |    |
		//														  health amount  /    |    favorite wolf meal
		//														 (in half hearts)     |
		//																			ticks per half heart (minecraft runs at 20 ticks per second)

		cookedBanana = new ItemBuilder(MOD_ID)
			.build(new ItemFood("item.cookedbanana", MOD_ID + ":item/cooked_banana", nextID(), 3, 20, false, 3));

		// Creating a fuel

		// like a basic item
		woodChips = new ItemBuilder(MOD_ID)
			.build(new Item("item.woodchips", MOD_ID + ":item/wood_chips", nextID()));
		// then you need to register it as a fuel. Go to TutorialRecipes


		LOGGER.info("Items initialized.");
	}
}
