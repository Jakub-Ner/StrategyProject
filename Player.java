package StrategyProject;

import StrategyProject.Board.Board;
import StrategyProject.characters.Character;
import StrategyProject.characters.Characters;
import StrategyProject.eq.armors.Armor;
import StrategyProject.eq.Equipment;
import StrategyProject.eq.weapons.Weapon;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Player extends Characters {
    protected Character currentCharacter;
    protected Weapon currentWeapon;
    protected Armor currentArmor;

    public Player() {
//        generateCharacter();
//        chooseItems();
    }

    public void chooseItems() {
        chooseWeapon();
        chooseArmor();
    }

    public boolean die() {
        if (currentCharacter.getHp() <= 0) {
            char[][] board = new Board().board;
            int[][] eraseCharacterFromBoard = currentCharacter.getLocation();
            for (int i = 0; i < eraseCharacterFromBoard.length; i++) {
                board[eraseCharacterFromBoard[i][0]][eraseCharacterFromBoard[i][1]] = ' ';
            }
            listOfCharacters.remove(currentCharacter);
            return true;
        }
        return false;
    }

    private void chooseWeapon() {
        System.out.println("Select a weapon\n" +
                " [1]-Hammer\n" +
                " [2]-Stick\n" +
                " [3]-Shadow Wand\n");
        Equipment eq = new Equipment();
        int option = validValue(eq.availableWeapons.length + 1);

        currentWeapon = eq.availableWeapons[option - 1];
        System.out.println(currentWeapon.getName());
        eq.listOfWeapons.add(currentWeapon);
    }

    private void chooseArmor() {
        System.out.println("Select an armor\n" +
                " [1]-Armor of Warmog\n" +
                " [2]-Rag\n");
        Equipment eq = new Equipment();
        int option = validValue(eq.availableArmors.length + 1);

        currentArmor = eq.availableArmors[option - 1];
        System.out.println(currentArmor.getName());
        eq.listOfArmors.add(currentArmor);
    }
    public boolean createCharacter(){
        if (super.listOfCharacters.size() == 0) {
            chooseCharacter();
            return false;
        }
        System.out.println("Select your character: ");
        for(int i=0; i< listOfCharacters.size(); i++){
            System.out.println("["+ (i+1)+"]-"+listOfCharacters.get(i));
        }
        System.out.println("["+listOfCharacters.size()+"]-Create new one");
        int option = validValue(listOfCharacters.size()+2);

        if (option == listOfCharacters.size()){
            chooseCharacter();
        }
        else currentCharacter = listOfCharacters.get(option);
        return true;
    }

    private void chooseCharacter() {
        System.out.println("Select character's type\n" +
                " [1]-Sorcerer\n" +
                " [2]-Dwarf\n" +
                " [3]-Elf\n" +
                " [4]-Paladin\n" +
                " [5]-Animal\n" +
                " [6]-Orc\n"
        );
        int option = validValue(super.availableRoles.length + 1);

        currentCharacter = super.availableRoles[option - 1];
        super.listOfCharacters.add(currentCharacter);
        currentCharacter.createCharacter();
    }

    private int validValue(int n) {
        int option = n;
        while (option >= n || option < 1) {
            try {
                option = new Scanner(System.in).nextInt();
            } catch (InputMismatchException ae) {
                continue;
            }
        }
        return option;
    }

    public void generateCharacter() {
        chooseCharacter();
        System.out.println("Name your character!");
        String nick = new Scanner(System.in).nextLine();
        currentCharacter.setNick(nick);
    }

    public Character getCurrentCharacter() {
        return currentCharacter;
    }

    public Weapon getCurrentWeapon() {
        return currentWeapon;
    }

    public Armor getCurrentArmor() {
        return currentArmor;
    }
}
