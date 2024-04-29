
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package sh.lsbm.bark.init;

import sh.lsbm.bark.world.inventory.BasketInterfaceMenu;
import sh.lsbm.bark.LsbmMod;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.extensions.IForgeMenuType;

import net.minecraft.world.inventory.MenuType;

public class LsbmModMenus {
	public static final DeferredRegister<MenuType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.MENU_TYPES, LsbmMod.MODID);
	public static final RegistryObject<MenuType<BasketInterfaceMenu>> BASKET_INTERFACE = REGISTRY.register("basket_interface", () -> IForgeMenuType.create(BasketInterfaceMenu::new));
}
