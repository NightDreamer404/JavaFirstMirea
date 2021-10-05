package ru.mirea.task10;
import java.lang.*;
import java.util.Scanner;

public class Uturn {
    public static int reverse(int num, int buf)
    {
        int result = buf * 10 + num % 10;       //набираем перевернутое число
        if(num > 10)
        {
            result = reverse(num/10, result);       //сокращаем исходное
        }
        return result;
    }
    public static void main (String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println(reverse(scan.nextInt(), 0));
    }
}
