
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package sh.lsbm.bark.init;

import sh.lsbm.bark.LsbmMod;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class LsbmModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, LsbmMod.MODID);
	public static final RegistryObject<CreativeModeTab> LSBM = REGISTRY.register("lsbm",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.lsbm.lsbm")).icon(() -> new ItemStack(LsbmModItems.BARK_PIECE.get())).displayItems((parameters, tabData) -> {
				tabData.accept(LsbmModItems.BARK_PIECE.get());
				tabData.accept(LsbmModBlocks.BARK_CARPET.get().asItem());
				tabData.accept(LsbmModBlocks.BARK_BLOCK.get().asItem());
				tabData.accept(LsbmModItems.BARK_AXE.get());
				tabData.accept(LsbmModItems.BARK_PICKAXE.get());
				tabData.accept(LsbmModItems.BARK_SWORD.get());
				tabData.accept(LsbmModItems.BARK_SHOVEL.get());
				tabData.accept(LsbmModItems.BARK_HOE.get());
				tabData.accept(LsbmModBlocks.BARK_BASKET.get().asItem());
			})

					.build());

	@SubscribeEvent
	public static void buildTabContentsVanilla(BuildCreativeModeTabContentsEvent tabData) {

		if (tabData.getTabKey() == CreativeModeTabs.COMBAT) {
			tabData.accept(LsbmModItems.BARK_ARMOR_HELMET.get());
			tabData.accept(LsbmModItems.BARK_ARMOR_CHESTPLATE.get());
			tabData.accept(LsbmModItems.BARK_ARMOR_LEGGINGS.get());
			tabData.accept(LsbmModItems.BARK_ARMOR_BOOTS.get());
		}
	}
}
