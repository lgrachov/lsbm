
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package sh.lsbm.bark.init;

import sh.lsbm.bark.item.BarkSwordItem;
import sh.lsbm.bark.item.BarkShovelItem;
import sh.lsbm.bark.item.BarkPieceItem;
import sh.lsbm.bark.item.BarkPickaxeItem;
import sh.lsbm.bark.item.BarkHoeItem;
import sh.lsbm.bark.item.BarkAxeItem;
import sh.lsbm.bark.item.BarkArmorItem;
import sh.lsbm.bark.LsbmMod;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;

public class LsbmModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, LsbmMod.MODID);
	public static final RegistryObject<Item> BARK_PIECE = REGISTRY.register("bark_piece", () -> new BarkPieceItem());
	public static final RegistryObject<Item> BARK_CARPET = block(LsbmModBlocks.BARK_CARPET);
	public static final RegistryObject<Item> BARK_ARMOR_HELMET = REGISTRY.register("bark_armor_helmet", () -> new BarkArmorItem.Helmet());
	public static final RegistryObject<Item> BARK_ARMOR_CHESTPLATE = REGISTRY.register("bark_armor_chestplate", () -> new BarkArmorItem.Chestplate());
	public static final RegistryObject<Item> BARK_ARMOR_LEGGINGS = REGISTRY.register("bark_armor_leggings", () -> new BarkArmorItem.Leggings());
	public static final RegistryObject<Item> BARK_ARMOR_BOOTS = REGISTRY.register("bark_armor_boots", () -> new BarkArmorItem.Boots());
	public static final RegistryObject<Item> BARK_BLOCK = block(LsbmModBlocks.BARK_BLOCK);
	public static final RegistryObject<Item> BARK_AXE = REGISTRY.register("bark_axe", () -> new BarkAxeItem());
	public static final RegistryObject<Item> BARK_PICKAXE = REGISTRY.register("bark_pickaxe", () -> new BarkPickaxeItem());
	public static final RegistryObject<Item> BARK_SWORD = REGISTRY.register("bark_sword", () -> new BarkSwordItem());
	public static final RegistryObject<Item> BARK_SHOVEL = REGISTRY.register("bark_shovel", () -> new BarkShovelItem());
	public static final RegistryObject<Item> BARK_HOE = REGISTRY.register("bark_hoe", () -> new BarkHoeItem());
	public static final RegistryObject<Item> BARK_BASKET = block(LsbmModBlocks.BARK_BASKET);

	private static RegistryObject<Item> block(RegistryObject<Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties()));
	}
}
