package StrategyProject.characters.roles.grubbers;

import StrategyProject.characters.CharacterType;
import StrategyProject.characters.types.Grubbing;

public class Dwarf extends Grubbing implements CharacterType {

    public Dwarf() {
    }

    @Override
    public void createCharacter() {
        System.out.println("I am a Dwarf");
    }
}
