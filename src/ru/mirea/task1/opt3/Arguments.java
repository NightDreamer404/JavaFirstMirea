package ru.mirea.task1.opt3;
import java.lang.*;

public class Arguments {
    public static void main(String[] argc)
    {
        if(argc.length > 0) {
            for (int i = 0; i < argc.length; i++) {
                System.out.println(argc[i]);
            }
        }
        else
        {
            System.out.println("Аргументы командной строки отсутствуют");
        }
    }
}
