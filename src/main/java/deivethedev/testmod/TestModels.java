package deivethedev.testmod;

import net.minecraft.client.render.block.model.BlockModelStandard;
import net.minecraft.client.render.item.model.ItemModelDispatcher;
import net.minecraft.client.render.item.model.ItemModelStandard;
import net.minecraft.client.render.texture.stitcher.TextureRegistry;
import net.minecraft.core.util.collection.NamespaceID;
import net.minecraft.core.util.helper.Side;
import turniplabs.halplibe.helper.ModelHelper;
import turniplabs.halplibe.util.ModelEntrypoint;

import static deivethedev.testmod.TestBlocks.*;
import static deivethedev.testmod.TestItems.*;
import static deivethedev.testmod.TestMod.*;

public class TestModels implements ModelEntrypoint {

	@Override
	public void initBlockModels() {
		ModelHelper.setBlockModel(testBlock, () -> new BlockModelStandard<>(testBlock)
			.setTex(0,"testmod:block/test_blocktop", Side.TOP)
			.setTex(0,"testmod:block/test_blockbottom", Side.BOTTOM)
			.setTex(0,"testmod:block/test_blockside", Side.WEST, Side.SOUTH, Side.EAST)
			.setTex(0,"testmod:block/test_blockfront", Side.NORTH)
		);

		LOGGER.info("Block Models initialized.");
	}

	@Override
	public void initItemModels() {
		LOGGER.info("Initializing item models.");

		ModelHelper.setItemModel(testItem, () -> {
			ItemModelStandard model = new ItemModelStandard(testItem, MOD_ID).setFull3D();
			model.icon = TextureRegistry.getTexture(new NamespaceID(MOD_ID, "item/test_item"));
			return model;
		});

		LOGGER.info("Items Models initialized.");
	};

	@Override
	public void initEntityModels() {};

	@Override
	public void initTileEntityModels() {};

	@Override
	public void initBlockColors() {};
}
