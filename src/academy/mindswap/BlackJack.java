package academy.mindswap;

import java.util.Random;

public class BlackJack {
    public static void main(String[] args) {
        Player player = new Player("Rui",0);
        Player player1 = new Player("Dealer",0);
        /*ThrowCards ace = new ThrowCards(1,"Ace");
        ThrowCards card2 = new ThrowCards(2,"2");
        ThrowCards card3 = new ThrowCards(3,"3");
        ThrowCards card4 = new ThrowCards(4,"4");
        ThrowCards card5 = new ThrowCards(5,"5");
        ThrowCards card6 = new ThrowCards(6,"6");
        ThrowCards card7 = new ThrowCards(7,"7");
        ThrowCards card8 = new ThrowCards(8,"8");
        ThrowCards card9 = new ThrowCards(9,"9");
        ThrowCards card10 = new ThrowCards(10,"10");
        ThrowCards cardJ = new ThrowCards(11,"Jack");
        ThrowCards card11 = new ThrowCards(12,"Queen");
        ThrowCards cardK = new ThrowCards(13,"King");


         */
        int randomNumber;
        /*int game = 1;
        do{ randomNumber = Math.random()* (13 - 1 + 1) + 1;
            if (game % 2 == 0){

            } else {

            }
            game ++;
        } while (player.getScore() < 21 && player1.getScore() < 21);

         */
        do {
            randomNumber = (int) (Math.random()* (13 - 1 + 1) + 1);
            if (player.getHandsPlayed() < player1.getHandsPlayed()){
                player.setScore(randomNumber);
                player.setHandsPlayed(1);
            } else {
                player1.setScore(randomNumber);
                player1.setHandsPlayed(1);
            }
        }while (player.getScore() <= 21 && player1.getScore() <= 21);
        if (player.getScore() > player1.getScore()){
            System.out.println("O jogador " +player.getName() + " Perdeu com " + player.getScore());

        } else {
            System.out.println("O jogador " + player1.getName() + " Perdeu com " + player1.getScore());
        }
    }
}
