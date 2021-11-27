package StrategyProject.characters;

import StrategyProject.characters.roles.Harpy;
import StrategyProject.characters.roles.Sorcerer;

import java.util.ArrayList;
import java.util.List;

public abstract class Characters {
    final CharacterType [] availableTypes = new CharacterType[]{new Sorcerer(), new Harpy()};
    protected List<CharacterType> listOfCharacters = new ArrayList<>();
}
