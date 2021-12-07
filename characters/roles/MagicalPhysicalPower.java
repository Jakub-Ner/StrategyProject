package StrategyProject.characters.roles;

public class MagicalPhysicalPower implements TypeOfPower{
    protected Magic magic;
    protected PhysicalPower physicalPower;

    public MagicalPhysicalPower(){
        magic = new Magic();
        physicalPower = new PhysicalPower();
    }

    public String typeOfPower(){
        return magic.typeOfPower() + physicalPower.typeOfPower();
    }
}
