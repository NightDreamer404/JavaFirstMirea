package ru.mirea.task21;

class Card {
    private String cardNum;
    private int cvv;
    public Card(String cardNum, int cvv)
    {
        this.cardNum = cardNum;
        this.cvv = cvv;
    }
    public String getCardNum()
    {
        return this.cardNum;
    }

    public int getCvv()
    {
        return cvv;
    }
}