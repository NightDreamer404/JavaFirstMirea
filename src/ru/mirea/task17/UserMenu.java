package ru.mirea.task17;
import java.lang.*;
import java.util.Scanner;


public class UserMenu {
    private int returnOption = 0;
    private int timeHlp = 1;
    public void showMenu() {
        System.out.println("Вас приветствует меню пользователя! Пожалуйста, выберите один из интересующих вас пунктов, введя соответствующее название.");
        System.out.println("Для этого введите название интересующего вас пункта, указанное в скобках");
        System.out.println("1) Заявка на кредит/ипотеку (Заявка)");
        System.out.println("2) Оформление вклада (Вклад)");
        System.out.println("3) Получение банковской карты (Карта)");
        System.out.println("4) Пополнение счёта (Пополнение)");
        System.out.println("5) Перевод между счетами (Перевод)");
        System.out.println("6) Анализ расходов (Анализ)");
        System.out.println("7) Конвертация валюты (Конвертация)");
        System.out.println("0) Возврат в предыдущее меню (Возврат)");
    }

    public int getReturnOption()
    {
        return returnOption;
    }
    public int getTimeHlp() { return timeHlp; }
    public void setReturnOption(int returnOption)
    {
        this.returnOption = returnOption;
    }
    public void searchOption(String choice) {
        timeHlp = 0;
        UserOptions op = null;
        UserOptions[] enums = UserOptions.values();
        for (int i = 0; i < enums.length; i++) {
            if (choice.equals(enums[i].getTitle())) {
                op = enums[i];
                break;
            }
        }
        if (op == null)
        {
            op = UserOptions.valueOf("Error");
        }
        userSwitcher(op);
    }

    public void userSwitcher(UserOptions op) {
        switch (op) {
            case Application: {
                System.out.println("Заявка подана");
                //...
                returnOption = 0;
                break;
            }
            case Deposit: {
                System.out.println("Вклад оформлен");
                //...
                returnOption =0;
                break;
            }
            case Card: {
                System.out.println("Карта создана");
                //...
                returnOption =0;
                break;
            }
            case Refill: {
                System.out.println("Счёт пополнен");
                //...
                returnOption =0;
                break;
            }
            case Transfer: {
                System.out.println("Средства переведены");
                //...
                returnOption =0;
                break;
            }
            case Analysis: {
                System.out.println("Анализ завершён");
                //...
                returnOption =0;
                break;
            }
            case Convert: {
                System.out.println("Конвертация успешна");
                //...
                returnOption =0;
                break;
            }
            case Return: {
                System.out.println("Возврат");
                returnOption = 1;
                timeHlp = 1;
                break;
            }
            case Error:
            {
                System.out.println("Ошибка");
                returnOption = 0;
                break;
            }
        }
    }
}