package game.view.src.main;

import game.controller.src.main.GameController;
import javax.swing.*;
import java.awt.*;

public class GameFrame extends JFrame {
    private GamePanel gamePanel;

    public GameFrame() {
        setTitle("Java Swing Game");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(800, 600);
        setLocationRelativeTo(null);

        gamePanel = new GamePanel();
        add(gamePanel);

        GameController controller = new GameController(gamePanel);
        addKeyListener(controller);
    }
}

