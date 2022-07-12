package academy.mindswap;



public class BlackJack {
    Player player1 = new Player("Daniel", 0);
    Player dealer = new Player("Dealer", 0);
    ThrowCards throwCards = new ThrowCards();

    public void theGame(){
        while(dealer.getScore() < 21){
            int player1Hand = throwCards.randomNumber();
            player1.addScore(player1Hand);
            player1.setCardsHistory(player1Hand);
            System.out.println(player1.getName());
            if (player1.getScore() > 21){
                System.out.println("perdeste");
                return;
            }
            int dealerHand = throwCards.randomNumber();
            dealer.addScore(dealerHand);
            dealer.setCardsHistory(dealerHand);
            System.out.println(dealer.getName());
        }
        System.out.println("quebrou a banca");
    }
}
