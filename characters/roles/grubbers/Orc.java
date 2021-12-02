package StrategyProject.characters.roles.grubbers;

import StrategyProject.characters.CharacterType;
import StrategyProject.characters.types.Grubbing;

public class Orc extends Grubbing implements CharacterType {

    public Orc() {
    }

    @Override
    public void createCharacter() {
        System.out.println("I am a Orc");
    }
}
