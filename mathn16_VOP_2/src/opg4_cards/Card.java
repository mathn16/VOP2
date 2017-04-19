package opg4_cards;

public class Card implements CardInterface {

    private int face;
    private int suit;

    public Card(int face, int suit)  {  
        if(face >= ACE && face <= KING && suit >= CLUBS && suit <= SPADES){
            this.face = face;
            this.suit = suit;
        }else{
            System.out.println("Illegal input. For face it must be a number between 1 and 13\nFor suits it must be a number between 1 and 4.");
        }
    }

    @Override
    public String toString() {
        // Implementer generering af navn på kort
        
        String cardName = "";
        return cardName;
    }

    /**
     * @param args
     */
    public static void main(String[] args) {
       
            System.out.println(new Card(1, 3));
            System.out.println(new Card(3, 1));
            System.out.println(new Card(13, 4));
            System.out.println(new Card(12, 3));
            System.out.println(new Card(17, 5));
            



    }

}
