package ru.mirea.task10;
import java.lang.*;
import java.util.Scanner;

public class Palindrome {

    public static boolean recursion(int start, int end, String word)
    {
        //char[] wordchar = word.toCharArray();
        if (start == end)
        {
            return true;
        }
        else if(Math.abs(start - end) == 1)
        {
            return true;
        }
        else
        {
            if(word.charAt(start) == word.charAt(end))      //обращаемся к строке по индексам
            {
                return recursion(start + 1, end-1, word);       //сокращаем сравнение
            }
            else
            {
                return false;
            }
        }
    }
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        String word;
        word = scan.next();
        if (recursion(0, word.length()-1, word))
        {
            System.out.println("YES");
        }
        else
        {
            System.out.println("NO");
        }
    }
}
