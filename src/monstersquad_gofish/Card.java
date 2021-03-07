package monstersquad_gofish;

public class Card {

    public enum Suit {HEARTS, SPADES, DIAMONDS, CLUBS};
    public enum Value{ONE, TWO, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE, TEN, JACK, QUEEN, KING};
    private final Suit suit;
    private final Value value;

    public Card(Suit suit, Value value) {
        this.suit = suit;
        this.value = value;
    }
    
    public Value getValue() {
        return this.value;
    }

    public Suit getSuit() {
        return suit;
    }
    
}