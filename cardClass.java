package com.malcolm;

/**
 * Created by Malcolm on 10/7/2015.
 */
public class cardClass {//cards know they have suits and names
    String suitOfCard ="";
    String nameOfCard="";

    public cardClass(String name,String suit){
        this.suitOfCard =suit;
        this.nameOfCard=name;
    }

    public void setSuitOfCard(String suitOfCard) {
        this.suitOfCard = suitOfCard;
    }

    public void setNameOfCard(String nameOfCard) {
        this.nameOfCard = nameOfCard;
    }
public String toStringMethod(){
    return this.nameOfCard+this.suitOfCard;
}


}
