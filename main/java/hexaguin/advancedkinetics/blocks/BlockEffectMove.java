package hexaguin.advancedkinetics.blocks;

import net.minecraft.entity.Entity;

public class BlockEffectMove extends EffectBlock {
	@Override
	String name(){
		return "BlockEffectMove";
	}
	
	private double maxEffect = 0.03;
	
	@Override
	public void ApplyEffect(double sourceX, double sourceY, double sourceZ, double xOffset, double yOffset, double zOffset, Entity entity){
		entity.motionX+=xOffset*maxEffect;
		entity.motionY+=yOffset*maxEffect;
		entity.motionZ+=zOffset*maxEffect;
		
		//entity.worldObj.spawnParticle("explode",
		//		sourceX+0.5,
		//		sourceY+0.5,
		//		sourceZ+0.5,
		//		xOffset/16,
		//		yOffset/16,
		//		zOffset/16);
	}
}
