package main;

import javax.swing.JPanel;
import inputs.Keyboard;
import inputs.Mouse;
import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;

public class GamePanel extends JPanel {
    private Mouse mouse;
    private float xDelta=100, yDelta=100, xDir=1f, yDir=1f;
    private Color color;
    private Random random;

    public GamePanel() {
        random = new Random();
        color = new Color(255, 0, 0);
        mouse = new Mouse(this);
        addKeyListener(new Keyboard(this));
        addMouseListener(mouse);
        addMouseMotionListener(mouse);
    }

    public void changeX(int speed) {
        this.xDelta += speed;
    }

    public void changeY(int speed) {
        this.yDelta += speed;
    }

    public void changePos(int x, int y){
        this.xDelta = x;
        this.yDelta = y;
    }

    public void paintComponent(Graphics graphics) {
        super.paintComponent(graphics);
        updateRect();
        graphics.setColor(color);
        graphics.fillRect((int)xDelta, (int)yDelta, 200, 100);
    }

    private void updateRect() {
        xDelta += xDir;

        if(xDelta > 800 || xDelta < 0){
            xDir *= -1;
            color = rndColor();
        }

        yDelta += yDir;

        if(yDelta > 600 || yDelta < 0){
            yDir *= -1;
            color = rndColor();
        }

    }

    private Color rndColor() {
        int r=random.nextInt(256);
        int g=random.nextInt(256);
        int b=random.nextInt(256);
        return new Color(r, g, b);
    }
}
