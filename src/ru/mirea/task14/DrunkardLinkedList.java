package ru.mirea.task14;
import java.lang.*;
import java.util.Scanner;
import java.util.LinkedList;

public class DrunkardLinkedList {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        LinkedList<Integer> first = new LinkedList<>();
        LinkedList<Integer> second = new LinkedList<>();
        for (int i = 0; i < 5; i++) {
            first.addLast(scan.nextInt());
        }
        for (int i = 0; i < 5; i++)
        {
            second.addLast(scan.nextInt());
        }
        int count = 0;

        while (first.size() > 0 && second.size() > 0) {
            int firstVal = first.pollFirst();
            int secondVal = second.pollFirst();
            switch (firstVal)
            {
                case 0:
                {
                    if (secondVal == 9)
                    {
                        first.addLast(firstVal);
                        first.addLast(secondVal);
                    }
                    else
                    {
                        second.addLast(firstVal);
                        second.addLast(secondVal);
                    }
                    break;
                }
                case 9:
                {
                    if (secondVal == 0)
                    {
                        second.addLast(firstVal);
                        second.addLast(secondVal);
                    }
                    else
                    {
                        first.addLast(firstVal);
                        first.addLast(secondVal);
                    }
                    break;
                }
                default:
                {
                    if (firstVal > secondVal) {
                        first.addLast(firstVal);
                        first.addLast(secondVal);
                    } else if (secondVal > firstVal) {
                        second.addLast(firstVal);
                        second.addLast(secondVal);
                    }
                    break;
                }
            }

            count++;
            if (count == 106) {
                System.out.println("botva");
                return;
            }
        }

        if (first.isEmpty()) {
            System.out.println("second " + count);
        } else {
            System.out.println("first " + count);
        }
    }
}
