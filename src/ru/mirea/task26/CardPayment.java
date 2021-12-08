package ru.mirea.task26;
import java.lang.*;
import java.util.Scanner;

public class CardPayment implements PaymentStratege{
    private double balance;

    @Override
    public void refill(double balance)
    {
        this.balance = balance;
    }

    @Override
    public void pay(double price) {
        refill(getBalance()-price);
        if(getBalance() < 0)
        {
            System.out.println("Были использованы кредитные средства карты");
            System.out.println("Текущий баланс: " + getBalance() + " руб");
            System.out.println("Не забудьте внести средства");
        }
    }

    @Override
    public double getBalance() {
        return balance;
    }

    @Override
    public String collectInformation() {
        String info = "номер карты:";
        Scanner read = new Scanner(System.in);
        System.out.println("Введите номер вашей карты");
        info += read.nextLong();
        info += ", CVV:";

        System.out.println("Введите ваш CVV код");
        info += read.nextInt();
        return info;
    }
}
