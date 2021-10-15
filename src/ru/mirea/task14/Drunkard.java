package ru.mirea.task14;
import java.lang.*;
import java.util.*;
public class Drunkard {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Queue<Integer> first = new ArrayDeque<>();
        Queue<Integer> second = new ArrayDeque<>();
        for (int i = 0; i < 5; i++) {
            first.add(scan.nextInt());
        }
        for (int i = 0; i < 5; i++)
        {
            second.add(scan.nextInt());
        }
        int count = 0;

        while (first.size() > 0 && second.size() > 0) {
            int firstVal = first.poll();
            int secondVal = second.poll();
            switch (firstVal)
            {
                case 0:
                {
                    if (secondVal == 9)
                    {
                        first.add(firstVal);
                        first.add(secondVal);
                    }
                    else
                    {
                        second.add(firstVal);
                        second.add(secondVal);
                    }
                    break;
                }
                case 9:
                {
                    if (secondVal == 0)
                    {
                        second.add(firstVal);
                        second.add(secondVal);
                    }
                    else
                    {
                        first.add(firstVal);
                        first.add(secondVal);
                    }
                    break;
                }
                default:
                {
                    if (firstVal > secondVal) {
                        first.add(firstVal);
                        first.add(secondVal);
                    } else if (secondVal > firstVal) {
                        second.add(firstVal);
                        second.add(secondVal);
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
        } else
            System.out.println("first " + count);
    }
}
