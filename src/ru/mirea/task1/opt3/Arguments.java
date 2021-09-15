package ru.mirea.task1.opt3;
import java.lang.*;

public class Arguments {
    public static void main(String[] args)
    {
        if(args.length > 0) {
            for (int i = 0; i < args.length; i++) {
                System.out.println(args[i]);
            }
        }
        else
        {
            System.out.println("Аргументы командной строки отсутствуют");
        }
    }
}
