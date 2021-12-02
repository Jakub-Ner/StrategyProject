package StrategyProject;

import StrategyProject.characters.Character;
import StrategyProject.characters.Characters;

import java.util.Scanner;

public class Player extends Characters {
    Character current;
    public Player() {
        generateCharacter();
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
        while(!created) {
            int option = new Scanner(System.in).nextInt();
            if (option - 1 < super.availableTypes.length) {
                current = super.availableTypes[option - 1];
                super.listOfCharacters.add(current);
                created = true;
                current.createCharacter();
            }
        }
    }
    public Character getCurrentCharacter(){return current;}

}
