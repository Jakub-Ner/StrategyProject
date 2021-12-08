package StrategyProject.characters.roles;

public class MagicalPower implements TypeOfPower {
    @Override
    public String typeOfPower() {return "Magical Power";}

    public int[] magicalOrPhysical(){
        int [] magicalOrPhysical = new int[2];
        magicalOrPhysical[0] = 1;
        magicalOrPhysical[1] = 0;
        return magicalOrPhysical;
    }
}
