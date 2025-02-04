package deivethedev.tutorialmod;

import turniplabs.halplibe.util.TomlConfigHandler;
import turniplabs.halplibe.util.toml.Toml;

public class TutorialConfig {
	private static final Toml TOML = new Toml("TestMod's TOML Config");
	public static final TomlConfigHandler CFG;

	// Setting starting ids to your blocks and items:

	// Vanilla BTA blocks range from 0 to about 1100 and block ids can only exist within 0 and 16000.

	// Vanilla BTA items range from 16384 to about 16600 and block ids can only exist within 0 and 32768.
	// And there is music discs occupying the range 18384 to 18395 (don't put between these too)

	// Make sure your ids is not conflicting with Vanilla BTA's ids and other mods ids

	static {
		TOML.addCategory("IDs")
			.addEntry("startingItemID", "Default: 22000", 22000) // id that your items id start with (please change id to something else)
			.addEntry("startingBlockID", "Default: 7000", 7000); // id that your blocks id start with (please change id to something else)

		CFG = new TomlConfigHandler(TutorialMod.MOD_ID, TOML);
	}
}
