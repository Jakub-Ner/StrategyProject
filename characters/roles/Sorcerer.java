package StrategyProject.characters.roles;

import StrategyProject.characters.CharacterType;
import StrategyProject.characters.types.Going;

public class Sorcerer extends Going implements CharacterType {

    public Sorcerer() {
    }

    @Override
    public void createCharacter() {
        System.out.println("I am a Sorcerer");
    }
}
