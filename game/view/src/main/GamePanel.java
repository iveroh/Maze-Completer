package game.view.src.main;

import game.model.src.main.GameState;
import javax.swing.JPanel;
import java.awt.Graphics;

public class GamePanel extends JPanel {
    private GameState gameState;

    public GamePanel() {
        this.gameState = new GameState();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawString("Score: " + gameState.getPlayerScore(), 10, 20);
        // Additional rendering logic for the game
    }

    public GameState getGameState() {
        return gameState;
    }

    public void refresh() {
        repaint();
    }
}

