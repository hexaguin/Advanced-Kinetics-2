package hexaguin.advancedkinetics.blocks;

import cpw.mods.fml.common.registry.GameRegistry;
import hexaguin.advancedkinetics.lib.Constants;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class BlockCaution extends Block {
	public BlockCaution(){
		super(Material.cloth);
		this.setBlockName(Constants.MODID + "_" + "cautionBlock");
		this.setCreativeTab(CreativeTabs.tabBlock);
		GameRegistry.registerBlock(this, "cautionBlock");
	}
}
