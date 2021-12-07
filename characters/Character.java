package StrategyProject.characters;

import StrategyProject.characters.roles.TypeOfPower;
import StrategyProject.characters.types.moving.Move;

public abstract class Character {
    protected Move location;
    protected CharacterType type;
    protected TypeOfPower typeOfPower;
    protected int hp;
    protected int magicResistance;
    protected int armor;

//    public abstract String getCharacter

    public abstract String typeOfPower();

    public abstract String getName();

    public void createCharacter() {
        type.createCharacter();
    }

    public int[][] moveCharacter(int goFurther, char[][] board) {
        return location.moveCharacter(goFurther, board);
    }
    public int[][] moveNPC(char[][] board) {
        return location.moveNPC(board);
    }

    public int[][] getLocation() {
        return location.getLocation();
    }

    public int getHp() {
        return hp;
    }

    public int getMagicResistance() {
        return magicResistance;
    }

    public int getArmor() {
        return armor;
    }
}


