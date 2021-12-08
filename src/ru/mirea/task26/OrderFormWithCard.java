package ru.mirea.task26;

public class OrderFormWithCard extends OrderForm{
    public OrderFormWithCard()
    {
        this.stratege = new CardPayment();
    }
}
