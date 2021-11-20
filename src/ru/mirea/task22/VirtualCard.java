package ru.mirea.task22;

public class VirtualCard implements Card{
    private long cardNum;
    private int CVV;
    private String color;
    private String type;
    public VirtualCard()
    {
        cardNum = (long) (2500000 + Math.random() * 9999999);
        CVV = (int) (100 + Math.random() * 999);
        color = "серебристый";
        type = "виртуальная карта";
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
    public void getCardInfo()
    {
        System.out.println("Тип карты: " + getCardType() + "; Расцветка: " + getCardColor() + "; Номер карты: " + getCardNum() + "; CVV: " + getCardCVV());
    }
}
