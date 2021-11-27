package StrategyProject.characters.roles;

import StrategyProject.characters.Character;
import StrategyProject.characters.CharacterType;
import StrategyProject.characters.types.Unflyable;

public class Sorcerer extends Unflyable implements CharacterType {
    final String type = "Sorcerer";

    public Sorcerer() {
    }

    @Override
    public void createCharacter() {
        System.out.println("I am a Sorcerer");
    }
}
