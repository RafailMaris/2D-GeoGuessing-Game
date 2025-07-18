package MainGame;

import Components.ButtonSetup;
import Components.GameWindow;
import Components.MainPanel;
import Map.MazeGeneratorBFS;

public class Main {

    public static void game1() {

        GameWindow gameWindow = new GameWindow();

        MainPanel mainPanel = new MainPanel(gameWindow);

        gameWindow.setProperties(mainPanel);

        ButtonSetup.setupActionListeners(gameWindow, mainPanel);
    }

    public static void main(String[] args) {
        MazeGeneratorBFS.makeMaze();
        game1();
    }

}
