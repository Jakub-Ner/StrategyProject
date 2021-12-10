package StrategyProject;

import StrategyProject.Board.Board;

import java.util.ArrayList;
import java.util.List;


public class Fight {
    public static List<String> messages = new ArrayList<>();


    public static boolean fight(int id) {
        messages.clear();
        NPC npc = new Board().npc;
        npc.setCurrentNPC(id);

        Player player = new Game().player;

        attack(player, npc);
        boolean result = npc.die();
        if (!result) {
            attack(npc, player);
        }
        return player.die();
    }

    private static void attack(Player itBeats, Player isBeaten) {
        int realDmg = dmgTaken(itBeats, isBeaten);

        if (itBeats.getCurrentWeapon().getSpecialEffect()) {
            realDmg *= itBeats.getCurrentWeapon().specialEffect();
            messages.add(itBeats.getCurrentWeapon().getName() + "has special effect, so real dmg was ");
        }
        isBeaten.getCurrentCharacter().changeHP(realDmg); //
    }

    private static int dmgTaken(Player itBeats, Player isBeaten) {
        int[] characterTypeOfPower = itBeats.getCurrentCharacter().magicalOrPhysical();
        int magicDmg = characterTypeOfPower[0] * itBeats.getCurrentWeapon().getMagicalDamage();

        if (magicDmg > 0) {
            int magicResistance = isBeaten.getCurrentCharacter().getMagicResistance() + isBeaten.getCurrentArmor().getMagicResistance();
            if (magicDmg <= magicResistance) magicDmg = 0;
            else magicDmg -= magicResistance;
            if (characterTypeOfPower[1] == 0) {
                messages.add(itBeats.getCurrentCharacter().getNick() + " hit with power " + -magicDmg);
                return -magicDmg;
            }
        }
        int physicalDmg = (characterTypeOfPower[1] + 1) * itBeats.getCurrentWeapon().getPhysicalDamage();
        int armor = isBeaten.getCurrentCharacter().getArmor() + isBeaten.getCurrentArmor().getArmor();
        if (physicalDmg <= armor) physicalDmg = 0;
        else physicalDmg -= armor;
        messages.add(itBeats.getCurrentCharacter().getNick() + " hit with power " + -(physicalDmg + magicDmg));
        return -(physicalDmg + magicDmg);
    }
}
