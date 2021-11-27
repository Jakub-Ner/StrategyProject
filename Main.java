package StrategyProject;

import StrategyProject.characters.Character;
import StrategyProject.characters.roles.Harpy;
import StrategyProject.characters.roles.Sorcerer;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args){
        List<Character> listOfCharacters = new ArrayList<>();
        listOfCharacters.add(new Harpy());
        listOfCharacters.get(0).createCharacter();
        listOfCharacters.get(0).getLocation();
        listOfCharacters.get(0).doMove(1);
        listOfCharacters.get(0).getType();

    }

    private void generate_character(){

    }
}
