package deivethedev.testmod;

import net.minecraft.core.block.Block;
import net.minecraft.core.block.BlockLogic;
import net.minecraft.core.block.material.Material;
import net.minecraft.core.block.tag.BlockTags;
import turniplabs.halplibe.helper.BlockBuilder;

import static deivethedev.testmod.TestMod.*;

public class TestBlocks {

	//Declaring blocks

	public static Block<?> testBlock;

	public static void initBlocks() {

		//Creating a block builder

		BlockBuilder test_builder = new BlockBuilder(MOD_ID)
			.setHardness(2.0f)
			.setResistance(1.0f)
			.setLuminance(0)
			.addTags(BlockTags.MINEABLE_BY_PICKAXE);

		//Setting the builded block to the block variable

		testBlock = test_builder.build("block.testblock", "block/test_block", nextID(), b -> new BlockLogic(b, Material.metal));

		LOGGER.info("Blocks initialized.");
	}
}
