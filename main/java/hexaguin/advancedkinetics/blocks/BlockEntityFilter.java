package hexaguin.advancedkinetics.blocks;

import hexaguin.advancedkinetics.lib.Constants;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;

public class BlockEntityFilter extends Block {
	public String blockedType;
	
	public BlockEntityFilter(String type){
		super(Material.iron);
		this.setBlockName(Constants.MODID + "_" + "BlockEntityFilter"+type);
		this.setCreativeTab(CreativeTabs.tabBlock);
		GameRegistry.registerBlock(this, "BlockEntityFilter"+type);
		this.blockedType = type; 
	}
	
}
