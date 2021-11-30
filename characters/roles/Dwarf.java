package StrategyProject.characters.roles;

import StrategyProject.characters.CharacterType;
import StrategyProject.characters.types.Grubbing;

public class Dwarf extends Grubbing implements CharacterType {
    final String type = "Harpy";

    public Dwarf() {
    }

    @Override
    public void createCharacter() {
        System.out.println("I am a Dwarf");
    }
}
