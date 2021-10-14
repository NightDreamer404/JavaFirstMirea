package ru.mirea.task13;
import java.lang.*;
import java.util.*;

public class LinkedListTest {
    public static void output(LinkedList<String> list)
    {
        for(int i = 0; i < list.size(); i++)
        {
            System.out.println(list.get(i));
        }
        System.out.println("\n");
    }
    public static void main(String[] args)
    {
        LinkedList<String> text = new LinkedList<>();

        //1 - добавление элементов в двусвязный список
        text.add("Hello, ");
        text.add("this ");
        text.add("text ");
        text.add("is ");
        text.add("supposed ");
        text.add("for ");
        text.add("LinkedList ");
        text.add("testing");
        output(text);

        //2 - удаление элемента из списка
        text.remove(6);
        output(text);

        //3 - возврат индекса искомого элемента
        System.out.println("Индекс слова text: " + text.indexOf("text "));
        System.out.println("\n");

        //4 - содержится ли элемент в списке
        System.out.println(text.contains("for "));
        System.out.println("\n");

        //5 - вставка с заменой
        text.set(6, "imposter");
        output(text);

        //6 - возврат первого элемента и его удаление
        System.out.println(text.pollFirst());
        System.out.println("\n");

        //7 - возврат последнего элемента и его удаление
        System.out.println(text.pollLast());
        System.out.println("\n");

        //8 - очистка двусвязного списка
        text.clear();
        System.out.println("Размер списка: " + text.size());        //9 - размер списка
    }

}
