package ru.mirea.task1.opt3;
import java.lang.*;
public class HarmonicRow {
    public static void main(String[] args)
    {
        double num = 1;
        for(int i = 1; i < 12; i++)
        {
            System.out.print((double)Math.round(num/i * 100d) / 100d + " ");
        }
    }
}
