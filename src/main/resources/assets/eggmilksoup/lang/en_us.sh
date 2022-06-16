echo { > en_us.json

for mob in glow_squid fox donkey cod chicken cat horse bat axolotl salmon pufferfish rabbit polar_bear pig piglin ocelot mule parrot wandering_trader sheep skeleton_horse villager snow_golem squid strider tropical_fish turtle goat enderman llama cave_spider bee panda zombified_piglin spider wolf dolphin trader_llama zoglin wither_skeleton witch blaze drowned creeper endermite evoker ghast guardian hoglin husk phantom piglin_brute magma_cube ravager shulker silverfish skeleton vindicator vex stray
do
  echo "  \"item.minecraft.${mob}_soup\": \"$(printf "$mob" | cut -c 1 | tr [:lower:] [:upper:] | tr -d '\n'; printf "$mob" | cut -c 2-) Soup\"," >> en_us.json
  echo "  \"item.minecraft.${mob}_milk\": \"$(printf "$mob" | cut -c 1 | tr [:lower:] [:upper:] | tr -d '\n'; printf "$mob" | cut -c 2-) Milk\"," >> en_us.json
done

cat >> en_us.json <<EOF
  "item.minecraft.cow_soup": "Cow Soup"
}
EOF