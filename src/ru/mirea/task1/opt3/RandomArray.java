package ru.mirea.task1.opt3;
import java.lang.*;
import java.util.Random;
public class RandomArray {
    public static int[] sort(int[] arr)
    {
        boolean flag = true;
        while(flag)
        {
            flag = false;
            for(int i = 0; i < 9; i ++)
            {
                if (arr[i+1] < arr[i])
                {
                    int buf = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = buf;
                    flag = true;
                }
            }
        }
        return arr;
    }
    public static void output(int[] arr)
    {
        for(int i = 0; i < 10; i++)
        {
            System.out.print(arr[i] + " ");
        }
    }
    public static void main(String[] argc)
    {
        int[] arr = new int[10];

        System.out.println("Массив, сгенерированный при помощи метода random()");

        for(int i = 0; i < 10; i++)
        {
            arr[i] = (int) (1 + Math.random()*10);
            System.out.print(arr[i] + " ");
        }
        System.out.println("");

        sort(arr);
        output(arr);
        System.out.println("");

        System.out.println("Массив, сгенерированный при помощи класса Random");
        Random rand = new Random();
        for(int i = 0; i < 10; i++)
        {
            arr[i] = rand.nextInt(11);
            System.out.print(arr[i] + " ");
        }
        System.out.println("");

        sort(arr);
        output(arr);
        System.out.println("");
    }
}
