package ru.mirea.task14;
import java.lang.*;
import java.util.Scanner;
import java.util.Stack;
public class DrunkardStack {
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        Stack<Integer> fpStack = new Stack<>();
        Stack<Integer> spStack = new Stack<>();
        for (int i = 0; i < 5; i++) {
            fpStack.push(scan.nextInt());
        }
        for (int i = 0; i < 5; i++)
        {
            spStack.push(scan.nextInt());
        }
        int count = 0;

        while (!(fpStack.isEmpty()) && !(spStack.isEmpty()))
        {
            int firstVal = fpStack.get(0);
            int secondVal = spStack.get(0);
            fpStack.removeElementAt(0);
            spStack.removeElementAt(0);
            switch (firstVal)
            {
                case 0:
                {
                    if (secondVal == 9)
                    {
                        fpStack.push(firstVal);
                        fpStack.push(secondVal);
                    }
                    else
                    {
                        spStack.push(firstVal);
                        spStack.add(secondVal);
                    }
                    break;
                }
                case 9:
                {
                    if (secondVal == 0)
                    {
                        spStack.push(firstVal);
                        spStack.push(secondVal);
                    }
                    else
                    {
                        fpStack.push(firstVal);
                        fpStack.push(secondVal);
                    }
                    break;
                }
                default:
                {
                    if (firstVal > secondVal) {
                        fpStack.push(firstVal);
                        fpStack.push(secondVal);
                    } else if (secondVal > firstVal) {
                        spStack.push(firstVal);
                        spStack.push(secondVal);
                    }
                    break;
                }
            }

            count++;
            if (count == 106) {
                System.out.println("botva");
                break;
            }
        }

        if (fpStack.isEmpty()) {
            System.out.println("second " + count);
        } else {
            System.out.println("first " + count);
        }
    }
}
