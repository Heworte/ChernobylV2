
package net.mcreator.chernobylv.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.Rarity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.block.BlockState;

import net.mcreator.chernobylv.itemgroup.ChernobylItemGroup;
import net.mcreator.chernobylv.ChernobylvModElements;

@ChernobylvModElements.ModElement.Tag
public class RawIronItem extends ChernobylvModElements.ModElement {
	@ObjectHolder("chernobylv:raw_iron")
	public static final Item block = null;
	public RawIronItem(ChernobylvModElements instance) {
		super(instance, 12);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}
	public static class ItemCustom extends Item {
		public ItemCustom() {
			super(new Item.Properties().group(ChernobylItemGroup.tab).maxStackSize(64).rarity(Rarity.COMMON));
			setRegistryName("raw_iron");
		}

		@Override
		public int getItemEnchantability() {
			return 0;
		}

		@Override
		public int getUseDuration(ItemStack itemstack) {
			return 0;
		}

		@Override
		public float getDestroySpeed(ItemStack par1ItemStack, BlockState par2Block) {
			return 1F;
		}
	}
}
