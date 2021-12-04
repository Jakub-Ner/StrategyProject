package StrategyProject.characters;

import StrategyProject.characters.roles.goers.Elf;
import StrategyProject.characters.roles.goers.Paladin;
import StrategyProject.characters.roles.grubbers.Animal;
import StrategyProject.characters.roles.grubbers.Dwarf;
import StrategyProject.characters.roles.goers.Sorcerer;
import StrategyProject.characters.roles.grubbers.Orc;
import StrategyProject.eq.Armor;
import StrategyProject.eq.Weapon;
import StrategyProject.eq.weapons.Hammer;

import java.util.ArrayList;
import java.util.List;

public abstract class Characters {
    protected final Character [] availableRoles = new Character[]{
            new Sorcerer(),
            new Dwarf(),
            new Elf(),
            new Paladin(),
            new Animal(),
            new Orc(),
    };
    protected final Weapon[] availableWeapons = new Weapon[]{
            new Hammer(),
    };


    protected final Armor[] availableArmors =  new Armor[]{};


    protected List<Character> listOfCharacters = new ArrayList<>();
    protected List<Weapon> listOfWeapons = new ArrayList<>();
    protected List<Armor> listOfArmors = new ArrayList<>();
}
