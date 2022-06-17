for mob in glow_squid fox donkey cod chicken cat horse bat axolotl salmon pufferfish rabbit polar_bear pig piglin ocelot mule parrot wandering_trader sheep skeleton_horse villager snow_golem squid strider tropical_fish turtle goat enderman llama cave_spider bee panda zombified_piglin spider wolf dolphin trader_llama zoglin wither_skeleton witch blaze drowned creeper endermite evoker ghast guardian hoglin husk phantom piglin_brute magma_cube ravager shulker silverfish skeleton vindicator vex stray
do
  cat > ${mob}_soup.json <<EOF
{
	"parent": "item/generated",
	"textures": {
		"layer0": "minecraft:item/${mob}_soup"
	}
}
EOF
  cat > ${mob}_milk.json <<EOF
{
  "parent": "item/generated",
  "textures": {
    "layer0": "minecraft:item/${mob}_milk"
  }
}
EOF
done