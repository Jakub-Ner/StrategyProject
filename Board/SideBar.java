package StrategyProject.Board;

import StrategyProject.Fight;
import StrategyProject.Player;

import java.util.List;

public class SideBar {
    private String[] sideBar;
    private String[] lines;
    private int HEIGHT;
    private int WIDTH;
    int realHeight;
    int chatIndex;

    public SideBar(int HEIGHT, int WIDTH) {
        this.HEIGHT = HEIGHT;
        this.WIDTH = WIDTH;
        sideBar = new String[HEIGHT];
    }

    public void createSideBar(Player player) {
        basePart(player);
        createChat(player);
    }

    public void basePart(Player player) {
        sideBar[0] = " " + player.getCurrentCharacter().getNick();
        sideBar[1] = " " + "character class: " + player.getCurrentCharacter().getName();
        sideBar[2] = " " + "HP: " + player.getCurrentCharacter().getHp();
        sideBar[3] = " " + "Magic Res: " + player.getCurrentCharacter().getMagicResistance();
        sideBar[4] = " " + "Armor: " + player.getCurrentCharacter().getArmor();
        sideBar[5] = " " + emptySpace();
        sideBar[5] = " " + " ";
        sideBar[6] = " " + "Equipement:";
        sideBar[7] = " " + " " + player.getCurrentWeapon().getName() + ": dmg: " + player.getCurrentWeapon().getPhysicalDamage() + ", magical dmg: " + player.getCurrentWeapon().getMagicalDamage();
        sideBar[8] = " " + " " + player.getCurrentArmor().getName() + ": armor: " + player.getCurrentArmor().getArmor() + ", mr: " + player.getCurrentArmor().getMagicResistance();
        sideBar[9] = " " + emptySpace();
        sideBar[10] = " " + "";
        sideBar[11] = " " + " CHAT & GAME LOG";
        sideBar[12] = " " + "";
        chatIndex = 13; // last index (+ 1)
    }

    private void createChat(Player player) {
        for (int i = chatIndex; i < HEIGHT; i++) {
            sideBar[i] = " ";
        }
    }

    public void updateChat() {
        List<String> messages = new Fight().messages;
        if (messages.size() + chatIndex >= HEIGHT) {
            for (int i = chatIndex; i < HEIGHT; i++) {
                sideBar[i] = messages.get(i - chatIndex);
            }
        } else {
            for (int i = chatIndex; i < messages.size() + chatIndex; i++) {
                sideBar[i] = messages.get(i - chatIndex);
            }

        }
    }

    private String emptySpace() {
        String line = "";
        for (int j = 0; j < WIDTH; j++) {
            line += '-';
        }
        return line;
    }

    public String getLine(int i) {
        return sideBar[i];
    }
}
