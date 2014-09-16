package hexaguin.advancedkinetics.blocks;

import net.minecraft.entity.Entity;

public class BlockEffectBurn extends EffectBlock {
	@Override
	String name(){
		return "BlockEffectBurn";
	}
	
	@Override
	public void ApplyEffect(double sourceX, double sourceY, double sourceZ, double xOffset, double yOffset, double zOffset, Entity entity){
		entity.setFire(1);
		
		
		//if(Math.random()<0.3){ //Experimental particle code. Might implement later.
			//entity.worldObj.spawnParticle("flame",
			//		sourceX+xOffset+0.5,
			//		sourceY+yOffset+0.5,
			//		sourceZ+zOffset+0.5,
			//		0-xOffset/16,
			//		0-yOffset/16,
			//		0-zOffset/16);
			//entity.worldObj.spawnParticle("flame",
			//		sourceX+0.5,
			//		sourceY+0.5,
			//		sourceZ+0.5,
			//		(Math.random()-0.5)*0.1,
			//		(Math.random()-0.5)*0.1,
			//		(Math.random()-0.5)*0.1);
		//}
	}
}
