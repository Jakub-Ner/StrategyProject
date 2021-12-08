package StrategyProject;

import StrategyProject.Board.Board;

import java.util.Arrays;

public class Fight {
    public static String[] messages;


    public static void fight(int id) {
        NPC npc = new Board().npc;
        npc.setCurrentNPC(id);

        Player player = new Game().player;

        attack(player, npc);
        if (!npc.die())
            attack(npc, player);
        player.die();
    }

    private static void attack(Player itBeats, Player isBeaten) {
        int realDmg = dmgTaken(isBeaten);
        if (itBeats.getCurrentWeapon().getSpecialEffect()) {
            realDmg *= itBeats.getCurrentWeapon().specialEffect();
        }
        isBeaten.getCurrentCharacter().changeHP(realDmg);
    }

    private static int dmgTaken(Player player) {
        int[] characterTypeOfPower = player.getCurrentCharacter().magicalOrPhysical();
        int magicDmg = characterTypeOfPower[0] * player.getCurrentWeapon().magicalDamage();

        if (magicDmg > 0) {
            int magicResistance = player.getCurrentCharacter().getMagicResistance() + player.getCurrentArmor().getMagicResistance();
            if (magicDmg <= magicResistance) magicDmg = 0;
            if (characterTypeOfPower[1] == 0) return -magicDmg;
        }
        int physicalDmg = (characterTypeOfPower[1] + 1) * player.getCurrentWeapon().physicalDamage();

        int armor = player.getCurrentCharacter().getArmor() + player.getCurrentArmor().getArmor();
        if (physicalDmg <= armor) physicalDmg = 0;
        return -(magicDmg + physicalDmg);
    }
}
