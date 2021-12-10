package StrategyProject.characters.roles.grubbers;

import StrategyProject.characters.Character;
import StrategyProject.characters.CharacterType;
import StrategyProject.characters.roles.PhysicalPower;
import StrategyProject.characters.types.moving.Grub;

public class Animal extends Character implements CharacterType {

    public Animal() {
        super.location = new Grub();
        super.typeOfPower = new PhysicalPower();
        super.hp = 28;
        super.magicResistance = 3;
        super.armor = 8;
        super.nick = this.getClass().getSimpleName();
    }

    @Override
    public void createCharacter() {
        System.out.println("I am an Animal\n");
    }

    @Override
    public String getName() {
        return this.getClass().getSimpleName();
    }
}
