package cards;

public class Cards{

    //members
    private String suit;
    private String name;
    private int rank;

    public Cards(){}

    //constructor
    public Cards(String suit, String name, int rank){
        this.suit = suit;
        this.name = name;
        this.rank = rank;
    }

    //getters and setters
    public String getSuit() {return suit;}
    public void setSuit(String suit) {this.suit = suit;}

    public int getRank() {return rank;}
    public void setRank(int rank) {this.rank = rank;}

    public String getName() {return name;}
    public void setName(String name) {this.name = name;}

    @Override
    public String toString(){
        return "Card{suit=%s, name=%s, rank=%d}".formatted(this.suit, this.name, this.rank);
    }

}
