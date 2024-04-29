
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package sh.lsbm.bark.init;

import sh.lsbm.bark.block.BarkCarpetBlock;
import sh.lsbm.bark.block.BarkBlockBlock;
import sh.lsbm.bark.block.BarkBasketBlock;
import sh.lsbm.bark.LsbmMod;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

public class LsbmModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, LsbmMod.MODID);
	public static final RegistryObject<Block> BARK_CARPET = REGISTRY.register("bark_carpet", () -> new BarkCarpetBlock());
	public static final RegistryObject<Block> BARK_BLOCK = REGISTRY.register("bark_block", () -> new BarkBlockBlock());
	public static final RegistryObject<Block> BARK_BASKET = REGISTRY.register("bark_basket", () -> new BarkBasketBlock());
}
