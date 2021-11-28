package StrategyProject;

import StrategyProject.characters.Character;
import StrategyProject.characters.Characters;

import java.util.Scanner;

public class Player extends Characters {
    public Player() {
        generateCharacter();
    }

    public void generateCharacter() {
        System.out.println("Select character's type\n [1]-Sorcerer\n [2]-Harpy");
        int option = new Scanner(System.in).nextInt();
        if (option - 1 < super.availableTypes.length) {
            super.listOfCharacters.add(super.availableTypes[option - 1]);
        }
    }
    public Character getLastCharacter(){return super.listOfCharacters.get(listOfCharacters.size()-1);}

}
