package ru.mirea.task26;
import java.lang.*;
import java.util.Scanner;

public class TestClass {
    public static void main(String[] args)
    {
        boolean quit = false;
        Scanner scan = new Scanner(System.in);
        Scanner scan2 = new Scanner(System.in);
        OrderForm form = null;
        System.out.println("Выберете желаемый способ оплаты");
        System.out.println("1) Кредитная карта");
        System.out.println("2) Электронный кошелёк");
        while(!quit)
        switch(scan.nextInt())
        {
            case 1:
            {
                form = new OrderFormWithCard();
                form.setPaymentMethod("карта");
                quit = true;
                break;
            }
            case 2:
            {
                form = new OrderFormWithWallet();
                form.setPaymentMethod("электронный кошёлек");
                quit = true;
                break;
            }
            default:
            {
                System.out.println("Некорректный ввод");
                break;
            }
        }
        System.out.println("Задайте начальное значение баланса");
        while(true) {
            double balance = scan.nextDouble();
            if (balance > 0) {
                form.refill(balance);
                break;
            }
            System.out.println("Некорректное значение баланса");
        }
        System.out.println("Введите ФИО");
        form.setFullName(scan2.nextLine());
        System.out.println("Введите адрес");
        form.setAdress(scan2.nextLine());
        form.setPaymentInformation();   //вводим любые данные
        form.getOrderInfo();
        System.out.println("Проверьте корректность введённых данных и введите \"1\", если всё верно");
        System.out.println("В противном случае введите \"0\"");
        if (scan2.nextInt() == 1)
        {
            form.pay();
        }
        else
        {
            System.out.println("Заказ №" + form.getOrderNum() + " отменён");
        }

    }
}
