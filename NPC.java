package StrategyProject;

import StrategyProject.characters.Character;
import StrategyProject.eq.armors.Rag;
import StrategyProject.eq.weapons.Stick;

import java.util.List;
import java.util.Random;

public class NPC extends Player {

    public NPC(char[][] board) {
        createNPC();
        setLocation(board);
        super.currentWeapon = new Stick();
        super.currentArmor = new Rag();

    }

    public void setCurrentNPC(int id) {
        currentCharacter = super.listOfCharacters.get(id);
    }

    public void setLocation(char[][] board) {
        for (int i = 0; i < super.listOfCharacters.size(); i++) {
            super.listOfCharacters.get(i).moveNPC(board);
        }

    }

    public List<Character> getListOfNPC() {
        return super.listOfCharacters;
    }

    private void createNPC() {
        int number = 10;
        for (int i = 0; i < number; i++) {
            int los = new Random().nextInt(super.availableRoles.length);
            super.listOfCharacters.add(super.availableRoles[los]);
        }
    }
}
