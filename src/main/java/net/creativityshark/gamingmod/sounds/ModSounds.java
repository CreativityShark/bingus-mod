package net.creativityshark.gamingmod.sounds;

import net.creativityshark.gamingmod.GamingMod;
import net.minecraft.sound.SoundEvent;
import net.minecraft.util.Identifier;

public class ModSounds {

    public static SoundEvent BINGUS_THEME_INTRO = new SoundEvent(new Identifier(GamingMod.MOD_ID, "bingus_theme_intro"));
    public static SoundEvent BINGUS_THEME_LOOP = new SoundEvent(new Identifier(GamingMod.MOD_ID, "bingus_theme_loop"));

    public static void registerModSounds() { System.out.println("ok you get the point uuuuuh something something registering mod sounds. Look I'm coding this late at night and Im tired give me a break");}
}
