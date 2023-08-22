import javax.swing.JPanel;
import Game.inputs.Keyboard;
import Game.inputs.Mouse;
import java.awt.Graphics;

public class GamePanel extends JPanel{
    private Mouse mouse;

    public GamePanel() {
        mouse = new Mouse();
        addKeyListener(new Keyboard());
        addMouseListener(mouse);
        addMouseMotionListener(mouse);
    }

    public void paintComponent(Graphics graphics) {
        super.paintComponent(graphics);
        graphics.fillRect(100, 100, 300, 100);
    }
}
