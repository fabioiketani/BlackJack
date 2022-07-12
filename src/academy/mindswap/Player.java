package academy.mindswap;

public class Player {

    private String name;
    private int score;
    private String cardsHistory;

    ThrowCards throwCards = new ThrowCards();
    public Player(String name, int score){
        this.name = name;
        this.score = score;
        this.cardsHistory = "";
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

    public void addScore(int score) {
        this.score += score;
        //System.out.println(this.score);
    }

    public String getCardsHistory() {
        return cardsHistory;
    }

    public void setCardsHistory(int card) {
        this.cardsHistory = cardsHistory + throwCards.getCards(card);
    }
}
