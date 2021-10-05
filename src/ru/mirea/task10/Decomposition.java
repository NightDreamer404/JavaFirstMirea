package ru.mirea.task10;
import java.lang.*;
import java.math.*;
import java.util.Scanner;
public class Decomposition {
    public static void multipliers(int num, int divider)
    {
        //если число делится на делитель, значит делим и проходим дальше
        if (num % divider == 0)
        {
            if (num == 2 || num / divider == 1)
            {
                System.out.println(num);
                return;
            }
            System.out.print(divider + " ");
            multipliers(num / divider, divider);
        }
        //иначе увеличиваем делитель
        else
        {
            BigInteger bigInteger = BigInteger.valueOf(num);
            boolean primeNum = bigInteger.isProbablePrime(num);
            if(primeNum) {
                System.out.println(num);
                return;
            }
            else {
                multipliers(num, ++divider);
            }
        }
    }

    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        multipliers(scan.nextInt(), 2);
    }
}
