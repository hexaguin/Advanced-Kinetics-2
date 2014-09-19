package hexaguin.advancedkinetics.blocks;

import cpw.mods.fml.common.Loader;
import cpw.mods.fml.common.event.FMLInterModComms;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

public final class AKBlocks {
	
	public static Block cautionBlock;
	public static Block cautionLightBlock;
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
	
	public static void init(){ //TODO: Add my own tab
		cautionBlock = new BlockCaution();
		cautionLightBlock = new BlockCautionLight();
		basicFieldBlock = new BlockBasicField();
		targetingFieldBlock = new BlockTargetingField();
		
		pullEffectBlock = new BlockEffectPull();
		moveEffectBlock = new BlockEffectMove();
		burnEffectBlock = new BlockEffectBurn();
		bounceEffectBlock = new BlockEffectBounce();
		accelerateEffectBlock = new BlockEffectAccelerate();
		slowEffectBlock = new BlockEffectSlow();
		
		livingFilterBlock = new BlockEntityFilter("Living");
		nonLivingFilterBlock = new BlockEntityFilter("NonLiving");
		playerFilterBlock = new BlockEntityFilter("Players");
		
		doubleRangeModifierBlock = new BlockModifier("DoubleRange");
		halfRangeModifierBlock = new BlockModifier("HalfRange");
		doubleSizeModifierBlock = new BlockModifier("DoubleSize");
		
		
		if (Loader.isModLoaded("ForgeMicroblock"))
		{
		    FMLInterModComms.sendMessage("ForgeMicroblock", "microMaterial", new ItemStack(cautionBlock));
		    FMLInterModComms.sendMessage("ForgeMicroblock", "microMaterial", new ItemStack(cautionLightBlock));
		}
		initRecipies();
	}
	
