package ru.mirea.task12;
import java.lang.*;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Scanner;
import static java.lang.System.exit;

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


public class MergeSort {

    private ArrayList<StudentsData> strList;
    private int sortingParameter;
    // Constructor
    public MergeSort(ArrayList<StudentsData> input, int sortingParameter) {
        strList = input;
        this.sortingParameter = sortingParameter;
    }

    public void sort() {
        strList = mergeSort(strList);
    }

    public ArrayList<StudentsData> mergeSort(ArrayList<StudentsData> whole) {
        ArrayList<StudentsData> left = new ArrayList<>();
        ArrayList<StudentsData> right = new ArrayList<>();
        int center;

        if (whole.size() == 1) {
            return whole;
        } else {
            center = whole.size()/2;
            // copy the left half of whole into the left.
            for (int i=0; i<center; i++) {
                left.add(whole.get(i));
            }

            //copy the right half of whole into the new arraylist.
            for (int i=center; i<whole.size(); i++) {
                right.add(whole.get(i));
            }

            // Sort the left and right halves of the arraylist.
            left  = mergeSort(left);
            right = mergeSort(right);

            // Merge the results back together.
            merge(left, right, whole, sortingParameter);

        }
        return whole;
    }

    private void merge(ArrayList<StudentsData> left, ArrayList<StudentsData> right, ArrayList<StudentsData> whole, int sortingParameter) {
        int leftIndex = 0;
        int rightIndex = 0;
        int wholeIndex = 0;

        switch(sortingParameter)
        {
            case 1:
            {
                // As long as neither the left nor the right ArrayList has
                // been used up, keep taking the smaller of left.get(leftIndex)
                // or right.get(rightIndex) and adding it at both.get(bothIndex).
                while (leftIndex < left.size() && rightIndex < right.size()) {
                    if ( left.get(leftIndex).getID() < (right.get(rightIndex).getID())) {
                        whole.set(wholeIndex, left.get(leftIndex));
                        leftIndex++;
                    } else {
                        whole.set(wholeIndex, right.get(rightIndex));
                        rightIndex++;
                    }
                    wholeIndex++;
                }
                break;
            }

            case 2:
            {
                while (leftIndex < left.size() && rightIndex < right.size()) {
                    if ( left.get(leftIndex).getGPA() < (right.get(rightIndex).getGPA())) {
                        whole.set(wholeIndex, left.get(leftIndex));
                        leftIndex++;
                    } else {
                        whole.set(wholeIndex, right.get(rightIndex));
                        rightIndex++;
                    }
                    wholeIndex++;
                }
                break;
            }

            case 3:
            {
                while (leftIndex < left.size() && rightIndex < right.size()) {
                    if ( (left.get(leftIndex).getName().compareTo(right.get(rightIndex).getName())) < 0) {
                        whole.set(wholeIndex, left.get(leftIndex));
                        leftIndex++;
                    } else {
                        whole.set(wholeIndex, right.get(rightIndex));
                        rightIndex++;
                    }
                    wholeIndex++;
                }
                break;
            }

            default:
            {
                System.out.println("Ошибка ввода, аварийное завершение программы");
                exit(1);
            }
        }

        ArrayList<StudentsData> rest;
        int restIndex;
        if (leftIndex >= left.size()) {
            // The left ArrayList has been use up...
            rest = right;
            restIndex = rightIndex;
        } else {
            // The right ArrayList has been used up...
            rest = left;
            restIndex = leftIndex;
        }

        // Copy the rest of whichever ArrayList (left or right) was not used up.
        for (int i=restIndex; i<rest.size(); i++) {
            whole.set(wholeIndex, rest.get(i));
            wholeIndex++;
        }
    }


    public void show() {
        System.out.println("Sorted:");
        for (int i=0; i< strList.size();i++) {
            System.out.println(strList.get(i).toString());
        }
    }


    public static void main (String[] args)
    {
        ArrayList<StudentsData> list1 = new ArrayList<>();
        ArrayList<StudentsData> list2 = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        ArrayList<String> names = new ArrayList<>();
        names.add("Алексей"); names.add("Владимир"); names.add("Дмитрий"); names.add("Александр"); names.add("Никита");
        names.add("Олег"); names.add("Николай"); names.add("Вячеслав"); names.add("Даниил"); names.add("Кирилл");

        for (int i = 0; i < 10; i++)
        {
            int nameNum = (int)(0 + Math.random()*(names.size()-1));
            double GPANum = (2 + Math.random()*3);
            GPANum = (double)Math.round(GPANum * 100d) / 100d;
            int IDNum = (int)(1+Math.random()*5000);
            StudentsData student = new StudentsData(names.get(nameNum), GPANum, IDNum);
            names.remove(nameNum);
            if (i % 2 == 0)
            {
                list1.add(student);
            }
            else
            {
                list2.add(student);
            }
        }


        for(int i = 0; i < 5; i++)
        {
            System.out.println(list1.get(i).toString());
        }
        System.out.println("\n");

        for(int i = 0; i < 5; i++)
        {
            System.out.println(list2.get(i).toString());
        }

        list1.addAll(list2);
        System.out.println("Выберете параметр сортировки: 1 -- ID, 2 -- Средний балл, 3 -- Имя");
        MergeSort test = new MergeSort(list1,scan.nextInt());
        test.sort();
        test.show();

    }
}
