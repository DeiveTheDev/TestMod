package deivethedev.tutorialmod;

import net.minecraft.core.block.Block;
import net.minecraft.core.block.BlockLogic;
import net.minecraft.core.block.material.Material;
import net.minecraft.core.block.tag.BlockTags;
import turniplabs.halplibe.helper.BlockBuilder;

import static deivethedev.tutorialmod.TutorialMod.MOD_ID; // need to static because it is just one variable
import static deivethedev.tutorialmod.TutorialMod.LOGGER; // same

public class TutorialBlocks {

	// START HERE
	// For each block you will need a texture, a name, and an id.
	// the id could be set manually, but if in the future you need to change them, you would need to do this manually as well
	// so we need make it automatically
	// go to TestConfig class, change the values and go back here

	// Importing the starting id that we set in TestConfig
	private static int startingID = TutorialConfig.CFG.getInt("IDs.startingBlockID");
	private static int nextID() {return startingID++;} // just a little function to increase the id every new item

	// Declaring blocks

	public static Block<?> tutorialBlock; // basic block
	public static Block<?> bananaBlock; // basic block

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
		tutorialBlock = test_builder.build("block.tutorialblock", "block/tutorial_block", nextID(), b -> new BlockLogic(b, Material.metal));
		//								traslationKey      name               id        block logic ( you don't need to know for now, just that )
		// 									 |													    ( material sets the sound when placing the block)
		// 									 V
		// 								go to resources > lang > testmod > en_US.lang to see how it works

		// So far you have only registered the block, it appears in the inventory but does not have a texture. For that check TestModels > initBlockModels

		BlockBuilder banana_builder = new BlockBuilder(MOD_ID)
			.setHardness(1.0f)
			.setResistance(0.0f)
			.setLuminance(15) // banana aura
			.addTags(BlockTags.MINEABLE_BY_SWORD);
		bananaBlock = banana_builder.build("block.bananablock", "block/banana_block", nextID(), b -> new BlockLogic(b, Material.cake));

		LOGGER.info("Blocks initialized.");
	}
}
