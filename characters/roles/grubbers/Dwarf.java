package StrategyProject.characters.roles.grubbers;

import StrategyProject.characters.Character;
import StrategyProject.characters.CharacterType;
import StrategyProject.characters.roles.PhysicalPower;
import StrategyProject.characters.types.moving.Grub;

public class Dwarf extends Character implements CharacterType {

    public Dwarf() {
        super.location = new Grub();
        super.typeOfPower = new PhysicalPower();
        super.hp = 34;
        super.magicResistance = 8;
        super.armor = 8;
        super.nick = this.getClass().getSimpleName();

    }

    @Override
    public void createCharacter() {
        System.out.println("I am a Dwarf\n");
    }

    @Override
    public String getName() {
        return this.getClass().getSimpleName();
    }
}
