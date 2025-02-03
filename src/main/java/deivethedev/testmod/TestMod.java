package deivethedev.testmod;

import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import turniplabs.halplibe.util.GameStartEntrypoint;
import turniplabs.halplibe.util.RecipeEntrypoint;

public class TestMod implements ModInitializer, RecipeEntrypoint, GameStartEntrypoint {
    public static final String MOD_ID = "testmod";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	// Just a quick explanation
	// This is your Main script, current it is handling almost all entrypoints defined in fabric.mod.json but you can separate then later if you want
	// The ModelEntrypoint is being handled in TestModels just to be more organized.

	// Don't forget that with Ctrl + Left-Click on a field or method you can quickly get information on when and where that field or method is assign or used.

    @Override
    public void onInitialize() {

		//To create items and block you need to initialize then before creating their models.
		TestBlocks.initBlocks();
		TestItems.initItems();

		LOGGER.info("TestMod initialized.");
    }

	@Override
	public void onRecipesReady() {

	}

	@Override
	public void initNamespaces() {

	}

	@Override
	public void beforeGameStart() {

	}

	@Override
	public void afterGameStart() {

	}
}
