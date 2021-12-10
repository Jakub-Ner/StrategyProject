package StrategyProject.characters.roles.goers;

import StrategyProject.characters.Character;
import StrategyProject.characters.CharacterType;
import StrategyProject.characters.roles.MagicalPower;
import StrategyProject.characters.types.moving.Go;

public class Elf extends Character implements CharacterType {

    public Elf() {
        super.location = new Go();
        super.typeOfPower = new MagicalPower();
        super.hp = 30;
        super.magicResistance = 8;
        super.armor = 3;
        super.nick = this.getClass().getSimpleName();
    }

    @Override
    public void createCharacter() {

        System.out.println("I am an Elf\n");
    }

    @Override
    public String getName() {
        return this.getClass().getSimpleName();
    }
}