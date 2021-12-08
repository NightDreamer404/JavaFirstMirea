package ru.mirea.task26;

public class OrderFormWithWallet extends OrderForm{
    public OrderFormWithWallet()
    {
        this.stratege = new EwalletPayment();
    }
}
