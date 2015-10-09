package com.malcolm;

import java.util.*;

/**
 * Created by Malcolm on 10/7/2015.
 */
public class deckClass {
public ArrayList<cardClass> discardPile=new ArrayList<>();
    private ArrayList<cardClass> cards = new ArrayList<cardClass>();//the deck creates a place to put the cards
    String[] valuesList = {"A","2","3","4","5","6","7","8","9","10","J","Q","K"};//The deck knows that these are card aspects
    String[] suitsList={" of Clubs"," of Hearts"," of Spades"," of Diamonds"};

    public deckClass(){
            for (int i = 0; i<suitsList.length; i++) {//for everything on the suits list, assign a value
                for(int j=0; j<valuesList.length; j++){//for every value on the values list, save them into the arraylist of cards
                    this.cards.add(new cardClass(suitsList[i],valuesList[j]));
                }
            }
        Collections.shuffle(cards);//By using a Collection I can auto shuffle every time! AWESOME!
    }
public ArrayList<cardClass> getDeck(){
    return cards;
}
  /*  public cardClass dealCard(){//this is me trying to ge a single card.  It is not working very well/at all.
        String singleCard=cards.toString();
        cards.get(0).toStringMethod()=singleCard;
        return singleCard;
}*/
}
