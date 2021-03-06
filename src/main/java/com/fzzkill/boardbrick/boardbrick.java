package com.fzzkill.boardbrick;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class boardbrick implements ModInitializer {

    // public static final Logger LOGGER = LoggerFactory.getLogger("boardbrick");
    public static final Item.Settings ITEMSETTING = new Item.Settings().group(boardbrick.BoardGroup.ITEM_GROUP);
    public static final String MODID = "boardbrick";

    // new Group

    public static class BoardGroup implements ModInitializer {

        public static final ItemGroup ITEM_GROUP = FabricItemGroupBuilder.build(
                new Identifier(boardbrick.MODID, "boardgroup"),
                () -> new ItemStack(Objects.boardbrick));

        @Override
        public void onInitialize() {

        }

    }

    @Override
    public void onInitialize() {
        Objects.register();
    }
}
