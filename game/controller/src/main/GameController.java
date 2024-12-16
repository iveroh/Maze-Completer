package game.controller.src.main;

import game.view.src.main.GamePanel;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class GameController extends KeyAdapter {
    private final GamePanel gamePanel;

    public GameController(GamePanel gamePanel) {
        this.gamePanel = gamePanel;
    }

    @Override
    public void keyPressed(KeyEvent e) {
        switch (e.getKeyCode()) {
            case KeyEvent.VK_UP -> System.out.println("Move Up");
            case KeyEvent.VK_DOWN -> System.out.println("Move Down");
            case KeyEvent.VK_LEFT -> System.out.println("Move Left");
            case KeyEvent.VK_RIGHT -> System.out.println("Move Right");
            case KeyEvent.VK_SPACE -> gamePanel.getGameState().increaseScore(10);
        }
        gamePanel.refresh();
    }
}

