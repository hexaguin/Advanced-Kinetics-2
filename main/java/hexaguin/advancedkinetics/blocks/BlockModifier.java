package hexaguin.advancedkinetics.blocks;

import hexaguin.advancedkinetics.lib.Constants;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;

public class BlockModifier extends Block {
public String modifierType;
	
	public BlockModifier(String type){
		super(Material.iron);
		this.setBlockName(Constants.MODID + "_" + "BlockModifier"+type);
		this.setCreativeTab(CreativeTabs.tabBlock);
		GameRegistry.registerBlock(this, "BlockModifier"+type);
		this.modifierType = type; 
	}
}
