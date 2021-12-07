package StrategyProject;

import StrategyProject.characters.Character;
import StrategyProject.characters.Characters;

import java.util.List;
import java.util.Random;

public class NPC extends Characters {

    public NPC(char[][] board) {
        createNPC();
        setLocation(board);
    }
    public void setLocation(char[][] board){
        for(int i =0; i< super.listOfCharacters.size(); i++){
            listOfCharacters.get(i).moveNPC(board);
        }

    }
    public List<Character> getListOfNPC(){
        return super.listOfCharacters;
    }
    private void createNPC() {
        int number = new Random().nextInt(17) + 30;
        for (int i = 0; i < number; i++) {
            int los = new Random().nextInt(availableRoles.length);
            super.listOfCharacters.add(super.availableRoles[los]);
        }
    }
}
