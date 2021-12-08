package StrategyProject.characters.roles;

public class PhysicalPower implements TypeOfPower {
    @Override
    public String typeOfPower() {return "Physical Power";}

    public int[] magicalOrPhysical(){
        int [] magicalOrPhysical = new int[2];
        magicalOrPhysical[0] = 0; // magical
        magicalOrPhysical[1] = 1; // physical
        return magicalOrPhysical;
    }
}
