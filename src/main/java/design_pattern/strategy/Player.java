package design_pattern.strategy;

public class Player {
    private String name;
    private Strategy strategy;
    private int winCount;
    private int loseCount;
    private int gameCount;

    public Player(String name, Strategy strategy) {
        this.name = name;
        winCount = 0;
        loseCount = 0;
        gameCount = 0;
        this.strategy = strategy;
    }

    public Hand nextHand() {
        return strategy.nextHand();
    }

    public void win() {
        strategy.study(Boolean.TRUE);
        winCount++;
        gameCount++;
    }

    public void lose() {
        strategy.study(Boolean.FALSE);
        loseCount++;
        gameCount++;
    }

    public void even() {
        gameCount++;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWinCount() {
        return winCount;
    }

    public void setWinCount(int winCount) {
        this.winCount = winCount;
    }

    public int getLoseCount() {
        return loseCount;
    }

    public void setLoseCount(int loseCount) {
        this.loseCount = loseCount;
    }

    public int getGameCount() {
        return gameCount;
    }

    public void setGameCount(int gameCount) {
        this.gameCount = gameCount;
    }

    @Override
    public String toString() {
        return "[" + this.name + ":" + gameCount + " games, " + winCount + " win, " + loseCount + " lose" + "]";
    }


}
