package StrategyProject;

import StrategyProject.Board.Board;


public class Fight {
    public static String[] messages;


    public static boolean fight(int id) {
        NPC npc = new Board().npc;
        npc.setCurrentNPC(id);

        Player player = new Game().player;

        attack(player, npc);
        boolean result = npc.die();
        System.out.println(2);
        if (!result) {
            attack(npc, player);
        }
        return player.die();
    }

    private static void attack(Player itBeats, Player isBeaten) {
        int realDmg = dmgTaken(itBeats, isBeaten);
        System.out.println(realDmg);

        if (itBeats.getCurrentWeapon().getSpecialEffect()) {
            realDmg *= itBeats.getCurrentWeapon().specialEffect();
        }
        isBeaten.getCurrentCharacter().changeHP(realDmg); //
        System.out.println(isBeaten.getCurrentCharacter().getName());
        System.out.println(isBeaten.getCurrentCharacter().getHp());
    }

    private static int dmgTaken(Player itBeats, Player isBeaten) {
        int[] characterTypeOfPower = itBeats.getCurrentCharacter().magicalOrPhysical();
        int magicDmg = characterTypeOfPower[0] * itBeats.getCurrentWeapon().magicalDamage();

        if (magicDmg > 0) {
            int magicResistance = isBeaten.getCurrentCharacter().getMagicResistance() + isBeaten.getCurrentArmor().getMagicResistance();
            System.out.println(magicResistance + " <-Mr dmg->" + magicDmg);
            if (magicDmg <= magicResistance) magicDmg = 0;
            else magicDmg -= magicResistance;
            if (characterTypeOfPower[1] == 0) return -magicDmg;
        }
        int physicalDmg = (characterTypeOfPower[1] + 1) * itBeats.getCurrentWeapon().physicalDamage();
        System.out.println(characterTypeOfPower[1] + " " + itBeats.getCurrentWeapon().physicalDamage());
        int armor = isBeaten.getCurrentCharacter().getArmor() + isBeaten.getCurrentArmor().getArmor();
        if (physicalDmg <= armor) physicalDmg = 0;
        else physicalDmg -= armor;

        return -(physicalDmg + magicDmg);
    }
}
