package StrategyProject.Board;

public class SideBar {
    char[][] sideBar;

    public SideBar(int HEIGHT, int WIDTH){
        sideBar = new char[HEIGHT][WIDTH];
    }

    public void drawSideBar() {
        for (int i = 0; i < sideBar.length; i++) {
            for (int j = 0; j < sideBar[0].length; j++) {
                sideBar[i][j] = '|';
            }
        }
    }

    public char[] getLine(int i){return sideBar[i];}
}
