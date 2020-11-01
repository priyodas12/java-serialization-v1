package io.javalab.serialization;

import java.io.Serializable;

public class Card implements Serializable {

    private static final long serialVersionUID = 7611757324916349377L;

    int cardNumber;
    static String type;
    String holderName;
    transient boolean isActive;
    double avlBalance;

    public Card(int cardNumber, String holderName, boolean isActive, double avlBalance) {
        this.cardNumber = cardNumber;
        this.holderName = holderName;
        this.isActive = isActive;
        this.avlBalance = avlBalance;
    }

    public int getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(int cardNumber) {
        this.cardNumber = cardNumber;
    }

    public static String getType() {
        return type;
    }

    public static void setType(String type) {
        Card.type = type;
    }

    public String getHolderName() {
        return holderName;
    }

    public void setHolderName(String holderName) {
        this.holderName = holderName;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    public double getAvlBalance() {
        return avlBalance;
    }

    public void setAvlBalance(double avlBalance) {
        this.avlBalance = avlBalance;
    }

    @Override
    public String toString() {
        return "Card{" +
                "cardNumber=" + cardNumber +
                ", holderName='" + holderName + '\'' +
                ", isActive=" + isActive +
                ", avlBalance=" + avlBalance +
                '}';
    }

}
