package hexaguin.advancedkinetics.blocks;

import net.minecraft.block.Block;

public final class Blocks {
	
	public static Block cautionBlock;
	public static Block basicFieldBlock;
	public static Block pullEffectBlock;
	public static Block moveEffectBlock;
	public static Block livingFilterBlock;
	public static Block nonLivingFilterBlock;
	public static Block playerFilterBlock;
	public static Block accelerateEffectBlock;
	public static Block slowEffectBlock;
	public static Block doubleRangeModifierBlock;
	public static Block halfRangeModifierBlock;
	public static Block doubleSizeModifierBlock;
	public static Block burnEffectBlock;
	public static Block bounceEffectBlock;
	public static Block targetingFieldBlock;
	public static Block disarmEffectBlock;
	
	public static void init(){ //TODO: Add my own tab
		cautionBlock = new BlockCaution();
		basicFieldBlock = new BlockBasicField();
		pullEffectBlock = new BlockEffectPull();
		moveEffectBlock = new BlockEffectMove();
		livingFilterBlock = new BlockEntityFilter("Living");
		nonLivingFilterBlock = new BlockEntityFilter("NonLiving");
		playerFilterBlock = new BlockEntityFilter("Players");
		accelerateEffectBlock = new BlockEffectAccelerate();
		slowEffectBlock = new BlockEffectSlow();
		doubleRangeModifierBlock = new BlockModifier("DoubleRange");
		doubleRangeModifierBlock = new BlockModifier("HalfRange");
		doubleSizeModifierBlock = new BlockModifier("DoubleSize");
		burnEffectBlock = new BlockEffectBurn();
		bounceEffectBlock = new BlockEffectBounce();
		targetingFieldBlock = new BlockTargetingField();
		disarmEffectBlock = new BlockEffectDisarm();
	}
}
