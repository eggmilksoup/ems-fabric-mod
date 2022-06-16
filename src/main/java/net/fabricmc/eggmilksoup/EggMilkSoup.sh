#!/bin/sh
cat > EggMilkSoup.java <<EOF
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

EOF
mob=
cat moblist.tsv | while read mob
do
  echo $mob
  echo "  public static final MobMilk $(printf "$mob" | cut -f 1 | tr [:lower:] [:upper:] | tr -d '\n')_MILK = new MobMilk (" >> EggMilkSoup.java
  echo "    new FabricItemSettings().group(ItemGroup.FOOD).maxCount(1)," >> EggMilkSoup.java
  echo "    new int[] {$(echo "$mob" | cut -f 2 | tr -d '\n')}" >> EggMilkSoup.java
  echo "  );" >> EggMilkSoup.java
  echo >> EggMilkSoup.java
done
echo $mob
cat >> EggMilkSoup.java <<EOF
  @Override
	public void onInitialize() {
		LOGGER.info("Adding EMS Milk items.");

EOF

cut -f 1 moblist.tsv | while read mob
do
  echo "    Registry.register(Registry.ITEM, new Identifier(\"${mob}_milk\"), $(printf $mob | tr [:lower:] [:upper:])_MILK);" >> EggMilkSoup.java
done

cat >> EggMilkSoup.java <<EOF
  }
}
EOF