package deivethedev.testmod;

import net.minecraft.client.render.EntityRenderDispatcher;
import net.minecraft.client.render.TileEntityRenderDispatcher;
import net.minecraft.client.render.block.color.BlockColorDispatcher;
import net.minecraft.client.render.block.model.BlockModelDispatcher;
import net.minecraft.client.render.block.model.BlockModelStandard;
import net.minecraft.client.render.item.model.ItemModelDispatcher;
import net.minecraft.client.render.item.model.ItemModelStandard;

import net.minecraft.client.render.texture.stitcher.TextureRegistry;
import net.minecraft.core.util.collection.NamespaceID;
import net.minecraft.core.util.helper.Side;
import turniplabs.halplibe.helper.ModelHelper;
import turniplabs.halplibe.util.ModelEntrypoint;

import static deivethedev.testmod.TestMod.MOD_ID;

// Importing blocks and items

import static deivethedev.testmod.TestBlocks.*;
import static deivethedev.testmod.TestItems.*;

public class TestModels implements ModelEntrypoint {

	// If the dispatcher arg is conflicting with the override, please update your halplibe to 5.1.2
	// Go to the file gradle.properties > halplibe_version=5.1.2
	// Then in the right tab if intelliJ > Gradle > Sync All Gradle Projects (it updates de halplibe)

	// Please register the model entrypoint in fabric.mod.json:

	// "initModels": [
	//	"deivethedev.testmod.TestModels"
	// ],

	@Override
	public void initBlockModels(BlockModelDispatcher dispatcher) {

		//The block variable is being imported from TestBlocks, look in the top of the script

		ModelHelper.setBlockModel(testBlock, () -> new BlockModelStandard<>(testBlock)
			.setTex(0,"testmod:block/test_block", Side.sides)
		);
	}

	@Override
	public void initItemModels(ItemModelDispatcher dispatcher) {

		//The item variable is being imported from TestItems, look in the top of the script

		ModelHelper.setItemModel(banana, () -> {
			ItemModelStandard model = new ItemModelStandard(banana, MOD_ID);
			model.icon = TextureRegistry.getTexture(new NamespaceID(MOD_ID, "item/banana"));
			return model;
		});
	}

	@Override
	public void initEntityModels(EntityRenderDispatcher dispatcher) {}

	@Override
	public void initTileEntityModels(TileEntityRenderDispatcher dispatcher) {}

	@Override
	public void initBlockColors(BlockColorDispatcher dispatcher) {}
}
