package ru.mirea.task12;
import java.lang.*;
import java.util.Arrays;

public interface Comparator {
    double[] arrSort(double[] arr, int left, int right);
}

class Students
{
    private double GPA;
    public Students(double GPA) {
        this.GPA = GPA;
    }

    public double getGPA()
    {
        return GPA;
    }
}

class SortingStudentsByGPA implements Comparator {

    public SortingStudentsByGPA() {

    }

    public double[] arrSort(double[] arr, int left, int right)
    {
        int i = left;
        int j = right;
        double pivot = arr[(i + j) / 2];

        while (i <= j)
        {
            while (arr[i] > pivot)
                i++;
            while (arr[j] < pivot)
                j--;
            if (i <= j)
            {
                double temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            }
        }
        if (j > left)
            arrSort(arr, left, j);
        if (i < right)
            arrSort(arr, i, right);

        return arr;
    }

    public static void main(String[] main)
    {
        Students[] stud = new Students[10];
        double[] GPA = new double[stud.length];
        for (int i = 0; i < stud.length; i++)
        {
            double ranNum = (2 + Math.random()*4);
            ranNum = (double)Math.round(ranNum * 100d) / 100d;
            stud[i] = new Students(ranNum);
        }

        for(int i = 0; i < stud.length; i++) {
            GPA[i] = stud[i].getGPA();
        }

        SortingStudentsByGPA list1 = new SortingStudentsByGPA();
        System.out.println(Arrays.toString(GPA));
        System.out.println(Arrays.toString(list1.arrSort(GPA, 0, GPA.length-1)));
    }
}
