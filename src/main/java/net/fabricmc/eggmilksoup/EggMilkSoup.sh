#!/bin/sh
cat > EggMilkSoup.java <<EOF
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

EOF
mob=
while read mob
do
  echo "  public static final MobMilk $(printf "$mob" | cut -f 1 | tr [:lower:] [:upper:] | tr -d '\n')_MILK = new MobMilk (" >> EggMilkSoup.java
  echo "    new FabricItemSettings().group(ItemGroup.FOOD).maxCount(1)," >> EggMilkSoup.java
  echo "    new int[] {$(echo "$mob" | cut -f 2 | tr -d '\n')}" >> EggMilkSoup.java
  echo "  );" >> EggMilkSoup.java
  echo >> EggMilkSoup.java
  echo "  public static final MobSoup $(printf "$mob" | cut -f 1 | tr [:lower:] [:upper:] | tr -d '\n')_SOUP = new MobSoup (" >> EggMilkSoup.java
  echo "    new FabricItemSettings().group(ItemGroup.FOOD).food(FoodComponents.SUSPICIOUS_STEW).maxCount(1)," >> EggMilkSoup.java
  echo "    new int[] {$(echo "$mob" | cut -f 2 | tr -d '\n')}," >> EggMilkSoup.java
  echo "    new int[] {$(echo "$mob" | cut -f 3 | tr -d '\n')}," >> EggMilkSoup.java
  echo "    new int[] {$(echo "$mob" | cut -f 4 | tr -d '\n')}" >> EggMilkSoup.java
  echo "  );" >> EggMilkSoup.java
  echo >> EggMilkSoup.java
done < moblist.tsv

cat >> EggMilkSoup.java <<EOF
  public static final MobSoup COW_SOUP = new MobSoup (
    new FabricItemSettings().group(ItemGroup.FOOD).food(FoodComponents.SUSPICIOUS_STEW).maxCount(1),
    new int[] {1,2,3,4,5,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,38,39,40,41,42,43,44,45,46,47,48,49},
    new int[] {600,600,600,600,600,600,600,600,600,600,600,600,600,600,600,600,600,600,600,600,600,600,600,600,600,600,600,600,600,600,600,600,600,600,600,600,600,600,600,600,600},
    new int[] {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0}
  );

  public static final GoatSoup GOAT_SOUP = new GoatSoup(new FabricItemSettings().group(ItemGroup.FOOD).food(FoodComponents.SUSPICIOUS_STEW).maxCount(1));

EOF

cat >> EggMilkSoup.java <<EOF
  @Override
  public void onInitialize() {
    LOGGER.info("Adding mob milk and soup items.");

EOF

cut -f 1 moblist.tsv | while read mob
do
  echo "    Registry.register(Registry.ITEM, new Identifier(\"${mob}_milk\"), $(printf $mob | tr [:lower:] [:upper:])_MILK);" >> EggMilkSoup.java
  echo "    Registry.register(Registry.ITEM, new Identifier(\"${mob}_soup\"), $(printf $mob | tr [:lower:] [:upper:])_SOUP);" >> EggMilkSoup.java
done

cat >> EggMilkSoup.java <<EOF
    Registry.register(Registry.ITEM, new Identifier("cow_soup"), COW_SOUP);
    Registry.register(Registry.ITEM, new Identifier("goat_soup"), GOAT_SOUP);
  }
}
EOF