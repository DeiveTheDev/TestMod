package deivethedev.tutorialmod;

import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import turniplabs.halplibe.util.GameStartEntrypoint;

public class TutorialMod implements ModInitializer, GameStartEntrypoint {
    public static final String MOD_ID = "tutorialmod";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	// Just a quick explanation
	// This is your Main script, current it is handling almost all entrypoints defined in fabric.mod.json but you can separate then later if you want
	// The ModelEntrypoint is being handled in TestModels just to be more organized.

	// Don't forget that with Ctrl + Left-Click on a field or method you can quickly get information on when and where that field or method is assign or used.

    @Override
    public void onInitialize() {

		//To create items and block you need to initialize then before creating their models.
		//First let's learn how to make a block
		TutorialBlocks.initBlocks(); // Ctrl + Left-Click in TestBlocks
		TutorialItems.initItems();

		LOGGER.info("Tutorial Mod initialized.");
    }

	@Override
	public void beforeGameStart() {

	}

	@Override
	public void afterGameStart() {

	}
}
