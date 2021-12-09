package StrategyProject.characters;

import StrategyProject.characters.roles.goers.Elf;
import StrategyProject.characters.roles.goers.Paladin;
import StrategyProject.characters.roles.grubbers.Animal;
import StrategyProject.characters.roles.grubbers.Dwarf;
import StrategyProject.characters.roles.goers.Sorcerer;
import StrategyProject.characters.roles.grubbers.Orc;

import java.util.ArrayList;
import java.util.List;

public abstract class Characters {
    protected final Character[] availableRoles = new Character[]{
            new Sorcerer(),
            new Dwarf(),
            new Elf(),
            new Paladin(),
            new Animal(),
            new Orc()
    };

    protected List<Character> listOfCharacters = new ArrayList<>();

}
