package StrategyProject;

import StrategyProject.Board.Board;
import StrategyProject.characters.Character;
import StrategyProject.characters.Characters;
import StrategyProject.eq.armors.Armor;
import StrategyProject.eq.Equipment;
import StrategyProject.eq.weapons.Weapon;

import java.util.Scanner;

public class Player extends Characters {
    protected Character currentCharacter;
    protected Weapon currentWeapon;
    protected Armor currentArmor;

    public Player() {
//        generateCharacter();
//        chooseItems();
    }

    public void chooseItems() {
        Equipment eq = new Equipment();
        int option = chooseWeapon();
        currentWeapon = eq.availableWeapons[option - 1];
        System.out.println(currentWeapon.getName());
        eq.listOfWeapons.add(currentWeapon);

        option = chooseArmor();
        currentArmor = eq.availableArmors[option - 1];
        System.out.println(currentArmor.getName());

        eq.listOfArmors.add(currentArmor);
    }

    public boolean die() {
        if (currentCharacter.getHp() <= 0) {
            char[][] board = new Board().board;
            int[][] eraseCharacterFromBoard = currentCharacter.getLocation();
            for (int i = 0; i < eraseCharacterFromBoard.length; i++) {
                board[eraseCharacterFromBoard[i][0]][eraseCharacterFromBoard[i][1]] = ' ';
            }
            listOfCharacters.remove(currentCharacter);
            return true;
        }
        return false;
    }

    private int chooseWeapon() {
        System.out.println("Select a weapon\n" +
                " [1]-Hammer\n" +
                " [2]-Stick\n" +
                " [3]-Shadow Wand\n");
        int option = new Scanner(System.in).nextInt();
        return option;
    }

    private int chooseArmor() {
        System.out.println("Select an armor\n" +
                " [1]-Armor of Warmog\n" +
                " [2]-Rag\n");
        int option = new Scanner(System.in).nextInt();
        return option;
    }

    public void generateCharacter() {
        System.out.println("Select character's type\n" +
                " [1]-Sorcerer\n" +
                " [2]-Dwarf\n" +
                " [3]-Elf\n" +
                " [4]-Paladin\n" +
                " [5]-Animal\n" +
                " [6]-Orc\n"
        );
        boolean created = false;
        while (!created) {
            int option = new Scanner(System.in).nextInt();
            if (option - 1 < super.availableRoles.length) {
                currentCharacter = super.availableRoles[option - 1];
                super.listOfCharacters.add(currentCharacter);
                created = true;
                currentCharacter.createCharacter();
            }
        }
    }

    public Character getCurrentCharacter() {
        return currentCharacter;
    }

    public Weapon getCurrentWeapon() {
        return currentWeapon;
    }

    public Armor getCurrentArmor() {
        return currentArmor;
    }
}
