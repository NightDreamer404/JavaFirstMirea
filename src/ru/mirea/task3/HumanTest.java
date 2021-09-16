package ru.mirea.task3;
import java.lang.*;
public class HumanTest {
    public static void main(String[] args)
    {
        Human human1 = new Human(34, 70, 180);
        Hand hand1 = new Hand("tanned", 5);
        Head head1 = new Head("brown", "curvy");
        Leg leg1 = new Leg("44", "tanned");

        System.out.println(human1);
        System.out.println(hand1);
        System.out.println(head1);
        System.out.println(leg1);
    }
}
