package StrategyProject.characters.roles.grubbers;

import StrategyProject.characters.CharacterType;
import StrategyProject.characters.types.Grubbing;

public class Animal extends Grubbing implements CharacterType {

    public Animal() {
    }

    @Override
    public void createCharacter() {
        System.out.println("I am an Animal");
    }
}
