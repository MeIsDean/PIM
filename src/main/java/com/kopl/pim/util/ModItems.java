package com.kopl.pim.util;

import com.kopl.pim.PIM;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.fml.RegistryObject;

public class ModItems {

    public static final RegistryObject<Item> EXECUTOR = Registration.ITEMS.register("executor",()->
            new Item(new Item.Properties().tab(PIM.pimItemGroup)));
    public static final RegistryObject<Item> BOARD = Registration.ITEMS.register("board",()->
            new Item(new Item.Properties().tab(PIM.pimItemGroup)));


    public static void register(){

        Registration.ITEMS.register("manipulator",()->
                new BlockItem(ModBlocks.MANIPULATOR.get(),new Item.Properties().tab(PIM.pimItemGroup)));
    }

}
