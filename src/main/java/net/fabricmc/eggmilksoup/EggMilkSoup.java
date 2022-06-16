package net.fabricmc.eggmilksoup;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.FoodComponents;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class EggMilkSoup implements ModInitializer {
  public static final Logger LOGGER = LoggerFactory.getLogger("eggmilksoup");

  public static final MobMilk GLOW_SQUID_MILK = new MobMilk (
    new FabricItemSettings().group(ItemGroup.FOOD).maxCount(1),
    new int[] {3}
  );

  public static final MobSoup GLOW_SQUID_SOUP = new MobSoup (
    new FabricItemSettings().group(ItemGroup.FOOD).food(FoodComponents.SUSPICIOUS_STEW).maxCount(1),
    new int[] {3}
  );

  public static final MobMilk FOX_MILK = new MobMilk (
    new FabricItemSettings().group(ItemGroup.FOOD).maxCount(1),
    new int[] {4}
  );

  public static final MobSoup FOX_SOUP = new MobSoup (
    new FabricItemSettings().group(ItemGroup.FOOD).food(FoodComponents.SUSPICIOUS_STEW).maxCount(1),
    new int[] {4}
  );

  public static final MobMilk DONKEY_MILK = new MobMilk (
    new FabricItemSettings().group(ItemGroup.FOOD).maxCount(1),
    new int[] {5}
  );

  public static final MobSoup DONKEY_SOUP = new MobSoup (
    new FabricItemSettings().group(ItemGroup.FOOD).food(FoodComponents.SUSPICIOUS_STEW).maxCount(1),
    new int[] {5}
  );

  public static final MobMilk COD_MILK = new MobMilk (
    new FabricItemSettings().group(ItemGroup.FOOD).maxCount(1),
    new int[] {6}
  );

  public static final MobSoup COD_SOUP = new MobSoup (
    new FabricItemSettings().group(ItemGroup.FOOD).food(FoodComponents.SUSPICIOUS_STEW).maxCount(1),
    new int[] {6}
  );

  public static final MobMilk CHICKEN_MILK = new MobMilk (
    new FabricItemSettings().group(ItemGroup.FOOD).maxCount(1),
    new int[] {7}
  );

  public static final MobSoup CHICKEN_SOUP = new MobSoup (
    new FabricItemSettings().group(ItemGroup.FOOD).food(FoodComponents.SUSPICIOUS_STEW).maxCount(1),
    new int[] {7}
  );

  public static final MobMilk CAT_MILK = new MobMilk (
    new FabricItemSettings().group(ItemGroup.FOOD).maxCount(1),
    new int[] {8}
  );

  public static final MobSoup CAT_SOUP = new MobSoup (
    new FabricItemSettings().group(ItemGroup.FOOD).food(FoodComponents.SUSPICIOUS_STEW).maxCount(1),
    new int[] {8}
  );

  public static final MobMilk HORSE_MILK = new MobMilk (
    new FabricItemSettings().group(ItemGroup.FOOD).maxCount(1),
    new int[] {9}
  );

  public static final MobSoup HORSE_SOUP = new MobSoup (
    new FabricItemSettings().group(ItemGroup.FOOD).food(FoodComponents.SUSPICIOUS_STEW).maxCount(1),
    new int[] {9}
  );

  public static final MobMilk BAT_MILK = new MobMilk (
    new FabricItemSettings().group(ItemGroup.FOOD).maxCount(1),
    new int[] {10}
  );

  public static final MobSoup BAT_SOUP = new MobSoup (
    new FabricItemSettings().group(ItemGroup.FOOD).food(FoodComponents.SUSPICIOUS_STEW).maxCount(1),
    new int[] {10}
  );

  public static final MobMilk AXOLOTL_MILK = new MobMilk (
    new FabricItemSettings().group(ItemGroup.FOOD).maxCount(1),
    new int[] {11}
  );

  public static final MobSoup AXOLOTL_SOUP = new MobSoup (
    new FabricItemSettings().group(ItemGroup.FOOD).food(FoodComponents.SUSPICIOUS_STEW).maxCount(1),
    new int[] {11}
  );

  public static final MobMilk SALMON_MILK = new MobMilk (
    new FabricItemSettings().group(ItemGroup.FOOD).maxCount(1),
    new int[] {12}
  );

  public static final MobSoup SALMON_SOUP = new MobSoup (
    new FabricItemSettings().group(ItemGroup.FOOD).food(FoodComponents.SUSPICIOUS_STEW).maxCount(1),
    new int[] {12}
  );

  public static final MobMilk PUFFERFISH_MILK = new MobMilk (
    new FabricItemSettings().group(ItemGroup.FOOD).maxCount(1),
    new int[] {13}
  );

  public static final MobSoup PUFFERFISH_SOUP = new MobSoup (
    new FabricItemSettings().group(ItemGroup.FOOD).food(FoodComponents.SUSPICIOUS_STEW).maxCount(1),
    new int[] {13}
  );

  public static final MobMilk RABBIT_MILK = new MobMilk (
    new FabricItemSettings().group(ItemGroup.FOOD).maxCount(1),
    new int[] {14}
  );

  public static final MobSoup RABBIT_SOUP = new MobSoup (
    new FabricItemSettings().group(ItemGroup.FOOD).food(FoodComponents.SUSPICIOUS_STEW).maxCount(1),
    new int[] {14}
  );

  public static final MobMilk POLAR_BEAR_MILK = new MobMilk (
    new FabricItemSettings().group(ItemGroup.FOOD).maxCount(1),
    new int[] {15}
  );

  public static final MobSoup POLAR_BEAR_SOUP = new MobSoup (
    new FabricItemSettings().group(ItemGroup.FOOD).food(FoodComponents.SUSPICIOUS_STEW).maxCount(1),
    new int[] {15}
  );

  public static final MobMilk PIG_MILK = new MobMilk (
    new FabricItemSettings().group(ItemGroup.FOOD).maxCount(1),
    new int[] {16}
  );

  public static final MobSoup PIG_SOUP = new MobSoup (
    new FabricItemSettings().group(ItemGroup.FOOD).food(FoodComponents.SUSPICIOUS_STEW).maxCount(1),
    new int[] {16}
  );

  public static final MobMilk PIGLIN_MILK = new MobMilk (
    new FabricItemSettings().group(ItemGroup.FOOD).maxCount(1),
    new int[] {17}
  );

  public static final MobSoup PIGLIN_SOUP = new MobSoup (
    new FabricItemSettings().group(ItemGroup.FOOD).food(FoodComponents.SUSPICIOUS_STEW).maxCount(1),
    new int[] {17}
  );

  public static final MobMilk OCELOT_MILK = new MobMilk (
    new FabricItemSettings().group(ItemGroup.FOOD).maxCount(1),
    new int[] {18}
  );

  public static final MobSoup OCELOT_SOUP = new MobSoup (
    new FabricItemSettings().group(ItemGroup.FOOD).food(FoodComponents.SUSPICIOUS_STEW).maxCount(1),
    new int[] {18}
  );

  public static final MobMilk MULE_MILK = new MobMilk (
    new FabricItemSettings().group(ItemGroup.FOOD).maxCount(1),
    new int[] {19}
  );

  public static final MobSoup MULE_SOUP = new MobSoup (
    new FabricItemSettings().group(ItemGroup.FOOD).food(FoodComponents.SUSPICIOUS_STEW).maxCount(1),
    new int[] {19}
  );

  public static final MobMilk PARROT_MILK = new MobMilk (
    new FabricItemSettings().group(ItemGroup.FOOD).maxCount(1),
    new int[] {20}
  );

  public static final MobSoup PARROT_SOUP = new MobSoup (
    new FabricItemSettings().group(ItemGroup.FOOD).food(FoodComponents.SUSPICIOUS_STEW).maxCount(1),
    new int[] {20}
  );

  public static final MobMilk WANDERING_TRADER_MILK = new MobMilk (
    new FabricItemSettings().group(ItemGroup.FOOD).maxCount(1),
    new int[] {21}
  );

  public static final MobSoup WANDERING_TRADER_SOUP = new MobSoup (
    new FabricItemSettings().group(ItemGroup.FOOD).food(FoodComponents.SUSPICIOUS_STEW).maxCount(1),
    new int[] {21}
  );

  public static final MobMilk SHEEP_MILK = new MobMilk (
    new FabricItemSettings().group(ItemGroup.FOOD).maxCount(1),
    new int[] {22}
  );

  public static final MobSoup SHEEP_SOUP = new MobSoup (
    new FabricItemSettings().group(ItemGroup.FOOD).food(FoodComponents.SUSPICIOUS_STEW).maxCount(1),
    new int[] {22}
  );

  public static final MobMilk SKELETON_HORSE_MILK = new MobMilk (
    new FabricItemSettings().group(ItemGroup.FOOD).maxCount(1),
    new int[] {23}
  );

  public static final MobSoup SKELETON_HORSE_SOUP = new MobSoup (
    new FabricItemSettings().group(ItemGroup.FOOD).food(FoodComponents.SUSPICIOUS_STEW).maxCount(1),
    new int[] {23}
  );

  public static final MobMilk VILLAGER_MILK = new MobMilk (
    new FabricItemSettings().group(ItemGroup.FOOD).maxCount(1),
    new int[] {24}
  );

  public static final MobSoup VILLAGER_SOUP = new MobSoup (
    new FabricItemSettings().group(ItemGroup.FOOD).food(FoodComponents.SUSPICIOUS_STEW).maxCount(1),
    new int[] {24}
  );

  public static final MobMilk SNOW_GOLEM_MILK = new MobMilk (
    new FabricItemSettings().group(ItemGroup.FOOD).maxCount(1),
    new int[] {25}
  );

  public static final MobSoup SNOW_GOLEM_SOUP = new MobSoup (
    new FabricItemSettings().group(ItemGroup.FOOD).food(FoodComponents.SUSPICIOUS_STEW).maxCount(1),
    new int[] {25}
  );

  public static final MobMilk SQUID_MILK = new MobMilk (
    new FabricItemSettings().group(ItemGroup.FOOD).maxCount(1),
    new int[] {26}
  );

  public static final MobSoup SQUID_SOUP = new MobSoup (
    new FabricItemSettings().group(ItemGroup.FOOD).food(FoodComponents.SUSPICIOUS_STEW).maxCount(1),
    new int[] {26}
  );

  public static final MobMilk STRIDER_MILK = new MobMilk (
    new FabricItemSettings().group(ItemGroup.FOOD).maxCount(1),
    new int[] {27}
  );

  public static final MobSoup STRIDER_SOUP = new MobSoup (
    new FabricItemSettings().group(ItemGroup.FOOD).food(FoodComponents.SUSPICIOUS_STEW).maxCount(1),
    new int[] {27}
  );

  public static final MobMilk TROPICAL_FISH_MILK = new MobMilk (
    new FabricItemSettings().group(ItemGroup.FOOD).maxCount(1),
    new int[] {28}
  );

  public static final MobSoup TROPICAL_FISH_SOUP = new MobSoup (
    new FabricItemSettings().group(ItemGroup.FOOD).food(FoodComponents.SUSPICIOUS_STEW).maxCount(1),
    new int[] {28}
  );

  public static final MobMilk TURTLE_MILK = new MobMilk (
    new FabricItemSettings().group(ItemGroup.FOOD).maxCount(1),
    new int[] {29}
  );

  public static final MobSoup TURTLE_SOUP = new MobSoup (
    new FabricItemSettings().group(ItemGroup.FOOD).food(FoodComponents.SUSPICIOUS_STEW).maxCount(1),
    new int[] {29}
  );

  public static final MobMilk GOAT_MILK = new MobMilk (
    new FabricItemSettings().group(ItemGroup.FOOD).maxCount(1),
    new int[] {30}
  );

  public static final MobSoup GOAT_SOUP = new MobSoup (
    new FabricItemSettings().group(ItemGroup.FOOD).food(FoodComponents.SUSPICIOUS_STEW).maxCount(1),
    new int[] {30}
  );

  public static final MobMilk ENDERMAN_MILK = new MobMilk (
    new FabricItemSettings().group(ItemGroup.FOOD).maxCount(1),
    new int[] {31}
  );

  public static final MobSoup ENDERMAN_SOUP = new MobSoup (
    new FabricItemSettings().group(ItemGroup.FOOD).food(FoodComponents.SUSPICIOUS_STEW).maxCount(1),
    new int[] {31}
  );

  public static final MobMilk LLAMA_MILK = new MobMilk (
    new FabricItemSettings().group(ItemGroup.FOOD).maxCount(1),
    new int[] {32}
  );

  public static final MobSoup LLAMA_SOUP = new MobSoup (
    new FabricItemSettings().group(ItemGroup.FOOD).food(FoodComponents.SUSPICIOUS_STEW).maxCount(1),
    new int[] {32}
  );

  public static final MobMilk CAVE_SPIDER_MILK = new MobMilk (
    new FabricItemSettings().group(ItemGroup.FOOD).maxCount(1),
    new int[] {1,1}
  );

  public static final MobSoup CAVE_SPIDER_SOUP = new MobSoup (
    new FabricItemSettings().group(ItemGroup.FOOD).food(FoodComponents.SUSPICIOUS_STEW).maxCount(1),
    new int[] {1,1}
  );

  public static final MobMilk BEE_MILK = new MobMilk (
    new FabricItemSettings().group(ItemGroup.FOOD).maxCount(1),
    new int[] {1,2}
  );

  public static final MobSoup BEE_SOUP = new MobSoup (
    new FabricItemSettings().group(ItemGroup.FOOD).food(FoodComponents.SUSPICIOUS_STEW).maxCount(1),
    new int[] {1,2}
  );

  public static final MobMilk PANDA_MILK = new MobMilk (
    new FabricItemSettings().group(ItemGroup.FOOD).maxCount(1),
    new int[] {1,3}
  );

  public static final MobSoup PANDA_SOUP = new MobSoup (
    new FabricItemSettings().group(ItemGroup.FOOD).food(FoodComponents.SUSPICIOUS_STEW).maxCount(1),
    new int[] {1,3}
  );

  public static final MobMilk ZOMBIFIED_PIGLIN_MILK = new MobMilk (
    new FabricItemSettings().group(ItemGroup.FOOD).maxCount(1),
    new int[] {1,4}
  );

  public static final MobSoup ZOMBIFIED_PIGLIN_SOUP = new MobSoup (
    new FabricItemSettings().group(ItemGroup.FOOD).food(FoodComponents.SUSPICIOUS_STEW).maxCount(1),
    new int[] {1,4}
  );

  public static final MobMilk SPIDER_MILK = new MobMilk (
    new FabricItemSettings().group(ItemGroup.FOOD).maxCount(1),
    new int[] {1,5}
  );

  public static final MobSoup SPIDER_SOUP = new MobSoup (
    new FabricItemSettings().group(ItemGroup.FOOD).food(FoodComponents.SUSPICIOUS_STEW).maxCount(1),
    new int[] {1,5}
  );

  public static final MobMilk WOLF_MILK = new MobMilk (
    new FabricItemSettings().group(ItemGroup.FOOD).maxCount(1),
    new int[] {1,6}
  );

  public static final MobSoup WOLF_SOUP = new MobSoup (
    new FabricItemSettings().group(ItemGroup.FOOD).food(FoodComponents.SUSPICIOUS_STEW).maxCount(1),
    new int[] {1,6}
  );

  public static final MobMilk DOLPHIN_MILK = new MobMilk (
    new FabricItemSettings().group(ItemGroup.FOOD).maxCount(1),
    new int[] {1,7}
  );

  public static final MobSoup DOLPHIN_SOUP = new MobSoup (
    new FabricItemSettings().group(ItemGroup.FOOD).food(FoodComponents.SUSPICIOUS_STEW).maxCount(1),
    new int[] {1,7}
  );

  public static final MobMilk TRADER_LLAMA_MILK = new MobMilk (
    new FabricItemSettings().group(ItemGroup.FOOD).maxCount(1),
    new int[] {1,8}
  );

  public static final MobSoup TRADER_LLAMA_SOUP = new MobSoup (
    new FabricItemSettings().group(ItemGroup.FOOD).food(FoodComponents.SUSPICIOUS_STEW).maxCount(1),
    new int[] {1,8}
  );

  public static final MobMilk ZOGLIN_MILK = new MobMilk (
    new FabricItemSettings().group(ItemGroup.FOOD).maxCount(1),
    new int[] {1,9}
  );

  public static final MobSoup ZOGLIN_SOUP = new MobSoup (
    new FabricItemSettings().group(ItemGroup.FOOD).food(FoodComponents.SUSPICIOUS_STEW).maxCount(1),
    new int[] {1,9}
  );

  public static final MobMilk WITHER_SKELETON_MILK = new MobMilk (
    new FabricItemSettings().group(ItemGroup.FOOD).maxCount(1),
    new int[] {1,10}
  );

  public static final MobSoup WITHER_SKELETON_SOUP = new MobSoup (
    new FabricItemSettings().group(ItemGroup.FOOD).food(FoodComponents.SUSPICIOUS_STEW).maxCount(1),
    new int[] {1,10}
  );

  public static final MobMilk WITCH_MILK = new MobMilk (
    new FabricItemSettings().group(ItemGroup.FOOD).maxCount(1),
    new int[] {1,11}
  );

  public static final MobSoup WITCH_SOUP = new MobSoup (
    new FabricItemSettings().group(ItemGroup.FOOD).food(FoodComponents.SUSPICIOUS_STEW).maxCount(1),
    new int[] {1,11}
  );

  public static final MobMilk BLAZE_MILK = new MobMilk (
    new FabricItemSettings().group(ItemGroup.FOOD).maxCount(1),
    new int[] {1,12}
  );

  public static final MobSoup BLAZE_SOUP = new MobSoup (
    new FabricItemSettings().group(ItemGroup.FOOD).food(FoodComponents.SUSPICIOUS_STEW).maxCount(1),
    new int[] {1,12}
  );

  public static final MobMilk DROWNED_MILK = new MobMilk (
    new FabricItemSettings().group(ItemGroup.FOOD).maxCount(1),
    new int[] {1,13}
  );

  public static final MobSoup DROWNED_SOUP = new MobSoup (
    new FabricItemSettings().group(ItemGroup.FOOD).food(FoodComponents.SUSPICIOUS_STEW).maxCount(1),
    new int[] {1,13}
  );

  public static final MobMilk CREEPER_MILK = new MobMilk (
    new FabricItemSettings().group(ItemGroup.FOOD).maxCount(1),
    new int[] {1,14}
  );

  public static final MobSoup CREEPER_SOUP = new MobSoup (
    new FabricItemSettings().group(ItemGroup.FOOD).food(FoodComponents.SUSPICIOUS_STEW).maxCount(1),
    new int[] {1,14}
  );

  public static final MobMilk ENDERMITE_MILK = new MobMilk (
    new FabricItemSettings().group(ItemGroup.FOOD).maxCount(1),
    new int[] {1,15}
  );

  public static final MobSoup ENDERMITE_SOUP = new MobSoup (
    new FabricItemSettings().group(ItemGroup.FOOD).food(FoodComponents.SUSPICIOUS_STEW).maxCount(1),
    new int[] {1,15}
  );

  public static final MobMilk EVOKER_MILK = new MobMilk (
    new FabricItemSettings().group(ItemGroup.FOOD).maxCount(1),
    new int[] {1,16}
  );

  public static final MobSoup EVOKER_SOUP = new MobSoup (
    new FabricItemSettings().group(ItemGroup.FOOD).food(FoodComponents.SUSPICIOUS_STEW).maxCount(1),
    new int[] {1,16}
  );

  public static final MobMilk GHAST_MILK = new MobMilk (
    new FabricItemSettings().group(ItemGroup.FOOD).maxCount(1),
    new int[] {1,17}
  );

  public static final MobSoup GHAST_SOUP = new MobSoup (
    new FabricItemSettings().group(ItemGroup.FOOD).food(FoodComponents.SUSPICIOUS_STEW).maxCount(1),
    new int[] {1,17}
  );

  public static final MobMilk GUARDIAN_MILK = new MobMilk (
    new FabricItemSettings().group(ItemGroup.FOOD).maxCount(1),
    new int[] {1,18}
  );

  public static final MobSoup GUARDIAN_SOUP = new MobSoup (
    new FabricItemSettings().group(ItemGroup.FOOD).food(FoodComponents.SUSPICIOUS_STEW).maxCount(1),
    new int[] {1,18}
  );

  public static final MobMilk HOGLIN_MILK = new MobMilk (
    new FabricItemSettings().group(ItemGroup.FOOD).maxCount(1),
    new int[] {1,19}
  );

  public static final MobSoup HOGLIN_SOUP = new MobSoup (
    new FabricItemSettings().group(ItemGroup.FOOD).food(FoodComponents.SUSPICIOUS_STEW).maxCount(1),
    new int[] {1,19}
  );

  public static final MobMilk HUSK_MILK = new MobMilk (
    new FabricItemSettings().group(ItemGroup.FOOD).maxCount(1),
    new int[] {1,20}
  );

  public static final MobSoup HUSK_SOUP = new MobSoup (
    new FabricItemSettings().group(ItemGroup.FOOD).food(FoodComponents.SUSPICIOUS_STEW).maxCount(1),
    new int[] {1,20}
  );

  public static final MobMilk PHANTOM_MILK = new MobMilk (
    new FabricItemSettings().group(ItemGroup.FOOD).maxCount(1),
    new int[] {1,21}
  );

  public static final MobSoup PHANTOM_SOUP = new MobSoup (
    new FabricItemSettings().group(ItemGroup.FOOD).food(FoodComponents.SUSPICIOUS_STEW).maxCount(1),
    new int[] {1,21}
  );

  public static final MobMilk PIGLIN_BRUTE_MILK = new MobMilk (
    new FabricItemSettings().group(ItemGroup.FOOD).maxCount(1),
    new int[] {1,22}
  );

  public static final MobSoup PIGLIN_BRUTE_SOUP = new MobSoup (
    new FabricItemSettings().group(ItemGroup.FOOD).food(FoodComponents.SUSPICIOUS_STEW).maxCount(1),
    new int[] {1,22}
  );

  public static final MobMilk MAGMA_CUBE_MILK = new MobMilk (
    new FabricItemSettings().group(ItemGroup.FOOD).maxCount(1),
    new int[] {1,23}
  );

  public static final MobSoup MAGMA_CUBE_SOUP = new MobSoup (
    new FabricItemSettings().group(ItemGroup.FOOD).food(FoodComponents.SUSPICIOUS_STEW).maxCount(1),
    new int[] {1,23}
  );

  public static final MobMilk RAVAGER_MILK = new MobMilk (
    new FabricItemSettings().group(ItemGroup.FOOD).maxCount(1),
    new int[] {1,24}
  );

  public static final MobSoup RAVAGER_SOUP = new MobSoup (
    new FabricItemSettings().group(ItemGroup.FOOD).food(FoodComponents.SUSPICIOUS_STEW).maxCount(1),
    new int[] {1,24}
  );

  public static final MobMilk SHULKER_MILK = new MobMilk (
    new FabricItemSettings().group(ItemGroup.FOOD).maxCount(1),
    new int[] {1,25}
  );

  public static final MobSoup SHULKER_SOUP = new MobSoup (
    new FabricItemSettings().group(ItemGroup.FOOD).food(FoodComponents.SUSPICIOUS_STEW).maxCount(1),
    new int[] {1,25}
  );

  public static final MobMilk SILVERFISH_MILK = new MobMilk (
    new FabricItemSettings().group(ItemGroup.FOOD).maxCount(1),
    new int[] {1,26}
  );

  public static final MobSoup SILVERFISH_SOUP = new MobSoup (
    new FabricItemSettings().group(ItemGroup.FOOD).food(FoodComponents.SUSPICIOUS_STEW).maxCount(1),
    new int[] {1,26}
  );

  public static final MobMilk SKELETON_MILK = new MobMilk (
    new FabricItemSettings().group(ItemGroup.FOOD).maxCount(1),
    new int[] {1,27}
  );

  public static final MobSoup SKELETON_SOUP = new MobSoup (
    new FabricItemSettings().group(ItemGroup.FOOD).food(FoodComponents.SUSPICIOUS_STEW).maxCount(1),
    new int[] {1,27}
  );

  public static final MobMilk VINDICATOR_MILK = new MobMilk (
    new FabricItemSettings().group(ItemGroup.FOOD).maxCount(1),
    new int[] {1,28}
  );

  public static final MobSoup VINDICATOR_SOUP = new MobSoup (
    new FabricItemSettings().group(ItemGroup.FOOD).food(FoodComponents.SUSPICIOUS_STEW).maxCount(1),
    new int[] {1,28}
  );

  public static final MobMilk VEX_MILK = new MobMilk (
    new FabricItemSettings().group(ItemGroup.FOOD).maxCount(1),
    new int[] {1,29}
  );

  public static final MobSoup VEX_SOUP = new MobSoup (
    new FabricItemSettings().group(ItemGroup.FOOD).food(FoodComponents.SUSPICIOUS_STEW).maxCount(1),
    new int[] {1,29}
  );

  public static final MobMilk STRAY_MILK = new MobMilk (
    new FabricItemSettings().group(ItemGroup.FOOD).maxCount(1),
    new int[] {1,30}
  );

  public static final MobSoup STRAY_SOUP = new MobSoup (
    new FabricItemSettings().group(ItemGroup.FOOD).food(FoodComponents.SUSPICIOUS_STEW).maxCount(1),
    new int[] {1,30}
  );

  public static final MobSoup COW_SOUP = new MobSoup (
    new FabricItemSettings().group(ItemGroup.FOOD).food(FoodComponents.SUSPICIOUS_STEW).maxCount(1),
    new int[] {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30}
  );

  @Override
  public void onInitialize() {
    LOGGER.info("Adding mob milk and soup items.");

    Registry.register(Registry.ITEM, new Identifier("glow_squid_milk"), GLOW_SQUID_MILK);
    Registry.register(Registry.ITEM, new Identifier("glow_squid_soup"), GLOW_SQUID_SOUP);
    Registry.register(Registry.ITEM, new Identifier("fox_milk"), FOX_MILK);
    Registry.register(Registry.ITEM, new Identifier("fox_soup"), FOX_SOUP);
    Registry.register(Registry.ITEM, new Identifier("donkey_milk"), DONKEY_MILK);
    Registry.register(Registry.ITEM, new Identifier("donkey_soup"), DONKEY_SOUP);
    Registry.register(Registry.ITEM, new Identifier("cod_milk"), COD_MILK);
    Registry.register(Registry.ITEM, new Identifier("cod_soup"), COD_SOUP);
    Registry.register(Registry.ITEM, new Identifier("chicken_milk"), CHICKEN_MILK);
    Registry.register(Registry.ITEM, new Identifier("chicken_soup"), CHICKEN_SOUP);
    Registry.register(Registry.ITEM, new Identifier("cat_milk"), CAT_MILK);
    Registry.register(Registry.ITEM, new Identifier("cat_soup"), CAT_SOUP);
    Registry.register(Registry.ITEM, new Identifier("horse_milk"), HORSE_MILK);
    Registry.register(Registry.ITEM, new Identifier("horse_soup"), HORSE_SOUP);
    Registry.register(Registry.ITEM, new Identifier("bat_milk"), BAT_MILK);
    Registry.register(Registry.ITEM, new Identifier("bat_soup"), BAT_SOUP);
    Registry.register(Registry.ITEM, new Identifier("axolotl_milk"), AXOLOTL_MILK);
    Registry.register(Registry.ITEM, new Identifier("axolotl_soup"), AXOLOTL_SOUP);
    Registry.register(Registry.ITEM, new Identifier("salmon_milk"), SALMON_MILK);
    Registry.register(Registry.ITEM, new Identifier("salmon_soup"), SALMON_SOUP);
    Registry.register(Registry.ITEM, new Identifier("pufferfish_milk"), PUFFERFISH_MILK);
    Registry.register(Registry.ITEM, new Identifier("pufferfish_soup"), PUFFERFISH_SOUP);
    Registry.register(Registry.ITEM, new Identifier("rabbit_milk"), RABBIT_MILK);
    Registry.register(Registry.ITEM, new Identifier("rabbit_soup"), RABBIT_SOUP);
    Registry.register(Registry.ITEM, new Identifier("polar_bear_milk"), POLAR_BEAR_MILK);
    Registry.register(Registry.ITEM, new Identifier("polar_bear_soup"), POLAR_BEAR_SOUP);
    Registry.register(Registry.ITEM, new Identifier("pig_milk"), PIG_MILK);
    Registry.register(Registry.ITEM, new Identifier("pig_soup"), PIG_SOUP);
    Registry.register(Registry.ITEM, new Identifier("piglin_milk"), PIGLIN_MILK);
    Registry.register(Registry.ITEM, new Identifier("piglin_soup"), PIGLIN_SOUP);
    Registry.register(Registry.ITEM, new Identifier("ocelot_milk"), OCELOT_MILK);
    Registry.register(Registry.ITEM, new Identifier("ocelot_soup"), OCELOT_SOUP);
    Registry.register(Registry.ITEM, new Identifier("mule_milk"), MULE_MILK);
    Registry.register(Registry.ITEM, new Identifier("mule_soup"), MULE_SOUP);
    Registry.register(Registry.ITEM, new Identifier("parrot_milk"), PARROT_MILK);
    Registry.register(Registry.ITEM, new Identifier("parrot_soup"), PARROT_SOUP);
    Registry.register(Registry.ITEM, new Identifier("wandering_trader_milk"), WANDERING_TRADER_MILK);
    Registry.register(Registry.ITEM, new Identifier("wandering_trader_soup"), WANDERING_TRADER_SOUP);
    Registry.register(Registry.ITEM, new Identifier("sheep_milk"), SHEEP_MILK);
    Registry.register(Registry.ITEM, new Identifier("sheep_soup"), SHEEP_SOUP);
    Registry.register(Registry.ITEM, new Identifier("skeleton_horse_milk"), SKELETON_HORSE_MILK);
    Registry.register(Registry.ITEM, new Identifier("skeleton_horse_soup"), SKELETON_HORSE_SOUP);
    Registry.register(Registry.ITEM, new Identifier("villager_milk"), VILLAGER_MILK);
    Registry.register(Registry.ITEM, new Identifier("villager_soup"), VILLAGER_SOUP);
    Registry.register(Registry.ITEM, new Identifier("snow_golem_milk"), SNOW_GOLEM_MILK);
    Registry.register(Registry.ITEM, new Identifier("snow_golem_soup"), SNOW_GOLEM_SOUP);
    Registry.register(Registry.ITEM, new Identifier("squid_milk"), SQUID_MILK);
    Registry.register(Registry.ITEM, new Identifier("squid_soup"), SQUID_SOUP);
    Registry.register(Registry.ITEM, new Identifier("strider_milk"), STRIDER_MILK);
    Registry.register(Registry.ITEM, new Identifier("strider_soup"), STRIDER_SOUP);
    Registry.register(Registry.ITEM, new Identifier("tropical_fish_milk"), TROPICAL_FISH_MILK);
    Registry.register(Registry.ITEM, new Identifier("tropical_fish_soup"), TROPICAL_FISH_SOUP);
    Registry.register(Registry.ITEM, new Identifier("turtle_milk"), TURTLE_MILK);
    Registry.register(Registry.ITEM, new Identifier("turtle_soup"), TURTLE_SOUP);
    Registry.register(Registry.ITEM, new Identifier("goat_milk"), GOAT_MILK);
    Registry.register(Registry.ITEM, new Identifier("goat_soup"), GOAT_SOUP);
    Registry.register(Registry.ITEM, new Identifier("enderman_milk"), ENDERMAN_MILK);
    Registry.register(Registry.ITEM, new Identifier("enderman_soup"), ENDERMAN_SOUP);
    Registry.register(Registry.ITEM, new Identifier("llama_milk"), LLAMA_MILK);
    Registry.register(Registry.ITEM, new Identifier("llama_soup"), LLAMA_SOUP);
    Registry.register(Registry.ITEM, new Identifier("cave_spider_milk"), CAVE_SPIDER_MILK);
    Registry.register(Registry.ITEM, new Identifier("cave_spider_soup"), CAVE_SPIDER_SOUP);
    Registry.register(Registry.ITEM, new Identifier("bee_milk"), BEE_MILK);
    Registry.register(Registry.ITEM, new Identifier("bee_soup"), BEE_SOUP);
    Registry.register(Registry.ITEM, new Identifier("panda_milk"), PANDA_MILK);
    Registry.register(Registry.ITEM, new Identifier("panda_soup"), PANDA_SOUP);
    Registry.register(Registry.ITEM, new Identifier("zombified_piglin_milk"), ZOMBIFIED_PIGLIN_MILK);
    Registry.register(Registry.ITEM, new Identifier("zombified_piglin_soup"), ZOMBIFIED_PIGLIN_SOUP);
    Registry.register(Registry.ITEM, new Identifier("spider_milk"), SPIDER_MILK);
    Registry.register(Registry.ITEM, new Identifier("spider_soup"), SPIDER_SOUP);
    Registry.register(Registry.ITEM, new Identifier("wolf_milk"), WOLF_MILK);
    Registry.register(Registry.ITEM, new Identifier("wolf_soup"), WOLF_SOUP);
    Registry.register(Registry.ITEM, new Identifier("dolphin_milk"), DOLPHIN_MILK);
    Registry.register(Registry.ITEM, new Identifier("dolphin_soup"), DOLPHIN_SOUP);
    Registry.register(Registry.ITEM, new Identifier("trader_llama_milk"), TRADER_LLAMA_MILK);
    Registry.register(Registry.ITEM, new Identifier("trader_llama_soup"), TRADER_LLAMA_SOUP);
    Registry.register(Registry.ITEM, new Identifier("zoglin_milk"), ZOGLIN_MILK);
    Registry.register(Registry.ITEM, new Identifier("zoglin_soup"), ZOGLIN_SOUP);
    Registry.register(Registry.ITEM, new Identifier("wither_skeleton_milk"), WITHER_SKELETON_MILK);
    Registry.register(Registry.ITEM, new Identifier("wither_skeleton_soup"), WITHER_SKELETON_SOUP);
    Registry.register(Registry.ITEM, new Identifier("witch_milk"), WITCH_MILK);
    Registry.register(Registry.ITEM, new Identifier("witch_soup"), WITCH_SOUP);
    Registry.register(Registry.ITEM, new Identifier("blaze_milk"), BLAZE_MILK);
    Registry.register(Registry.ITEM, new Identifier("blaze_soup"), BLAZE_SOUP);
    Registry.register(Registry.ITEM, new Identifier("drowned_milk"), DROWNED_MILK);
    Registry.register(Registry.ITEM, new Identifier("drowned_soup"), DROWNED_SOUP);
    Registry.register(Registry.ITEM, new Identifier("creeper_milk"), CREEPER_MILK);
    Registry.register(Registry.ITEM, new Identifier("creeper_soup"), CREEPER_SOUP);
    Registry.register(Registry.ITEM, new Identifier("endermite_milk"), ENDERMITE_MILK);
    Registry.register(Registry.ITEM, new Identifier("endermite_soup"), ENDERMITE_SOUP);
    Registry.register(Registry.ITEM, new Identifier("evoker_milk"), EVOKER_MILK);
    Registry.register(Registry.ITEM, new Identifier("evoker_soup"), EVOKER_SOUP);
    Registry.register(Registry.ITEM, new Identifier("ghast_milk"), GHAST_MILK);
    Registry.register(Registry.ITEM, new Identifier("ghast_soup"), GHAST_SOUP);
    Registry.register(Registry.ITEM, new Identifier("guardian_milk"), GUARDIAN_MILK);
    Registry.register(Registry.ITEM, new Identifier("guardian_soup"), GUARDIAN_SOUP);
    Registry.register(Registry.ITEM, new Identifier("hoglin_milk"), HOGLIN_MILK);
    Registry.register(Registry.ITEM, new Identifier("hoglin_soup"), HOGLIN_SOUP);
    Registry.register(Registry.ITEM, new Identifier("husk_milk"), HUSK_MILK);
    Registry.register(Registry.ITEM, new Identifier("husk_soup"), HUSK_SOUP);
    Registry.register(Registry.ITEM, new Identifier("phantom_milk"), PHANTOM_MILK);
    Registry.register(Registry.ITEM, new Identifier("phantom_soup"), PHANTOM_SOUP);
    Registry.register(Registry.ITEM, new Identifier("piglin_brute_milk"), PIGLIN_BRUTE_MILK);
    Registry.register(Registry.ITEM, new Identifier("piglin_brute_soup"), PIGLIN_BRUTE_SOUP);
    Registry.register(Registry.ITEM, new Identifier("magma_cube_milk"), MAGMA_CUBE_MILK);
    Registry.register(Registry.ITEM, new Identifier("magma_cube_soup"), MAGMA_CUBE_SOUP);
    Registry.register(Registry.ITEM, new Identifier("ravager_milk"), RAVAGER_MILK);
    Registry.register(Registry.ITEM, new Identifier("ravager_soup"), RAVAGER_SOUP);
    Registry.register(Registry.ITEM, new Identifier("shulker_milk"), SHULKER_MILK);
    Registry.register(Registry.ITEM, new Identifier("shulker_soup"), SHULKER_SOUP);
    Registry.register(Registry.ITEM, new Identifier("silverfish_milk"), SILVERFISH_MILK);
    Registry.register(Registry.ITEM, new Identifier("silverfish_soup"), SILVERFISH_SOUP);
    Registry.register(Registry.ITEM, new Identifier("skeleton_milk"), SKELETON_MILK);
    Registry.register(Registry.ITEM, new Identifier("skeleton_soup"), SKELETON_SOUP);
    Registry.register(Registry.ITEM, new Identifier("vindicator_milk"), VINDICATOR_MILK);
    Registry.register(Registry.ITEM, new Identifier("vindicator_soup"), VINDICATOR_SOUP);
    Registry.register(Registry.ITEM, new Identifier("vex_milk"), VEX_MILK);
    Registry.register(Registry.ITEM, new Identifier("vex_soup"), VEX_SOUP);
    Registry.register(Registry.ITEM, new Identifier("stray_milk"), STRAY_MILK);
    Registry.register(Registry.ITEM, new Identifier("stray_soup"), STRAY_SOUP);
    Registry.register(Registry.ITEM, new Identifier("cow_soup"), COW_SOUP);
  }
}
