
package net.mcreator.chernobylv;

import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.common.brewing.IBrewingRecipe;
import net.minecraftforge.common.brewing.BrewingRecipeRegistry;

import net.minecraft.potion.PotionUtils;
import net.minecraft.item.Items;
import net.minecraft.item.ItemStack;

import net.mcreator.chernobylv.potion.TestPotion;
import net.mcreator.chernobylv.block.RawIronBlockBlock;
import net.mcreator.chernobylv.block.RawCoalBlockBlock;

@ChernobylvModElements.ModElement.Tag
public class MinersDecotionRecipeBrewingRecipe extends ChernobylvModElements.ModElement {
	public MinersDecotionRecipeBrewingRecipe(ChernobylvModElements instance) {
		super(instance, 24);
	}

	@Override
	public void init(FMLCommonSetupEvent event) {
		BrewingRecipeRegistry.addRecipe(new CustomBrewingRecipe());
	}
	public static class CustomBrewingRecipe implements IBrewingRecipe {
		@Override
		public boolean isInput(ItemStack input) {
			return input.getItem() == RawIronBlockBlock.block.asItem();
		}

		@Override
		public boolean isIngredient(ItemStack ingredient) {
			return ingredient.getItem() == RawCoalBlockBlock.block.asItem();
		}

		@Override
		public ItemStack getOutput(ItemStack input, ItemStack ingredient) {
			if (isInput(input) && isIngredient(ingredient)) {
				return PotionUtils.addPotionToItemStack(new ItemStack(Items.POTION), TestPotion.potionType);
			}
			return ItemStack.EMPTY;
		}
	}
}
