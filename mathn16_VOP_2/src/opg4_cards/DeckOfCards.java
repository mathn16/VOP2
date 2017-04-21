package opg4_cards;

public class DeckOfCards implements CardInterface {

    private Card[] deck;

    public DeckOfCards(){
       deck = new Card[NUMBER_OF_CARDS];
       for(int i = 1; i <= KING; i++){
           for(int j = 1; i <= SPADES; i++){
               deck[i-1] = new Card(j ,i);
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

    }

    /**
     * @param args
     */
    public static void main(String[] args) {
        
            // Til test af opg 4 c
            DeckOfCards deckOfCards = new DeckOfCards();
            System.out.println("Opg 4c:\n" + deckOfCards);
            
            // Til test af opg 4 d
//            deckOfCards.shuffle(100);
//            System.out.println("Opg 4d:\n" + deckOfCards);
        

    }

}
