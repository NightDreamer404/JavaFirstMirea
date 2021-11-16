package ru.mirea.task21;

public class UserAccount extends User{
    private double amount = 0;
    private String currency;
    private long number;

    public UserAccount()
    {
        number = (long) (250000000 + Math.random() * 999999999);
    }

    UserAccount(String currency) {
        number = (long) (250000000 + Math.random() * 999999999);
        this.currency = currency;
    }

    public double getAmount() {
        return amount;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public long getNumber() {
        return number;
    }

    public String getCurrency() {
        return currency;
    }
    public void setAmount(double amount) {
        this.amount += amount;
    }
}
