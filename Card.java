package HW25;

import java.util.Iterator;
import java.util.LinkedList;

public class Card {
    /*Create a Card class that will have interest rate field and card type
  and a constructor that will initialize the fields.
  Create 3 objects of different card and store them into LinkedList.
  Using for loop/advanced for loop/ iterator access all methods of the class.*/
    private double interestRate;
    String cardType;

    public Card(double interestRate, String cardType) {
        this.interestRate = interestRate;
        this.cardType = cardType;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public String getCardType() {
        return cardType;
    }


    public static void main(String[] args) {
        LinkedList<Card> cardList=new LinkedList<>();
        Card card1=new Card(15.5,"Gold");
        Card card2=new Card(12.8,"Platinum");
        Card card3=new Card(18.2,"Silver");

        cardList.add(card1);
        cardList.add(card2);
        cardList.add(card3);

        for (int i = 0; i < cardList.size(); i++) {
            Card card = cardList.get(i);
            System.out.println("Card type: " + card.getCardType());
            System.out.println("Interest rate: " + card.getInterestRate());
        }
        for (Card card : cardList) {
            System.out.println("Card Type: " + card.getCardType());
            System.out.println("Interest Rate: " + card.getInterestRate());
        }
        Iterator<Card> iterator = cardList.iterator();
        while (iterator.hasNext()) {
            Card card = iterator.next();
            System.out.println("Card Type: " + card.getCardType());
            System.out.println("Interest Rate: " + card.getInterestRate());
        }



    }
}
