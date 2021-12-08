package StrategyProject.eq;

import StrategyProject.eq.armors.Armor;
import StrategyProject.eq.armors.Warmog;
import StrategyProject.eq.armors.Rag;
import StrategyProject.eq.weapons.Hammer;
import StrategyProject.eq.weapons.ShadowWand;
import StrategyProject.eq.weapons.Stick;
import StrategyProject.eq.weapons.Weapon;

import java.util.ArrayList;
import java.util.List;

public class Equipment {
    public final Weapon[] availableWeapons = new Weapon[]{
            new Hammer(),
            new Stick(),
            new ShadowWand()
    };


    public final Armor[] availableArmors =  new Armor[]{
            new Warmog(),
            new Rag()
    };

    public List<Weapon> listOfWeapons = new ArrayList<>();
    public List<Armor> listOfArmors = new ArrayList<>();


}
