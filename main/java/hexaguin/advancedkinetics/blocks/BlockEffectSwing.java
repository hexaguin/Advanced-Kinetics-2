package hexaguin.advancedkinetics.blocks;

import net.minecraft.entity.Entity;

public class BlockEffectSwing extends EffectBlock {
	@Override
	String name(){
		return "BlockEffectSwing";
	}
	
	private double maxEffect = 0.03;
	
	@Override
	public void ApplyEffect(double sourceX, double sourceY, double sourceZ, double xOffset, double yOffset, double zOffset, Entity entity){
		double distanceX = entity.posX-sourceX; 
		double distanceY = entity.posY-sourceY;
		double distanceZ = entity.posZ-sourceZ;
		
		boolean shouldApply = true;
		if(xOffset!=0){
			if(!SamePolarity(xOffset,distanceX)){
				shouldApply=false;
			}
		}
		if(yOffset!=0){
			if(!SamePolarity(yOffset,distanceY)){
				shouldApply=false;
			}
		}
		if(zOffset!=0){
			if(!SamePolarity(zOffset,distanceZ)){
				shouldApply=false;
			}
		}
		
		if(!shouldApply){
			return;
		}
		
		double distance = GetRadius(distanceX,distanceY,distanceZ);
		
		double pullEffect = 0.06*(distance-8);
		if(pullEffect<0){
			pullEffect = 0;
		}
		double reduction = pullEffect/distance;
		
		entity.motionX += 0-(distanceX*reduction);
		entity.motionY += 0-(distanceY*reduction);
		entity.motionZ += 0-(distanceZ*reduction);
	}
	
	private double GetRadius(double x, double y, double z){
		return Math.sqrt((x*x)+(y*y)+(z*z));
	}
	
	private boolean SamePolarity(double x, double y){
		if(x==0&y==0){
			return true;
		}else if(x<0&y<0){
			return true;
		}else if(x>0&y>0){
			return true;
		}else return false;
	}
}
