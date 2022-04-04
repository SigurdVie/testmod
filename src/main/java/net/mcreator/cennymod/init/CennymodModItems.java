
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.cennymod.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.RegistryEvent;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.SpawnEggItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.BlockItem;

import net.mcreator.cennymod.item.FunkyItem;

import java.util.List;
import java.util.ArrayList;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class CennymodModItems {
	private static final List<Item> REGISTRY = new ArrayList<>();
	public static final Item OAK_TABLE = register(CennymodModBlocks.OAK_TABLE, CreativeModeTab.TAB_DECORATIONS);
	public static final Item CONNOR_MURPHY = register(
			new SpawnEggItem(CennymodModEntities.CONNOR_MURPHY, -3394816, -26368, new Item.Properties().tab(CreativeModeTab.TAB_MISC))
					.setRegistryName("connor_murphy_spawn_egg"));
	public static final Item JK = register(
			new SpawnEggItem(CennymodModEntities.JK, -3407668, -16751002, new Item.Properties().tab(CreativeModeTab.TAB_MISC))
					.setRegistryName("jk_spawn_egg"));
	public static final Item FUNKY = register(new FunkyItem());
	public static final Item EPPLEHAGENSKILT = register(CennymodModBlocks.EPPLEHAGENSKILT, CreativeModeTab.TAB_BUILDING_BLOCKS);

	private static Item register(Item item) {
		REGISTRY.add(item);
		return item;
	}

	private static Item register(Block block, CreativeModeTab tab) {
		return register(new BlockItem(block, new Item.Properties().tab(tab)).setRegistryName(block.getRegistryName()));
	}

	@SubscribeEvent
	public static void registerItems(RegistryEvent.Register<Item> event) {
		event.getRegistry().registerAll(REGISTRY.toArray(new Item[0]));
	}
}
