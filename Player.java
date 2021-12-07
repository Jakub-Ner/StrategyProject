package StrategyProject;

import StrategyProject.characters.Character;
import StrategyProject.characters.Characters;
import StrategyProject.eq.armors.Armor;
import StrategyProject.eq.Equipment;
import StrategyProject.eq.weapons.Weapon;

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
        Equipment eq = new Equipment();
        int option = chooseWeapon();
        currentWeapon = eq.availableWeapons[option - 1];
        eq.listOfWeapons.add(currentWeapon);

        option = chooseArmor();
        currentArmor = eq.availableArmors[option - 1];
        eq.listOfArmors.add(currentArmor);
    }

    private int chooseWeapon(){
        System.out.println("Select weapon\n" +
                " [1]-Hammer\n" +
                " [2]-Stick");
        int option = new Scanner(System.in).nextInt();
        return option;
    }
    private int chooseArmor(){
        System.out.println("Select weapon\n" +
                " [1]-Armor of Warmog\n" +
                " [2]-Rag");
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
