package hexaguin.advancedkinetics.blocks;

import net.minecraft.entity.Entity;

public class BlockEffectBounce extends EffectBlock {
	@Override
	String name(){
		return "BlockEffectBounce";
	}
	
	@Override
	public void ApplyEffect(double sourceX, double sourceY, double sourceZ, double xOffset, double yOffset, double zOffset, Entity entity){
		if((entity.motionX<0 && xOffset>0)|(entity.motionX>0 && xOffset<0)){
			entity.motionX*=-1;
		}
		if((entity.motionY<0 && yOffset>0)|(entity.motionY>0 && yOffset<0)){
			if(Math.abs(entity.motionY)>0.25){
				entity.motionY*=-1;
			}
		}
		if((entity.motionZ<0 && zOffset>0)|(entity.motionZ>0 && zOffset<0)){
			entity.motionZ*=-1;
		}
	}
}
