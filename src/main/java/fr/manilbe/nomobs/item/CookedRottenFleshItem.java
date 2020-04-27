
package fr.manilbe.nomobs.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.UseAction;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Item;
import net.minecraft.item.Food;

import fr.manilbe.nomobs.NoMobsElements;

@NoMobsElements.ModElement.Tag
public class CookedRottenFleshItem extends NoMobsElements.ModElement {
	@ObjectHolder("nomobs:cooked_rotten_flesh")
	public static final Item block = null;
	public CookedRottenFleshItem(NoMobsElements instance) {
		super(instance, 10);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new FoodItemCustom());
	}
	public static class FoodItemCustom extends Item {
		public FoodItemCustom() {
			super(new Item.Properties().group(ItemGroup.FOOD).maxStackSize(64).food((new Food.Builder()).hunger(4).saturation(0.1f).meat().build()));
			setRegistryName("cooked_rotten_flesh");
		}

		@Override
		public UseAction getUseAction(ItemStack par1ItemStack) {
			return UseAction.EAT;
		}
	}
}
