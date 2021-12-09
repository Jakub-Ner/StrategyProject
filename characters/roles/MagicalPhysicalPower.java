package StrategyProject.characters.roles;

public class MagicalPhysicalPower implements TypeOfPower {
    protected MagicalPower magicalPower;
    protected PhysicalPower physicalPower;

    public MagicalPhysicalPower() {
        magicalPower = new MagicalPower();
        physicalPower = new PhysicalPower();
    }

    public String typeOfPower() {
        return magicalPower.typeOfPower() + physicalPower.typeOfPower();
    }


    public int[] magicalOrPhysical() {
        int[] magicalOrPhysical = new int[2];
        magicalOrPhysical[0] = 1;
        magicalOrPhysical[1] = 1;
        return magicalOrPhysical;
    }
}
