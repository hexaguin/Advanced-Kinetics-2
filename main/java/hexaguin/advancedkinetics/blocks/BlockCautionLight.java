package hexaguin.advancedkinetics.blocks;

import cpw.mods.fml.common.registry.GameRegistry;
import hexaguin.advancedkinetics.lib.Constants;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class BlockCautionLight extends Block {
	public BlockCautionLight(){
		super(Material.cloth);
		this.setBlockName(Constants.MODID + "_" + "cautionLightBlock");
		this.setCreativeTab(CreativeTabs.tabBlock);
		GameRegistry.registerBlock(this, "cautionLightBlock");
		this.setBlockTextureName(Constants.MODID + ":BlockCautionLight");
		this.setHardness((float)0.8);
		this.lightValue=15;
	}
}
