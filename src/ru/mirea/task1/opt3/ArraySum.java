package ru.mirea.task1.opt3;
import java.lang.*;
import java.util.Scanner;
public class ArraySum {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Введите размерность массива");
        int n = read.nextInt();
        int[] b = new int[n];
        int sum = 0;
        System.out.println("Введите элементы массива");

        for (int i = 0; i < n; i++)
        {
            b[i] = read.nextInt();
            sum += b[i];
        }

        System.out.println("Сумма всех элементов массива через цикл for: " + sum);
        sum = 0;
        int i = 0;
        while(i < n)
        {
            sum+=b[i];
            i++;
        }

        System.out.println("Сумма всех элементов массива через цикл while: " + sum);
        sum = 0;
        i = 0;
        do
        {
            sum+=b[i];
            i++;
        } while(i < n);
        System.out.println("Сумма всех элементов массива через цикл do-while: " + sum);
    }
}
