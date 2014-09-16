package hexaguin.advancedkinetics.blocks;

import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;

public class BlockEffectDisarm extends EffectBlock {
	@Override
	String name(){
		return "BlockEffectDisarm";
	}
	
	@Override
	public void ApplyEffect(double sourceX, double sourceY, double sourceZ, double xOffset, double yOffset, double zOffset, Entity entity){
		if(entity instanceof EntityPlayer){
			((EntityPlayer)entity).inventory.dropAllItems();
		}
	}
}
