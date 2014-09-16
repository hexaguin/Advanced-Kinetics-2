package hexaguin.advancedkinetics;

import net.minecraftforge.common.config.Configuration;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import hexaguin.advancedkinetics.blocks.Blocks;
import hexaguin.advancedkinetics.items.Items;
import hexaguin.advancedkinetics.lib.Constants;

@Mod(modid = Constants.MODID, name = Constants.MODNAME, version = Constants.VERSION)
public class AdvancedKinetics {
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent e){
		Blocks.init();
		Items.init();
	}

	@EventHandler
	public void init(FMLInitializationEvent e)
	{
	}

	@EventHandler
	public void postInit(FMLPostInitializationEvent e)
	{
	}
}