import javax.swing.JPanel;
import java.awt.Graphics;

public class GamePanel extends JPanel{
    public GamePanel() {
        
    }

    public void paintComponent(Graphics graphics) {
        super.paintComponent(graphics);
        graphics.fillRect(100, 100, 300, 200);
    }
}