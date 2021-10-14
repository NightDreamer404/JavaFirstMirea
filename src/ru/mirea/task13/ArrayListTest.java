package ru.mirea.task13;
import java.lang.*;
import java.util.ArrayList;

class StudentsData
{
    private double GPA;
    private int id;
    private String name;
    public StudentsData(String name, double GPA, int id) {
        this.name = name;
        this.GPA = GPA;
        this.id = id;
    }

    public double getGPA()
    {
        return GPA;
    }
    public int getID() { return id; }
    public String getName() { return name; }
    public String toString()
    {
        return "Name: " + this.name +"; GPA: "+ this.GPA + "; ID: " + this.id;
    }

}
public class ArrayListTest {
    public static void output(ArrayList<StudentsData> list)
    {
        for(int i = 0; i < list.size(); i++)
        {
            System.out.println(list.get(i).toString());     //0 - получение элемента списка
        }
        System.out.println("\n");
    }
    public static void main(String[] args)
    {
        ArrayList<StudentsData> list = new ArrayList<>();
        ArrayList<String> names = new ArrayList<>();
        names.add("Алексей"); names.add("Владимир"); names.add("Дмитрий"); names.add("Александр");

        for (int i = 0; i < 4; i++)
        {
            int nameNum = (int)(0 + Math.random()*(names.size()-1));
            double GPANum = (2 + Math.random()*3);
            GPANum = (double)Math.round(GPANum * 100d) / 100d;
            int IDNum = (int)(1+Math.random()*5000);
            StudentsData student = new StudentsData(names.get(nameNum), GPANum, IDNum);
            names.remove(nameNum);
            list.add(student);
        }

//1 вывод элемента списка
        System.out.println("1-й элемент списка");
        System.out.println(list.get(0));
        System.out.println("\n");
//2 - добавление в конец списка
        list.add(new StudentsData("Егор", 4.1, 1372));
        System.out.println("Добавили в конец");
        output(list);

//3 - добавление в конкретную позицию списка
        list.add(3, new StudentsData("Виктор", 3.7, 1872));
        System.out.println("Добавили на 4-е место");
        output(list);

//4 - замена элемента списка
        list.set(0, new StudentsData("Илья", 2, 175));
        System.out.println("Клонированный список");
        output(list);

//5 - удаление элементов
        list.remove(3);
        list.remove(4);
        System.out.println("Последние два элемента удалены");
        output(list);

//6 - очистка списка
        list.clear();
        System.out.println("Список очищен");
        System.out.println("Размер списка: " + list.size());  //7 - получение размера списка
    }
}