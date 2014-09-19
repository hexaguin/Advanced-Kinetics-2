package hexaguin.advancedkinetics.blocks;

import cpw.mods.fml.common.registry.GameRegistry;
import hexaguin.advancedkinetics.AdvancedKinetics;
import hexaguin.advancedkinetics.lib.Constants;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class BlockCaution extends Block {
	public BlockCaution(){
		super(Material.cloth);
		this.setBlockName(Constants.MODID + "_" + "cautionBlock");
		this.setCreativeTab(AdvancedKinetics.tabAdvancedKinetics);
		GameRegistry.registerBlock(this, "cautionBlock");
		this.setBlockTextureName(Constants.MODID + ":BlockCaution");
		this.setHardness((float)0.8);
	}
}
