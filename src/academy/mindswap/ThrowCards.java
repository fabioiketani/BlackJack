package academy.mindswap;


public class ThrowCards {
    private String cards[] =  { "ace","2","3", "4","5","6","7","8","9","10","Jack","Queen","King" };
    public int randomNumber() {
        return (int) (Math.random()* (13 - 1 + 1) + 1);
    }
    public String getCards(int indice) {
        String cardChoice = cards[indice];
        System.out.println(cardChoice);
        return cardChoice;
    }
}

