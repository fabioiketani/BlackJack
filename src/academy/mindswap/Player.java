package academy.mindswap;

public class Player {
    private String name;
    private int score;
    private int handsPlayed;

    public Player(String name, int score){
        this.name = name;
        this.score = score;
        this.handsPlayed = 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score += score;
    }

    public int getHandsPlayed() {
        return handsPlayed;
    }

    public void setHandsPlayed(int handsPlayed) {
        this.handsPlayed += handsPlayed;
    }
}
