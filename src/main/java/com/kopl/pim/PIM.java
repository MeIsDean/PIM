package com.kopl.pim;

import com.kopl.pim.util.ModItems;
import com.kopl.pim.util.Registration;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(PIM.MOD_ID)
public class PIM
{
    public static final String MOD_ID = "pim";
    private static final Logger LOGGER = LogManager.getLogger();

    public static final ItemGroup pimItemGroup = new ItemGroup("PIM") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.BOARD.get());
        }
    };

    public PIM() {
        Registration.register();
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::doClientStuff);

        MinecraftForge.EVENT_BUS.register(this);
    }

    private void setup(final FMLCommonSetupEvent event) { }

    private void doClientStuff(final FMLClientSetupEvent event) { }
}
