package StrategyProject.characters.roles;

import StrategyProject.characters.CharacterType;
import StrategyProject.characters.types.Goiing;

public class Sorcerer extends Goiing implements CharacterType {
    final String type = "Sorcerer";

    public Sorcerer() {
    }

    @Override
    public void createCharacter() {
        System.out.println("I am a Sorcerer");
    }
}
