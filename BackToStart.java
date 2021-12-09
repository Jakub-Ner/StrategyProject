package StrategyProject;

import java.util.Locale;

public class BackToStart {
    public static boolean back(String input) {
        if (input.toUpperCase(Locale.ROOT).equals("MENU")) {
            new Game().play();
            return true;
        }
        return false;
    }
}
