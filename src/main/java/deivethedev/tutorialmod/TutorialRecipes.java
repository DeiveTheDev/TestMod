package deivethedev.tutorialmod;

import net.minecraft.core.crafting.LookupFuelFurnace;
import net.minecraft.core.item.ItemStack;
import turniplabs.halplibe.helper.RecipeBuilder;
import turniplabs.halplibe.util.RecipeEntrypoint;

import static deivethedev.tutorialmod.TutorialMod.LOGGER;
import static deivethedev.tutorialmod.TutorialMod.MOD_ID;

import static deivethedev.tutorialmod.TutorialItems.*;
import static deivethedev.tutorialmod.TutorialBlocks.*;

// Same as the Models
// Please register the model entrypoint in fabric.mod.json:
// "recipesReady": [
// "deivethedev.tutorialmod.TutorialRecipes"
// ],

public class TutorialRecipes implements RecipeEntrypoint { // don't forget to implement the RecipeEntrypoint

	@Override
	public void onRecipesReady() { // Why the function name is onRecipesReady instead of initRecipes I don't know.

		// Registering a fuel
		LookupFuelFurnace.instance.addFuelEntry(woodChips.id, 20);
		//						   				     Δ	       Δ
		//                                        item id    ticks per fuel (minecraft runs at 20 ticks per second and vanilla coal lasts 1600 ticks)


		// Crafting recipe

		// Like BlockBuilder
		RecipeBuilder.Shaped(MOD_ID)
			.setShape(
				"BBB",
				"BBB",
				"BBB")
			.addInput('B', banana) // you choose the letter and the input item (if you and vanilla/bta blocks use Blocks.COBBLESTONE)
			.create("banana_block", new ItemStack(bananaBlock, 1));
		//			      Δ                           Δ        Δ
		//			 recipe name               output item   quantity

		// Furnace Recipe

		RecipeBuilder.Furnace(MOD_ID)
			.setInput(banana) // Item you want to cook
			.create("cooked_banana", new ItemStack(cookedBanana, 1));


		LOGGER.info("Recipes initialized.");
	}

	@Override
	public void initNamespaces() {
		RecipeBuilder.initNameSpace(MOD_ID);
	}

}
