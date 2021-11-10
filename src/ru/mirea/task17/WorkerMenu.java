package ru.mirea.task17;
import java.lang.*;
import java.util.Scanner;


public class WorkerMenu {
    private int returnOption = 0;
    private int timeHlp = 1;
    public void showMenu() {
        System.out.println("Вас приветствует меню сотрудника! Пожалуйста, выберите один из интересующих вас пунктов, введя соответствующее название.");
        System.out.println("Для этого введите название интересующего вас пункта, указанное в скобках");
        System.out.println("1) Блокировка банковской карты (Блокировка)");
        System.out.println("2) Рассмотрение заявок на ипотеку (Рассмотрение)");
        System.out.println("3) Конвертация валют (Конвертирование)");
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
        WorkerOptions op = null;
        WorkerOptions[] enums = WorkerOptions.values();
        for (int i = 0; i < enums.length; i++) {
            if (choice.equals(enums[i].getTitle())) {
                op = enums[i];
                break;
            }
        }
        workerSwitcher(op);
    }

    public void workerSwitcher(WorkerOptions op) {
        switch (op) {
            case Locking: {
                System.out.println("Карта заблокирована");
                //...
                break;
            }
            case Review: {
                System.out.println("Заявка рассмотрена");
                //...
                break;
            }
            case Convertate: {
                System.out.println("Валюта сконвертирована");
                //...
                break;
            }
            case Return: {
                System.out.println("Возврат");
                returnOption = 1;
                break;
            }
            case Error: {
                System.out.println("Ошибка");
                returnOption = 0;
                break;
            }
        }
    }
}