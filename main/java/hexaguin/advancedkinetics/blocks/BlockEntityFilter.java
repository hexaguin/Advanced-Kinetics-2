package hexaguin.advancedkinetics.blocks;

import hexaguin.advancedkinetics.AdvancedKinetics;
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
		this.setBlockTextureName(Constants.MODID + ":BlockFilter" + type);
		this.setCreativeTab(AdvancedKinetics.tabAdvancedKinetics);
		GameRegistry.registerBlock(this, "BlockEntityFilter"+type);
		this.blockedType = type; 
		this.setHardness((float)3);
		this.setHarvestLevel("pickaxe", 0);
		this.lightValue = 5;
		this.lightOpacity = 1;
	}
	
	@Override
	public boolean isOpaqueCube(){
		return false;
	}
	
}
