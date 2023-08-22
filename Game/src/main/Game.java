package main;

public class Game {
    private GamePanel gPanel;
    private GameWindow gWindow;
    
    public Game() {
        gPanel = new GamePanel();
        gWindow = new GameWindow(gPanel);
        gPanel.requestFocus();
    }
}
