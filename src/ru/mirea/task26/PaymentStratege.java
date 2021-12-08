package ru.mirea.task26;

public interface PaymentStratege {
    public void refill(double balance);
    public void pay(double price);
    public double getBalance();
    public String collectInformation();
}
