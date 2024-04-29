
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package sh.lsbm.bark.init;

import sh.lsbm.bark.client.gui.BasketInterfaceScreen;

import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.gui.screens.MenuScreens;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class LsbmModScreens {
	@SubscribeEvent
	public static void clientLoad(FMLClientSetupEvent event) {
		event.enqueueWork(() -> {
			MenuScreens.register(LsbmModMenus.BASKET_INTERFACE.get(), BasketInterfaceScreen::new);
		});
	}
}
