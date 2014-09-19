package hexaguin.advancedkinetics;

import hexaguin.advancedkinetics.blocks.AKBlocks;
import hexaguin.advancedkinetics.items.AKItems;
import hexaguin.advancedkinetics.lib.Constants;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

@Mod(modid = Constants.MODID, name = Constants.MODNAME, version = Constants.VERSION)
public class AdvancedKinetics {
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent e){
		AKBlocks.init();
		AKItems.init();
	}

	@EventHandler
	public void init(FMLInitializationEvent e)
	{
	}

	@EventHandler
	public void postInit(FMLPostInitializationEvent e)
	{
	}
	
	public static CreativeTabs tabAdvancedKinetics = new CreativeTabs("tabAdvancedKinetics") {
	    @Override
	    @SideOnly(Side.CLIENT)
	    public Item getTabIconItem() {
	        return Item.getItemFromBlock(AKBlocks.basicFieldBlock);
	    }
	};
}