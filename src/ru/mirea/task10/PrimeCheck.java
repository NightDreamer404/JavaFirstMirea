package ru.mirea.task10;
import java.lang.*;
import java.util.Scanner;
public class PrimeCheck {
    public static void IsPrime(int num, int divider) {

        while (divider < Math.sqrt(num) && num % divider != 0) {
            IsPrime(num, ++divider);
            return;
        }

        if ((num % divider != 0) || (num == divider))       //учтен случай числа равному 2-м
        {
            System.out.println("YES");
            return;
        }
        else
        {
            System.out.println("No");
            return;
        }
    }

    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        IsPrime(scan.nextInt(), 2);
    }
}
