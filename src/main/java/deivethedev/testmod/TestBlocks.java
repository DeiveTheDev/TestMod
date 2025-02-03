package deivethedev.testmod;

import net.minecraft.core.block.Block;
import net.minecraft.core.block.BlockLogic;
import net.minecraft.core.block.material.Material;
import net.minecraft.core.block.tag.BlockTags;
import turniplabs.halplibe.helper.BlockBuilder;

import static deivethedev.testmod.TestMod.MOD_ID; // need to static because it is just one variable
import static deivethedev.testmod.TestMod.LOGGER; // same

public class TestBlocks {

	// Importing the starting id that we set in TestConfig
	private static int startingID = TestConfig.CFG.getInt("IDs.startingBlockID");
	private static int nextID() {return startingID++;} // just a little function to increase the id every new item

	// Declaring blocks

	public static Block<?> testBlock;

	public static void initBlocks() {

		// Creating a simple block with no functionality:

		// Creating a BlockBuilder
		// The BlockBuilder is just an easier way to create blocks provided by HalpLibe

		BlockBuilder test_builder = new BlockBuilder(MOD_ID) // MOD_ID is being imported from TestMod, look in the top of the script.

			// Setting properties of the block. Check the possible properties: Ctrl + LeftClick in BlockBuilder
			.setHardness(2.0f)
			.setResistance(1.0f)
			.setLuminance(0)

			// Sets the block tags (the game uses it to interact with the block). Check the possible tags: Ctrl + LeftClick in BlockTags
			.addTags(BlockTags.MINEABLE_BY_PICKAXE);

		// The build function just create an Item with the created builder properties
		testBlock = test_builder.build("block.testblock", "block/test_block", nextID(), b -> new BlockLogic(b, Material.metal));
		//								traslationKey      name               id        block logic ( you don't need to know for now, just that )
		// 									 |													    ( material sets the sound when placing the block)
		// 									 V
		// 								go to resources > lang > testmod > en_US.lang to see how it works

		// So far you have only registered the block, it appears in the inventory but does not have a texture. For that check TestModels > initBlockModels


		LOGGER.info("Blocks initialized.");
	}
}
