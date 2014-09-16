package hexaguin.advancedkinetics.blocks;

import net.minecraft.entity.Entity;

public class BlockEffectSlow extends EffectBlock {
	@Override
	String name(){
		return "BlockEffectSlow";
	}
	
	private double maxEffect = 0.9;
	
	@Override
	public void ApplyEffect(double sourceX, double sourceY, double sourceZ, double xOffset, double yOffset, double zOffset, Entity entity){
		if((entity.motionX>0 && xOffset>0)|(entity.motionX<0 && xOffset<0)){
			entity.motionX*=maxEffect;
		}
		if((entity.motionY>0 && yOffset>0)|(entity.motionY<0 && yOffset<0)){
			entity.motionY*=maxEffect;
			entity.fallDistance=0;
		}
		if((entity.motionZ>0 && zOffset>0)|(entity.motionZ<0 && xOffset<0)){
			entity.motionZ*=maxEffect;
		}
	}
}
