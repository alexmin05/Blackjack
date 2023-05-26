public class Card {

    public String cardName;
    public String suit;
    public int cardValue;

    public Card (int suitNum, int cardNum) {
        if (suitNum == 0) {
            suit = "Spades";
        }
        else if (suitNum == 1) {
            suit = "Hearts";
        }
        else if (suitNum == 2) {
            suit = "Diamonds";
        }
        else if (suitNum == 3) {
            suit = "Clubs";
        }
        if (cardNum == 0) {
            cardName = "Ace";
            cardValue = 1;
        }
        else if (cardNum == 1) {
            cardName = "Two";
            cardValue = 2;
        }
        else if (cardNum == 2) {
            cardName = "Three";
            cardValue = 3;
        }
        else if (cardNum == 3) {
            cardName = "Four";
            cardValue = 4;
        }
        else if (cardNum == 4) {
            cardName = "Five";
            cardValue = 5;
        }
        else if (cardNum == 5) {
            cardName = "Six";
            cardValue = 6;
        }
        else if (cardNum == 6) {
            cardName = "Seven";
            cardValue = 7;
        }
        else if (cardNum == 7) {
            cardName = "Eight";
            cardValue = 28;
        }
        else if (cardNum == 8) {
            cardName = "Nine";
            cardValue = 9;
        }
        else if (cardNum == 9) {
            cardName = "Ten";
            cardValue = 10;
        }
        else if (cardNum == 10) {
            cardName = "Jack";
            cardValue = 10;
        }
        else if (cardNum == 11) {
            cardName = "Queen";
            cardValue = 10;
        }
        else if (cardNum == 12) {
            cardName = "King";
            cardValue = 10;
        }
    }

    public void printCardInfo() {
        System.out.println(cardName + " of " + suit);
    }

}
