package ru.mirea.task17;
import java.lang.*;
import java.util.Scanner;

enum UserOptions
{
    Application ("Заявка"),
    Deposit ("Вклад"),
    Card ("Карта"),
    Refill ("Пополнение"),
    Transfer ("Перевод"),
    Analysis ("Анализ"),
    Convert ("Конвертация");

    public String title;
    UserOptions(String title)
    {
        this.title = title;
    }

    public String getTitle()
    {
        return title;
    }
}
public class UserMenu {
    void showMenu() {
        System.out.println("Вас приветствует меню пользователя! Пожалуйста, выберите один из интересующих вас пунктов, введя соответствующее название.");
        System.out.println("Для этого введите название интересующего вас пункта, указанное в скобках");
        System.out.println("1) Заявка на кредит/ипотеку (Заявка)");
        System.out.println("2) Оформление вклада (Вклад)");
        System.out.println("3) Получение банковской карты (Карта)");
        System.out.println("4) Пополнение счёта (Пополнение)");
        System.out.println("5) Перевод между счетами (Перевод)");
        System.out.println("6) Анализ расходов (Анализ)");
        System.out.println("7) Конвертация валюты (Конвертация)");
    }

    public void searchOption(String choice) {
        UserOptions op = null;
        UserOptions[] enums = UserOptions.values();
        for (int i = 0; i < enums.length; i++) {
            if (choice.equals(enums[i].getTitle())) {
                op = enums[i];
                break;
            }
        }
        userSwitcher(op);
    }

    public void userSwitcher(UserOptions op) {
        switch (op) {
            case Application: {
                System.out.println("Заявка подана");
                //...
                break;
            }
            case Deposit: {
                System.out.println("Вклад оформлен");
                //...
                break;
            }
            case Card: {
                System.out.println("Карта создана");
                //...
                break;
            }
            case Refill: {
                System.out.println("Счёт пополнен");
                //...
                break;
            }
            case Transfer: {
                System.out.println("Средства переведены");
                //...
                break;
            }
            case Analysis: {
                System.out.println("Анализ завершён");
                //...
                break;
            }
            case Convert: {
                System.out.println("Конвертация успешна");
                //...
                break;
            }
        }
    }
}