package hexaguin.advancedkinetics.blocks;

import hexaguin.advancedkinetics.lib.Constants;
import hexaguin.advancedkinetics.tileentities.TileEntityBasicField;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.client.particle.EntityFX;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;
import cpw.mods.fml.common.registry.GameRegistry;

public class BlockBasicField extends BlockContainer {
	public BlockBasicField(){
		super(Material.cloth);
		this.setBlockName(Constants.MODID + "_" + "basicFieldBlock");
		this.setBlockTextureName(Constants.MODID + ":" + "BlockBasicField");
		this.lightValue = 15;
		this.lightOpacity = 1;
		this.setCreativeTab(CreativeTabs.tabBlock);
		GameRegistry.registerBlock(this, "basicFieldBlock");
		this.setHardness((float)3);
		this.setHarvestLevel("pickaxe", 0);
		GameRegistry.registerTileEntity(TileEntityBasicField.class, "basicFieldTileEntity");
	}

	@Override
	public TileEntity createNewTileEntity(World p_149915_1_, int p_149915_2_) {
		return new TileEntityBasicField();
	}
	
	@Override
	public boolean isOpaqueCube(){
		return false;
	}
	
	@Override
	public void onEntityCollidedWithBlock(World world, int xPos, int yPos, int zPos, Entity entity){
		if(entity instanceof EntityFX){
			entity.motionX*=0.7;
			entity.motionY*=0.7;
			entity.motionZ*=0.7;
		}
	}
	
	
}
