package main;

import javax.swing.JPanel;

import inputs.Keyboard;
import inputs.Mouse;

import java.awt.Graphics;

public class GamePanel extends JPanel{
    private Mouse mouse;
    private int xDelta=100, yDelta=100;

    public GamePanel() {
        mouse = new Mouse(this);
        addKeyListener(new Keyboard(this));
        addMouseListener(mouse);
        addMouseMotionListener(mouse);
    }

    public void changeX(int speed) {
        this.xDelta += speed;
        repaint();
    }

    public void changeY(int speed) {
        this.yDelta += speed;
        repaint();
    }

    public void changePos(int x, int y){
        this.xDelta = x;
        this.yDelta = y;
        repaint();
    }

    public void paintComponent(Graphics graphics) {
        super.paintComponent(graphics);
        graphics.fillRect(xDelta, yDelta, 300, 100);
    }
}
