package game.model.src.main;

public class GameState {
    private int playerScore;
    private boolean isRunning;

    public GameState() {
        this.playerScore = 0;
        this.isRunning = true;
    }

    public int getPlayerScore() {
        return playerScore;
    }

    public void increaseScore(int points) {
        playerScore += points;
    }

    public boolean isRunning() {
        return isRunning;
    }

    public void stopGame() {
        isRunning = false;
    }
}

