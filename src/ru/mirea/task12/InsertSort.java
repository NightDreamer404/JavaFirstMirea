package ru.mirea.task12;
import java.lang.*;
import java.util.Arrays;

public class InsertSort {

    public static void sortArr(int[] idNumber)
    {
        System.out.println(Arrays.toString(idNumber));
        for (int left = 1; left < idNumber.length; left++) {
            // Вытаскиваем значение элемента
            int value = idNumber[left];
            // Перемещаемся по элементам, которые перед вытащенным элементом
            int i = left - 1;
            for (; i >= 0; i--) {
                // Если вытащили значение меньшее — передвигаем больший элемент дальше
                if (value < idNumber[i]) {
                    idNumber[i + 1] = idNumber[i];
                } else {
                    // Если вытащенный элемент больше — останавливаемся
                    break;
                }
            }
            // В освободившееся место вставляем вытащенное значение
            idNumber[i + 1] = value;
        }
        System.out.println(Arrays.toString(idNumber));
    }

    public static void main(String[] args)
    {
        Student[] stud = new Student[10];
        int[] idNumber = new int[stud.length];
        for (int i = 0; i < stud.length; i++)
        {
            int ranNum = (int) (1 + Math.random()*5000);
            stud[i] = new Student(ranNum);
        }

        for(int i = 0; i < stud.length; i++)
        {
            idNumber[i] = stud[i].getId();
        }

        sortArr(idNumber);
    }
}

class Student
{
    private int id;
    public Student(int id) {
        this.id = id;
    }

    public int getId()
    {
        return id;
    }
}

