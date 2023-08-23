package main;

public class Game implements Runnable {
    private GamePanel gPanel;
    private GameWindow gWindow;
    private Thread gThread;
    private final int FPS = 144;
    
    public Game() {
        gPanel = new GamePanel();
        gWindow = new GameWindow(gPanel);
        gPanel.requestFocus();
        startGameLoop();
    }

    private void startGameLoop() {
        gThread = new Thread(this);
        gThread.start();
    }

    @Override
    public void run() {
        double timePerFrame = Math.pow(10, 9) / FPS;
        long lastFrame = System.nanoTime();
        long now = System.nanoTime();
        int frames = 0;
        long lastCheck = 0;
        
        while(true) {
            now = System.nanoTime();

            if (now - lastFrame >= timePerFrame) {
                gPanel.repaint();;
                lastFrame = now;
                frames ++;
            }

            if(System.currentTimeMillis() - lastCheck >= 1000) {
                lastCheck = System.currentTimeMillis();
                System.out.println("FPS: " + frames);
                frames = 0;
            }

        }

    }
}
