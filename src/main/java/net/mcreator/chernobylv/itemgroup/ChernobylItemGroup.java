
package net.mcreator.chernobylv.itemgroup;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;

import net.mcreator.chernobylv.item.RawCoalItem;
import net.mcreator.chernobylv.ChernobylvModElements;

@ChernobylvModElements.ModElement.Tag
public class ChernobylItemGroup extends ChernobylvModElements.ModElement {
	public ChernobylItemGroup(ChernobylvModElements instance) {
		super(instance, 4);
	}

	@Override
	public void initElements() {
		tab = new ItemGroup("tabchernobyl") {
			@OnlyIn(Dist.CLIENT)
			@Override
			public ItemStack createIcon() {
				return new ItemStack(RawCoalItem.block);
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return true;
			}
		}.setBackgroundImageName("item_search.png");
	}
	public static ItemGroup tab;
}
