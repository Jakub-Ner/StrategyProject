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
        int margin = (HEIGHT - lines.length) / 2;
        for (int i = margin; i < lines.length + margin; i++) {
            for (int j = 0; j < WIDTH; j++) {
                if (lines[i - margin].length() > j) {
                    sideBar[i][j] = lines[i - margin].charAt(j);
                } else sideBar[i][j] = ' ';
            }
        }
    }

    private void emptySpace() {
        for (int i = 0; i < HEIGHT; i++)
            for (int j = 0; j < WIDTH; j++)
                sideBar[i][j] = '_';
    }

    private void createLines(Player player) {
        lines = new String[]{
                "Commands:",
                " menu",
                "     8     ",
                "  4     6  ",
                "     2     ",
                "",
                "Your Class",
                " " + player.getCurrentCharacter().getName(),
                "",
                "Equipement:",
                " " + player.getCurrentWeapon().getName(),
                " " + player.getCurrentArmor().getName()
        };
    }

    public char[] getLine(int i) {
        return sideBar[i];
    }
}
