package ru.mirea.task22;

public class CreditCard implements Card{
    private long cardNum;
    private int CVV;
    private String color;
    private String type;
    private String status;
    public CreditCard()
    {
        cardNum = (long) (2500000 + Math.random() * 9999999);
        CVV = (int) (100 + Math.random() * 999);
        color = "голубой";
        type = "кредитная карта";
        status = "активная";
    }
    @Override
    public long getCardNum()
    {
        return cardNum;
    }

    @Override
    public int getCardCVV() {
        return CVV;
    }

    @Override
    public String getCardColor()
    {
        return color;
    }

    @Override
    public String getCardType()
    {
        return type;
    }

    @Override
    public String getCardStatus() { return status; }

    @Override
    public void getCardInfo()
    {
        System.out.println("Тип карты: " + getCardType() + "; Расцветка: " + getCardColor() + "; Номер карты: " + getCardNum() + "; CVV: " + getCardCVV() + "; Статус: " +getCardStatus());
    }
}
