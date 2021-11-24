package ru.mirea.task22;
import java.lang.*;
import java.util.Scanner;
public class TestCard {
    public static void main(String[] args)
    {
        CardFactory factory = new CardFactory();
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите номера типа карты");
        System.out.println("1) Дебитовая");
        System.out.println("2) Кредитная");
        System.out.println("3) Виртуальная");
        switch(scan.nextInt())
        {
            case 1:
            {
                Card debitCard = factory.getCard(CardList.DEBIT);
                debitCard.getCardInfo();
                break;
            }
            case 2:
            {
                Card creditCard = factory.getCard(CardList.CREDIT);
                creditCard.getCardInfo();
                break;
            }
            case 3:
            {
                Card virtualCard = factory.getCard(CardList.VIRTUAL);
                virtualCard.getCardInfo();
                break;
            }
            default:
            {
                System.out.println("Некорректный параметр");
            }
        }
    }
}
