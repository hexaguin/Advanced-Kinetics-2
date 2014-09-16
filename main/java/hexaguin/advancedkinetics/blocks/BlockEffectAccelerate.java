package hexaguin.advancedkinetics.blocks;

import net.minecraft.entity.Entity;

public class BlockEffectAccelerate extends EffectBlock {
	@Override
	String name(){
		return "BlockEffectAccelerate";
	}
	
	private double maxEffect = 1.1;
	
	@Override
	public void ApplyEffect(double sourceX, double sourceY, double sourceZ, double xOffset, double yOffset, double zOffset, Entity entity){
		if(entity.motionX+entity.motionY+entity.motionZ<15){
			if((entity.motionX>0 && xOffset>0)|(entity.motionX<0 && xOffset<0)){
				entity.motionX*=maxEffect;
			}
			if((entity.motionY>0 && yOffset>0)|(entity.motionY<0 && yOffset<0)){
				entity.motionY*=maxEffect;
			}
			if((entity.motionZ>0 && zOffset>0)|(entity.motionZ<0 && xOffset<0)){
				entity.motionZ*=maxEffect;
			}
		}
		
		if(Math.random()<0.3){
			//entity.worldObj.spawnParticle("fireworksSpark",
			//		sourceX+0.5,
			//		sourceY+0.5,
			//		sourceZ+0.5,
			//		xOffset/16,
			//		yOffset/16,
			//		zOffset/16);
			
		}
	}
	
}
