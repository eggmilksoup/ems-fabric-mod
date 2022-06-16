package net.fabricmc.eggmilksoup;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class EggMilkSoup implements ModInitializer {
	public static final Logger LOGGER = LoggerFactory.getLogger("eggmilksoup");

	public static final MobMilk CREEPER_MILK = new MobMilk (
			new FabricItemSettings().group(ItemGroup.FOOD).maxCount(1),
			new int[] {15}
	);

	@Override
	public void onInitialize() {
		LOGGER.info("Adding EMS Milk items.");
		Registry.register(Registry.ITEM, new Identifier("eggmilksoup", "creeper_milk"), CREEPER_MILK);
	}
}
