package ru.mirea.task29;

import java.io.*;

public class Main {
    public static void main(String[] args)
    {
        String[] buyInfo = {"Покупка: Доллар США 73,73 руб.", "Евро 83,50 руб.", "Фунт стерлингов 98,27 руб.", "Японская йена 0,65 руб.", "Турецкая лира 4,57 руб."};
        PurchaseExRate purchaseExRate = new PurchaseExRate(buyInfo);
        String[] sellInfo = {"Продажа: Доллар США 74,15 руб.", "Евро 83,54 руб.", "Фунт стерлингов 98,80 руб.", "Японская йена 0,66 руб.", "Турецкая лира 4,59 руб."};
        SellExRate sellExRate = new SellExRate(sellInfo);
        CurrencyInfo curInfo = new CurrencyInfo(purchaseExRate, sellExRate);

        try(FileOutputStream fileOutputStream = new FileOutputStream("D:\\test\\save.ser"))
        {
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(curInfo);
            objectOutputStream.close();
        }
        catch(IOException ex){

            System.out.println(ex.getMessage());
        }

        try(FileInputStream fileInputStream = new FileInputStream("D:\\test\\save.ser"))
        {
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            CurrencyInfo currencyInfo = (CurrencyInfo) objectInputStream.readObject();
            System.out.println(currencyInfo);
        }
        catch(IOException | ClassNotFoundException ex){

            System.out.println(ex.getMessage());
        }
    }
}
