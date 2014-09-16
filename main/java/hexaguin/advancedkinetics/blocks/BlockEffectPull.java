package hexaguin.advancedkinetics.blocks;

import net.minecraft.entity.Entity;

public class BlockEffectPull extends EffectBlock {
	@Override
	String name(){
		return "BlockEffectPull";
	}
	
	private double maxEffect = 0.03;
	
	@Override
	public void ApplyEffect(double sourceX, double sourceY, double sourceZ, double xOffset, double yOffset, double zOffset, Entity entity){
		double distanceX = entity.posX - (sourceX+0.5);
		double distanceY = entity.posY - (sourceY+0.5);
		double distanceZ = entity.posZ - (sourceZ+0.5);
		
		double totalDistance = Math.sqrt(
				Math.pow(distanceX, 2) + Math.pow(distanceY, 2) + Math.pow(distanceZ, 2));
		double reduction = maxEffect/totalDistance;
		
		entity.motionX += 0-(distanceX*reduction);
		entity.motionY += 0-(distanceY*reduction);
		entity.motionZ += 0-(distanceZ*reduction);
	}
}
