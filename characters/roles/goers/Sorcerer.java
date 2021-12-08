package StrategyProject.characters.roles.goers;

import StrategyProject.characters.CharacterType;
import StrategyProject.characters.roles.MagicalPower;
import StrategyProject.characters.types.Going;

public class Sorcerer extends Going implements CharacterType {

    public Sorcerer() {
        super.typeOfPower = new MagicalPower();
        super.hp =23;
        super.magicResistance = 3;
        super.armor = 1;
    }

    @Override
    public void createCharacter() {
        System.out.println("I am a Sorcerer\n");
    }
    @Override
    public String getName() {
        return this.getClass().getSimpleName();
    }
}
