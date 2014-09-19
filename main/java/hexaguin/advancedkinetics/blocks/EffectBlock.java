package hexaguin.advancedkinetics.blocks;

import hexaguin.advancedkinetics.AdvancedKinetics;
import hexaguin.advancedkinetics.lib.Constants;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;

public class EffectBlock extends Block {
	public EffectBlock(){
		super(Material.iron);
		this.setBlockName(Constants.MODID + "_" + name());
		this.setBlockTextureName(Constants.MODID + ":" + name());
		this.lightValue = 5;
		this.lightOpacity = 1;
		this.setCreativeTab(AdvancedKinetics.tabAdvancedKinetics);
		this.setHardness((float)3);
		this.setHarvestLevel("pickaxe", 0);
		GameRegistry.registerBlock(this, name());
	}
	
	String name(){
		return "BlockEffect";
	}
	
	@Override
	public boolean isOpaqueCube(){
		return false;
	}
	
	public void ApplyEffect(double sourceX, double sourceY, double sourceZ, double xOffset, double yOffset, double zOffset, Entity entity){
		
	}
}
