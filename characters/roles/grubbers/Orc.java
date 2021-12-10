package StrategyProject.characters.roles.grubbers;

import StrategyProject.characters.Character;
import StrategyProject.characters.CharacterType;
import StrategyProject.characters.roles.PhysicalPower;
import StrategyProject.characters.types.moving.Grub;

public class Orc extends Character implements CharacterType {

    public Orc() {
        super.location = new Grub();
        super.typeOfPower = new PhysicalPower();
        super.hp = 31;
        super.magicResistance = 2;
        super.armor = 7;
        super.nick = this.getClass().getSimpleName();
    }

    @Override
    public void createCharacter() {
        System.out.println("I am a Orc\n");
    }

    @Override
    public String getName() {
        return this.getClass().getSimpleName();
    }
}
