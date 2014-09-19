package hexaguin.advancedkinetics.items;

import hexaguin.advancedkinetics.blocks.AKBlocks;
import cpw.mods.fml.common.Loader;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class AKItems {
	
	public static Item glideGenerator;

	public static void init() {
		glideGenerator = new ItemGlideGenerator();
		initRecipies();
	}
	
	private static void initRecipies(){
		ItemStack glideGeneratorStack = new ItemStack(glideGenerator);
		
		ItemStack fieldBlockStack = new ItemStack(AKBlocks.basicFieldBlock);
		ItemStack bounceEffectBlockStack = new ItemStack(AKBlocks.bounceEffectBlock);
		ItemStack accelerateEffectBlockStack = new ItemStack(AKBlocks.accelerateEffectBlock);
		ItemStack nonLivingFilterBlock = new ItemStack(AKBlocks.nonLivingFilterBlock);
		ItemStack LivingFilterBlock = new ItemStack(AKBlocks.livingFilterBlock);
		ItemStack slowEffectBlockStack = new ItemStack(AKBlocks.slowEffectBlock);
		
		GameRegistry.addRecipe(glideGeneratorStack,
				"ban",
				"aca",
				"las",
				'b',bounceEffectBlockStack,
				'a',accelerateEffectBlockStack,
				'n',nonLivingFilterBlock,
				'c',fieldBlockStack,
				'l',LivingFilterBlock,
				's',slowEffectBlockStack);
	}
}