	private static void initRecipies(){
		ItemStack cautionBlock32Stack = new ItemStack(cautionBlock,32);
		ItemStack cautionBlockStack = new ItemStack(cautionBlock);
		ItemStack cautionLightBlockStack = new ItemStack(cautionLightBlock);
		ItemStack basicFieldBlockStack = new ItemStack(basicFieldBlock);
		ItemStack targetingFieldBlockStack = new ItemStack(targetingFieldBlock);
		ItemStack pullEffectBlockStack = new ItemStack(pullEffectBlock);
		ItemStack moveEffectBlockStack = new ItemStack(moveEffectBlock);
		ItemStack burnEffectBlockStack = new ItemStack(burnEffectBlock);
		ItemStack bounceEffectBlockStack = new ItemStack(bounceEffectBlock);
		ItemStack accelerateEffectBlockStack = new ItemStack(accelerateEffectBlock);
		ItemStack slowEffectBlockStack = new ItemStack(slowEffectBlock);
		ItemStack livingFilterBlockStack = new ItemStack(livingFilterBlock);
		ItemStack nonLivingFilterBlockStack = new ItemStack(nonLivingFilterBlock);
		ItemStack playerFilterBlockStack = new ItemStack(playerFilterBlock);
		ItemStack doubleRangeModifierBlockStack = new ItemStack(doubleRangeModifierBlock);
		ItemStack halfRangeModifierBlock4Stack = new ItemStack(halfRangeModifierBlock, 4);
		ItemStack doubleSizeModifierBlockStack = new ItemStack(doubleSizeModifierBlock);
		
		
		ItemStack orangeWoolStack = new ItemStack(Blocks.wool, 1, 1);
		ItemStack blackWoolStack = new ItemStack(Blocks.wool, 1, 15);
		ItemStack glowstoneDustStack = new ItemStack(Items.glowstone_dust);
		ItemStack enderPearlStack = new ItemStack(Items.ender_pearl);
		ItemStack redstoneBlockStack = new ItemStack(Blocks.redstone_block);
		ItemStack goldIngotStack = new ItemStack(Items.gold_ingot);
		ItemStack enderEyeStack = new ItemStack(Items.ender_eye);
		ItemStack obsidianStack = new ItemStack(Blocks.obsidian);
		ItemStack glassStack = new ItemStack(Blocks.glass);
		ItemStack redstoneStack = new ItemStack(Items.redstone);
		ItemStack netherrackStack = new ItemStack(Blocks.netherrack);
		ItemStack blazeRodStack = new ItemStack(Items.blaze_rod);
		ItemStack slimeBallStack = new ItemStack(Items.slime_ball);
		ItemStack soulSandStack = new ItemStack(Blocks.soul_sand);
		ItemStack comparatorStack = new ItemStack(Items.comparator);
		ItemStack boneStack = new ItemStack(Items.bone);
		ItemStack repeaterStack = new ItemStack(Items.repeater);
		
		GameRegistry.addRecipe(cautionBlock32Stack,
				"xxy",
				"xyx",
				"yxx",
				'x',orangeWoolStack,
				'y',blackWoolStack
				);
		GameRegistry.addShapelessRecipe(cautionLightBlockStack,
				cautionBlockStack,glowstoneDustStack);
		GameRegistry.addRecipe(basicFieldBlockStack,
				"xyx",
				"yzy",
				"xyx",
				'x',enderPearlStack,
				'y',goldIngotStack,
				'z',redstoneBlockStack);
		GameRegistry.addRecipe(targetingFieldBlockStack,
				" x ",
				"yzy",
				" x ",
				'x',enderEyeStack,
				'y',pullEffectBlockStack,
				'z',basicFieldBlockStack);
		GameRegistry.addRecipe(pullEffectBlockStack,
				"yxy",
				"xzx",
				"yxy",
				'x',obsidianStack,
				'y',enderPearlStack,
				'z',glassStack);
		GameRegistry.addRecipe(moveEffectBlockStack,
				"xyx",
				"yzy",
				"xyx",
				'x',enderPearlStack,
				'y',redstoneStack,
				'z',glassStack);
		GameRegistry.addRecipe(accelerateEffectBlockStack,
				"xyx",
				"yzy",
				"xyx",
				'x',goldIngotStack,
				'y',redstoneStack,
				'z',glassStack);
		GameRegistry.addRecipe(burnEffectBlockStack,
				"xyx",
				"yzy",
				"xyx",
				'x',netherrackStack,
				'y',blazeRodStack,
				'z',glassStack);
		GameRegistry.addRecipe(bounceEffectBlockStack,
				"xyx",
				"yzy",
				"xyx",
				'x',slimeBallStack,
				'y',redstoneStack,
				'z',glassStack);
		GameRegistry.addRecipe(slowEffectBlockStack,
				"xyx",
				"yzy",
				"xyx",
				'x',soulSandStack,
				'y',redstoneStack,
				'z',glassStack);
		GameRegistry.addRecipe(nonLivingFilterBlockStack,
				"xyx",
				"yzy",
				"xyx",
				'x',enderEyeStack,
				'y',comparatorStack,
				'z',glassStack);
		GameRegistry.addRecipe(livingFilterBlockStack,
				"x x",
				" z ",
				"x x",
				'x',boneStack,
				'z',nonLivingFilterBlockStack);
		GameRegistry.addRecipe(playerFilterBlockStack,
				" x ",
				"xzx",
				" x ",
				'x',obsidianStack,
				'z',livingFilterBlockStack);
		GameRegistry.addRecipe(doubleRangeModifierBlockStack,
				"xyx",
				"yzy",
				"xyx",
				'x',enderPearlStack,
				'y',repeaterStack,
				'z',basicFieldBlockStack);
		GameRegistry.addRecipe(halfRangeModifierBlock4Stack,
				"x x",
				" z ",
				"x x",
				'x',enderPearlStack,
				'z',doubleRangeModifierBlockStack);
		GameRegistry.addRecipe(doubleSizeModifierBlockStack,
				"xyx",
				"yzy",
				"xyx",
				'x',doubleRangeModifierBlockStack,
				'y',repeaterStack,
				'z',basicFieldBlockStack);
	}
}
