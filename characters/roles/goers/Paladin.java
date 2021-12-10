package StrategyProject.characters.roles.goers;

import StrategyProject.characters.Character;
import StrategyProject.characters.CharacterType;
import StrategyProject.characters.roles.MagicalPhysicalPower;
import StrategyProject.characters.types.moving.Go;

public class Paladin extends Character implements CharacterType {


    public Paladin() {
        super.location = new Go();
        super.typeOfPower = new MagicalPhysicalPower();
        super.hp = 30;
        super.magicResistance = 1;
        super.armor = 5;
        super.nick = this.getClass().getSimpleName();

    }

    @Override
    public void createCharacter() {
        System.out.println("I am a Paladin\n");
    }

    @Override
    public String getName() {
        return this.getClass().getSimpleName();
    }
}
