package StrategyProject.characters.roles;

import StrategyProject.characters.CharacterType;
import StrategyProject.characters.types.Flying;

public class Harpy extends Flying implements CharacterType {
    final String type = "Harpy";

    public Harpy() {
    }

    @Override
    public void createCharacter() {
        System.out.println("I am a Harpy");
    }
}
