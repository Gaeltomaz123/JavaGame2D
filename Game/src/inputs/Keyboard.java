package inputs;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import main.GamePanel;

public class Keyboard implements KeyListener {
    private GamePanel gamePanel;

    public Keyboard(GamePanel gamePanel) {
        this.gamePanel = gamePanel;
    }

    @Override
    public void keyTyped(KeyEvent e) {
        // TODO Auto-generated method stub
    }

    @Override
    public void keyPressed(KeyEvent e) {
        switch(e.getKeyCode()) {
            case KeyEvent.VK_W:
                gamePanel.changeY(-20);
                System.out.println("W");
                break;
            case KeyEvent.VK_A:
                gamePanel.changeX(-20);
                System.out.println("A");
                break;
            case KeyEvent.VK_S:
                gamePanel.changeY(20);
                System.out.println("S");
                break;
            case KeyEvent.VK_D:
                gamePanel.changeX(20);
                System.out.println("D");
                break;
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
        
    }
    
}
