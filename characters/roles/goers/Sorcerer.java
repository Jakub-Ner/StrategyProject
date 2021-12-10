package StrategyProject.characters.roles.goers;

import StrategyProject.characters.Character;
import StrategyProject.characters.CharacterType;
import StrategyProject.characters.roles.MagicalPower;
import StrategyProject.characters.types.moving.Go;

public class Sorcerer extends Character implements CharacterType {

    public Sorcerer() {
        super.location = new Go();
        super.typeOfPower = new MagicalPower();
        super.hp = 23;
        super.magicResistance = 3;
        super.armor = 1;
        super.nick = this.getClass().getSimpleName();

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
