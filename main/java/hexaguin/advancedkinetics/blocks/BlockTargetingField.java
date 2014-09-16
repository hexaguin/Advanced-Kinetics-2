package hexaguin.advancedkinetics.blocks;

import cpw.mods.fml.common.registry.GameRegistry;
import hexaguin.advancedkinetics.lib.Constants;
import hexaguin.advancedkinetics.tileentities.TileEntityBasicField;
import hexaguin.advancedkinetics.tileentities.TileEntityTargetingField;
import net.minecraft.block.Block;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

public class BlockTargetingField extends BlockContainer {
	public BlockTargetingField(){
		super(Material.iron);
		this.setBlockName(Constants.MODID + "_" + "targetingFieldBlock");
		this.setBlockTextureName(Constants.MODID + ":" + "BlockTargetingField");
		this.setCreativeTab(CreativeTabs.tabBlock);
		GameRegistry.registerBlock(this, "targetingFieldBlock");
		this.setHardness((float)3);
		this.setHarvestLevel("pickaxe", 0);
		GameRegistry.registerTileEntity(TileEntityTargetingField.class, "targetingFieldTileEntity");
	}

	@Override
	public TileEntity createNewTileEntity(World p_149915_1_, int p_149915_2_) {
		return new TileEntityTargetingField();
	}
	
	@Override
	public boolean isOpaqueCube(){
		return false;
	}
	
}
