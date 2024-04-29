
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package sh.lsbm.bark.init;

import sh.lsbm.bark.block.entity.BarkBasketBlockEntity;
import sh.lsbm.bark.LsbmMod;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.Block;

public class LsbmModBlockEntities {
	public static final DeferredRegister<BlockEntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCK_ENTITY_TYPES, LsbmMod.MODID);
	public static final RegistryObject<BlockEntityType<?>> BARK_BASKET = register("bark_basket", LsbmModBlocks.BARK_BASKET, BarkBasketBlockEntity::new);

	private static RegistryObject<BlockEntityType<?>> register(String registryname, RegistryObject<Block> block, BlockEntityType.BlockEntitySupplier<?> supplier) {
		return REGISTRY.register(registryname, () -> BlockEntityType.Builder.of(supplier, block.get()).build(null));
	}
}
