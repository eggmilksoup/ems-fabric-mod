echo { > en_us.json

separate()
{
  str="$(printf "$1" | cut -c 1 | tr [:lower:] [:upper:] | tr -d '\n'; printf "$1" | cut -c 2-)"
  while echo $str | grep -q _
  do
    str="$(printf "$str" | cut -f 1 -d _ | tr -d '\n'; printf " "; printf "$str" | cut -f 2- -d _ | cut -c 1 | tr [:lower:] [:upper:] |
      tr -d '\n'; printf "$str" | cut -f 2- -d _ | cut -c 2-)"
  done
  printf "$str"
}

for mob in glow_squid fox donkey cod chicken cat horse bat axolotl salmon pufferfish rabbit polar_bear pig piglin ocelot mule parrot wandering_trader sheep skeleton_horse villager snow_golem squid strider tropical_fish turtle goat enderman llama cave_spider bee panda zombified_piglin spider wolf dolphin trader_llama zoglin wither_skeleton witch blaze drowned creeper endermite evoker ghast guardian hoglin husk phantom piglin_brute magma_cube ravager shulker silverfish skeleton vindicator vex stray
do
  echo "  \"item.minecraft.${mob}_soup\": \"$(separate "${mob}_soup")\"," >> en_us.json
  echo "  \"item.minecraft.${mob}_milk\": \"$(separate "${mob}_milk")\"," >> en_us.json
done

cat >> en_us.json <<EOF
  "item.minecraft.cow_soup": "Cow Soup"
}
EOF
