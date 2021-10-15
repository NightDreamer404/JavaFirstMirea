package ru.mirea.task13;
import java.lang.*;

import static java.lang.System.exit;

class StudentData
{
    private double GPA;
    private int id;
    private String name;
    public StudentData(String name, double GPA, int id) {
        this.name = name;
        this.GPA = GPA;
        this.id = id;
    }

    public double getGPA() { return GPA; }
    public int getID() { return id; }
    public String getName() { return name; }
    public String toString() { return "Name: " + this.name +"; GPA: "+ this.GPA + "; ID: " + this.id; }

}

public class MyArrayList <T>{
    private final int INIT_SIZE = 64;   //фиксируем размер (потом будет увеличен при необходимости)
    private Object[] array = new Object[INIT_SIZE];     //массив данного типа может принимать объекты классов (как и оригинальный ArrayList)
    private int itemPointer = 0;        //фактически переменная для сохранения размера списка

    public void add(T Elem)
    {
        if( itemPointer == (array.length - 1) )     //если всё таки размера в 64 не хватило
            resize(array.length + 1);       //увеличиваем
        array[itemPointer] = Elem;
        itemPointer++;
    }

    public void add(int index, T Elem)
    {
        if(index >= itemPointer)
        {
            System.out.println("IndexOutOfBoundsException has been detected");
            exit(1);
        }
        if( itemPointer == (array.length - 1) )     //см. пред метод
            resize(array.length + 1);
        for(int i = itemPointer; i > index; i--)
        {
            array[i] = array[i-1];      //сдвигаем всё вправо
        }
        array[index] = Elem;
        itemPointer++;
    }
    public void remove(int index)
    {
        if(index >= itemPointer)
        {
            System.out.println("IndexOutOfBoundsException has been detected");
            exit(1);
        }
        for (int i = index; i < itemPointer; i++) {
            array[i] = array[i + 1];        //сдвигаем всё что после удаляемого элемента на 1 влево
        }
        array[itemPointer] = null;      //очищаем последнюю ячейку
        itemPointer--;
    }

    private void resize(int newLength)
    {
        Object[] newArray = new Object[newLength];
        System.arraycopy(array, 0, newArray, 0, itemPointer);       //исходный массив, начальная позиция исх. массива, новый массив, позиция для вставки в новый массив, конец исх массива
        array = newArray;
    }

    public T get(int index)
    {
        return (T) array[index];
    }

    public void set(int index, T Elem)
    {
        array[index] = Elem;
    }

    public int size()
    {
        return itemPointer;
    }

    public void clear()
    {
        for(int i = 0; i < itemPointer; i++)
        {
            array[i] = null;
        }
        itemPointer = 0;
    }
}
