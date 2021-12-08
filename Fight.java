package StrategyProject;

import StrategyProject.Board.Board;


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
        int realDmg = dmgTaken(itBeats, isBeaten);
        if (itBeats.getCurrentWeapon().getSpecialEffect()) {
            realDmg *= itBeats.getCurrentWeapon().specialEffect();
        }
        isBeaten.getCurrentCharacter().changeHP(realDmg);
        System.out.println(isBeaten.getCurrentCharacter().getName());
        System.out.println(isBeaten.getCurrentCharacter().getHp());
        System.out.println(realDmg);
    }

    private static int dmgTaken(Player itBeats, Player isBeaten) {
        int[] characterTypeOfPower = itBeats.getCurrentCharacter().magicalOrPhysical();
        int magicDmg = characterTypeOfPower[0] * itBeats.getCurrentWeapon().magicalDamage();

        if (magicDmg > 0) {
            int magicResistance = isBeaten.getCurrentCharacter().getMagicResistance() + isBeaten.getCurrentArmor().getMagicResistance();
            if (magicDmg <= magicResistance) magicDmg = 0;
            else magicDmg-=magicResistance;
            if (characterTypeOfPower[1] == 0) return -magicDmg;
        }
        int physicalDmg = (characterTypeOfPower[1] + 1) * itBeats.getCurrentWeapon().physicalDamage();
        System.out.println(characterTypeOfPower[1]+" "+itBeats.getCurrentWeapon().physicalDamage());
        int armor = isBeaten.getCurrentCharacter().getArmor() + isBeaten.getCurrentArmor().getArmor();
        if (physicalDmg <= armor) physicalDmg = 0;
        else physicalDmg -= armor;

        int odp =-(magicDmg + physicalDmg);
        return odp;
    }
}
