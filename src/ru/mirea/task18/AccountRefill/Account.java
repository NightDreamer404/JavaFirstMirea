package ru.mirea.task18.AccountRefill;

public class Account {
    private double amount = 0;
    private long number;

    Account() {
        number = (long) (250000000 + Math.random() * 999999999);
    }

    public double getAmount() {
        return amount;
    }

    public long getNumber() {
        return number;
    }

    public void setAmount(double amount) {
        this.amount += amount;
    }
}
