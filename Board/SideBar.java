package StrategyProject.Board;

import StrategyProject.Player;

public class SideBar {
    private char[][] sideBar;
    private String[] lines;
    private int HEIGHT;
    private int WIDTH;

    public SideBar(int HEIGHT, int WIDTH) {
        this.HEIGHT = HEIGHT;
        this.WIDTH = WIDTH;
        sideBar = new char[HEIGHT][WIDTH];
    }

    public void drawSideBar(Player player) {
        createLines(player);
        emptySpace();
//        int margin = (HEIGHT - lines.length) / 5;
        for (int i = 2; i < lines.length + 2; i++) {
            for (int j = 0; j < WIDTH; j++) {
                if (lines[i - 2].length() > j) {
                    sideBar[i][j] = lines[i - 2].charAt(j);
                } else sideBar[i][j] = ' ';
            }
        }
    }

    private void emptySpace() {
        for (int i = 0; i < 2; i++)
            for (int j = 0; j < WIDTH; j++)
                sideBar[i][j] = '_';
    }

    private void createLines(Player player) {
        lines = new String[]{
                "Type: " + player.getCurrentCharacter().getName(),
                "HP: " + player.getCurrentCharacter().getHp(),
                "Magic Res: " + player.getCurrentCharacter().getMagicResistance(),
                "Armor: " + player.getCurrentCharacter().getArmor(),
                "________________",
                "Equipement:",
                " " + player.getCurrentWeapon().getName(),
                " " + player.getCurrentArmor().getName(),
                "________________",
                "________________",
                "     CHAT      ",
                "________________",
        };
    }

    public char[] getLine(int i) {
        return sideBar[i];
    }
}
