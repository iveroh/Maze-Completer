package game.app.src.main;

import game.view.src.main.GameFrame;
import javax.swing.SwingUtilities;

public class GameApp {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            GameFrame gameFrame = new GameFrame();
            gameFrame.setVisible(true);
        });
    }
}

