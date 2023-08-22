import javax.swing.JFrame;

public class GameWindow extends JFrame{
    public GameWindow(GamePanel gamePanel) {
        setSize(800, 600);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        add(gamePanel);
        setLocationRelativeTo(null);
        setVisible(true);
    }
}
