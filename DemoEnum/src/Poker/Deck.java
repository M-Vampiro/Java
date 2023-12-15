package Poker;

import java.util.Arrays;
import java.util.Collections;

public class Deck {

  private Card[] cards;

  private Deck(int numberOfCards) {
    this.cards = new Card[numberOfCards];
    int idx = 0;
    for (Suit s : Suit.values()) {
      for (Rank r : Rank.values()) {
        this.cards[idx++] = new Card(r, s);
      }
    }
  }

  public Card[] getCards() {
    return this.cards;
  }

  public static void main(String[] args) {
    Deck d1 = new Deck(52);


    Collections.shuffle(Arrays.asList(d1.getCards()));
    System.out.println(Arrays.toString(d1.getCards()));

    



  }

}
