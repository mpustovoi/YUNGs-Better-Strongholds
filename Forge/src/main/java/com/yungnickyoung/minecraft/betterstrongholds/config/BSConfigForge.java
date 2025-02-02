package com.yungnickyoung.minecraft.betterstrongholds.config;

import net.minecraftforge.common.ForgeConfigSpec;

public class BSConfigForge {
    public static final ForgeConfigSpec.Builder BUILDER = new ForgeConfigSpec.Builder();
    public static final ForgeConfigSpec SPEC;

    public static final ConfigGeneralForge general;
    public static final ConfigPieceSettingsForge pieceSettings;

    static {
        BUILDER.push("YUNG's Better Strongholds");

        general = new ConfigGeneralForge(BUILDER);
        pieceSettings = new ConfigPieceSettingsForge(BUILDER);

        BUILDER.pop();
        SPEC = BUILDER.build();
    }
}