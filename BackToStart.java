package StrategyProject;

import java.util.Locale;

public class BackToStart {
    public boolean back(String input) {
        if (input.toUpperCase(Locale.ROOT).equals("MENU")) {
            new Game().run();
            return true;
        }
        return false;
    }
}
