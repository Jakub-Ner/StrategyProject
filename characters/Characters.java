package StrategyProject.characters;

import StrategyProject.characters.roles.Dwarf;
import StrategyProject.characters.roles.Sorcerer;

import java.util.ArrayList;
import java.util.List;

public abstract class Characters {
    protected final Character [] availableTypes = new Character[]{new Sorcerer(), new Dwarf()};
    protected List<Character> listOfCharacters = new ArrayList<>();
}
