package hexaguin.advancedkinetics.tileentities;

import hexaguin.advancedkinetics.blocks.BlockEntityFilter;
import hexaguin.advancedkinetics.blocks.BlockModifier;
import hexaguin.advancedkinetics.blocks.EffectBlock;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import net.minecraft.block.Block;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.AxisAlignedBB;

public class TileEntityTargetingField extends TileEntity {//TODO: Fix NBT
	
	public void updateEntity(){
		if(this.worldObj.getWorldTime()%1==0){
		
			String projectile = null;
			String target = null;
			boolean complete = true;
			
			Block block;
			
			double effectRange = 16;
			
			block = this.worldObj.getBlock(xCoord, yCoord+1, zCoord); // get the top block
			if(block instanceof BlockEntityFilter){
				projectile=((BlockEntityFilter)block).blockedType;
			}else{
				complete=false;
			}
			
			block = this.worldObj.getBlock(xCoord, yCoord-1, zCoord); // get the bottom block
			if(block instanceof BlockEntityFilter){
				target=((BlockEntityFilter)block).blockedType;
			}else{
				complete=false;
			}
			
			if(complete){
				
				AxisAlignedBB area = AxisAlignedBB.getBoundingBox((double)this.xCoord, (double)this.yCoord, (double)this.zCoord, (double)(this.xCoord + 1), (double)(this.yCoord + 1), (double)(this.zCoord + 1)).expand(effectRange, effectRange, effectRange);
				List inArea = this.worldObj.getEntitiesWithinAABB(Entity.class, area);
				ArrayList projectiles = new ArrayList();
				Iterator iterator = inArea.iterator();
				Entity entity;
				Entity targetEntity = null;
				
				while (iterator.hasNext()){
					entity = (Entity)iterator.next();
					if(entity instanceof EntityPlayer){
						if(target=="Players"){
							targetEntity=entity;
						} else if(projectile=="Players") {
							projectiles.add(entity);
						}
					} else if(entity instanceof EntityLiving) {
						if(target=="Living"){
							targetEntity=entity;
						} else if(projectile=="Living"){
							projectiles.add(entity);
						}
						//At this point we know that the entity is non-living.
					} else if(target=="NonLiving"){
						targetEntity=entity;
					} else if(projectile=="NonLiving"){
						projectiles.add(entity);
					}
				}
				
				if((targetEntity != null) && !projectiles.isEmpty()){
					Iterator projectileIterator = projectiles.iterator();
					double distanceX;
					double distanceY;
					double distanceZ;
					
					while (projectileIterator.hasNext()){
						entity = (Entity)projectileIterator.next();
						
						distanceX = entity.posX - targetEntity.posX;
						distanceY = entity.posY - targetEntity.posY;
						distanceZ = entity.posZ - targetEntity.posZ;
						
						double totalDistance = Math.sqrt(
								Math.pow(distanceX, 2) + Math.pow(distanceY, 2) + Math.pow(distanceZ, 2));
						double reduction = 0.3/totalDistance;
						
						entity.motionX += 0-(distanceX*reduction);
						entity.motionY += 0-(distanceY*reduction);
						entity.motionZ += 0-(distanceZ*reduction);
					}
				}
			}
		}
	}
}