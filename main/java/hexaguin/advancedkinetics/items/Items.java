package hexaguin.advancedkinetics.items;

import cpw.mods.fml.common.Loader;
import net.minecraft.item.Item;

public class Items {
	
	public static Item glideGenerator;

	public static void init() {
		glideGenerator = new ItemGlideGenerator();
	}
}
