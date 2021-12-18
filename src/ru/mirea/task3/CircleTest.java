package ru.mirea.task3;

public class CircleTest {
      public static void main (String[] args) {
        Circle circle = new Circle("blue", 25);
        System.out.println(circle);
        circle.setColor("cyan");
        circle.setRadius(12);
        System.out.println(circle);
    }
}
