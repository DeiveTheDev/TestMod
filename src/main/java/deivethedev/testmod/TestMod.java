package deivethedev.testmod;

import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import turniplabs.halplibe.util.GameStartEntrypoint;
import turniplabs.halplibe.util.RecipeEntrypoint;

public class TestMod implements ModInitializer, RecipeEntrypoint, GameStartEntrypoint {
    public static final String MOD_ID = "testmod";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	private static int startingID = 2000;
	public static int nextID() {return startingID++;}

    @Override
    public void onInitialize() {

		TestBlocks.initBlocks();
		//TestItems.initItems();

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
		new TestItems();
	}

	@Override
	public void afterGameStart() {

	}
}
