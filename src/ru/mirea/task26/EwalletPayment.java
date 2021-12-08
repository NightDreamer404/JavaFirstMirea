package ru.mirea.task26;

import java.util.Scanner;

public class EwalletPayment implements PaymentStratege{
    private double balance;

    @Override
    public void refill(double balance)
    {
        this.balance = balance;
    }

    @Override
    public void pay(double price) {
        if(getBalance()-price < 0)
        {
            System.out.println("На счёту вашего электронного кошелька недостаточно средств");
            System.out.println("Текущий баланс: " + getBalance() + " руб");
            System.out.println("Пополните счёт");
        }
        else {
            refill(getBalance() - price);
        }
    }

    @Override
    public double getBalance() {
        return balance;
    }

    @Override
    public String collectInformation() {
        String info = "номер электронного кошелька: ";
        Scanner read = new Scanner(System.in);
        System.out.println("Введите номер вашего электронного кошелька");
        info += read.nextLong();
        info += ", код доступа: ";

        System.out.println("Введите ваш код доступа");
        info += read.nextInt();
        return info;
    }
}
