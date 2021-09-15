package ru.mirea.task1.opt3;
import java.lang.*;
import java.util.Scanner;
public class Factorial {
    public static int Calc(int num)
    {
        int n = 1;
        if (num == 0)
        {
            return n;
        }
        if (num < 0)
        {
            System.out.println("Ошибка");
            System.exit(1);
        }
        for(int i = 1; i < num; i++)
        {
            n = n*(i+1);
        }
        return n;
    }

    public static void main(String[] argc)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите число n");
        System.out.println("Факториал введённого числа равен: " + Calc(scan.nextInt()));

    }
}
