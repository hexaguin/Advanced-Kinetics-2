package hexaguin.advancedkinetics.tileentities;

import hexaguin.advancedkinetics.blocks.BlockEntityFilter;
import hexaguin.advancedkinetics.blocks.BlockModifier;
import hexaguin.advancedkinetics.blocks.EffectBlock;

import java.util.Iterator;
import java.util.List;

import net.minecraft.block.Block;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.AxisAlignedBB;

public class TileEntityBasicField extends TileEntity {//TODO: Fix NBT
	
	public void updateEntity(){
		if(this.worldObj.getWorldTime()%1==0){
		
			boolean affectPlayers = true;
			boolean affectLiving = true;
			boolean affectNonLiving = true;
			double effectRange = 8;
			int range = 1;
			Block block;
			
			for(int xOffset=0-range; xOffset<=range; xOffset++){ //Modifier Blocks
				for(int yOffset=0-range; yOffset<=range; yOffset++){
					for(int zOffset=0-range; zOffset<=range; zOffset++){
						block=this.worldObj.getBlock(xCoord+xOffset, yCoord+yOffset, zCoord+zOffset);
						
						if(block instanceof BlockModifier){
							String modifierType=((BlockModifier)block).modifierType;
							if(modifierType=="DoubleRange"){
								effectRange*=2;
							} else if(modifierType=="HalfRange"){
								effectRange*=0.5;
							} else if(modifierType=="DoubleSize"){
								if(range<4){
									range*=2;
								}
							}
						}
					}
				}
			}
			
			for(int xOffset=0-range; xOffset<=range; xOffset++){ //Blacklist Blocks
				for(int yOffset=0-range; yOffset<=range; yOffset++){
					for(int zOffset=0-range; zOffset<=range; zOffset++){
						block=this.worldObj.getBlock(xCoord+xOffset, yCoord+yOffset, zCoord+zOffset);
						
						if(block instanceof BlockEntityFilter){
							String blockedType=((BlockEntityFilter)block).blockedType;
							if(blockedType=="Players"){
								affectPlayers = false;
							} else if(blockedType=="Living"){
								affectLiving = false;
							} else if(blockedType=="NonLiving"){
								affectNonLiving = false;
							}
						}
					}
				}
			}
			
			AxisAlignedBB area = AxisAlignedBB.getBoundingBox((double)this.xCoord, (double)this.yCoord, (double)this.zCoord, (double)(this.xCoord + 1), (double)(this.yCoord + 1), (double)(this.zCoord + 1)).expand(effectRange, effectRange, effectRange);
			List inarea = this.worldObj.getEntitiesWithinAABB(Entity.class, area);
			Iterator iterator = inarea.iterator();
			Entity entity;
			
			while (iterator.hasNext()){
				entity = (Entity)iterator.next();
				if(entity instanceof EntityPlayer){
					if(affectPlayers){
						applyEffects(entity, range);
					}
				} else if(entity instanceof EntityLiving) {
					if(affectLiving){
						applyEffects(entity, range);
					}
				} else if(affectNonLiving){
					applyEffects(entity, range);
				}
			}
			
		}
	}

	private void applyEffects(Entity entity, int range){
		Block block;
		for(int xOffset=0-range; xOffset<=range; xOffset++){ //Effect Blocks
			for(int yOffset=0-range; yOffset<=range; yOffset++){
				for(int zOffset=0-range; zOffset<=range; zOffset++){
					block=this.worldObj.getBlock(xCoord+xOffset, yCoord+yOffset, zCoord+zOffset);
					if(block instanceof EffectBlock){
						((EffectBlock) block).ApplyEffect(xCoord, yCoord, zCoord, xOffset, yOffset, zOffset, entity);
					}
				}	
			}
		}
	}
}