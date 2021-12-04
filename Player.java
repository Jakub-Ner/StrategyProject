package StrategyProject;

import StrategyProject.characters.Character;
import StrategyProject.characters.Characters;
import StrategyProject.eq.Armor;
import StrategyProject.eq.Weapon;

import java.util.Scanner;

public class Player extends Characters {
    Character currentCharacter;
    Weapon currentWeapon;
    Armor currentArmor;

    public Player() {
        generateCharacter();
        chooseItems();
    }

    public void chooseItems() {
        System.out.println("Select weapon\n" +
                " [1]-Hammer");
        int option = new Scanner(System.in).nextInt();
        currentWeapon = super.availableWeapons[option - 1];
        super.listOfWeapons.add(currentWeapon);
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
