package opg4_cards;

import java.util.Random;

public class DeckOfCards implements CardInterface {

    private Card[] deck;

    public DeckOfCards(){
       deck = new Card[NUMBER_OF_CARDS];
       int indexTracker = 0;
       for(int i = ACE; i <= KING; i++){
           for(int j = CLUBS; j <= SPADES; j++){
               deck[indexTracker] = new Card(i ,j);
               indexTracker++;
           }
       }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < deck.length; i++) {
            if (i != 0 && i % 4 == 0) {
                sb.append("\n");
            }
            sb.append(deck[i]);
            if (i != deck.length-1) {
                sb.append(", ");
            }
        }
        return sb.toString();
    }

    public void shuffle(int swaps) {
        Card [] temp = new Card[1];
        for(int i = 0; i < swaps; i++){
            int rand1 = new Random().nextInt(51);
            int rand2 = new Random().nextInt(51);
            temp[0] = deck[rand1];
            deck[rand1] = deck[rand2];
            deck[rand2] = temp[0];
        }
        
    }

    /**
     * @param args
     */
    public static void main(String[] args) {
        
            // Til test af opg 4 c
            DeckOfCards deckOfCards = new DeckOfCards();
            System.out.println("Opg 4c:\n" + deckOfCards);
            
            // Til test af opg 4 d
            deckOfCards.shuffle(100);
            System.out.println("Opg 4d:\n" + deckOfCards);
        

    }

}
