package cards;

import java.util.LinkedList;
import java.util.List;

//parent class Deck
public class Deck {
    
    //member
    public String[] SUIT = {"Diamond", "Hearts", "Spades", "Clubs"};
    public String[] NAME = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};

    public int[] RANK = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 10, 10, 10};

    //private Cards[] cards = new Cards[52]; //don't understand this line
    private List<Cards> cards = new LinkedList<>();

    //constructor
    public Deck(){
        
        
        for(int s = 0; s < SUIT.length; s++){
            for(int j = 0; j < NAME.length; j++){
                Cards c = new Cards(SUIT[s], NAME[j], RANK[j]);
                cards.add(c);
            }
            
        }

        for(int s = 0; s < cards.size(); s++){
            System.out.printf("> %s\n", cards.get(s));
        }

        System.out.printf("> cards.size(): %d\n", cards.size());
    }

    /*
    public Deck(){

        //deckOfCards is [0,1,2,3,4...51]
        int s = 0;
        int j = 0;
        while(s < SUIT.length){
            j = 0;
            while(j < NAME.length){
                Cards c = new Cards(SUIT[s], NAME[j], RANK[j]);
                System.out.printf(">> card: %s\n", c);
                j++;
            }
    }

    //method

    }


    //shuffle
    //draw
*/
}
