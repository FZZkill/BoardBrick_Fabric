package com.fzzkill.boardbrick.Tools.Super.SuperItem;

import net.minecraft.item.Item;
import net.minecraft.item.ToolMaterial;
import net.minecraft.tag.BlockTags;

public class BoardBrickPickaxeItem extends BoardBrickMiningToolItem{

    protected BoardBrickPickaxeItem(ToolMaterial material, int attackDamage, float attackSpeed, Item.Settings settings) {
        super((float)attackDamage, attackSpeed, material, BlockTags.PICKAXE_MINEABLE, settings);
    }

}
