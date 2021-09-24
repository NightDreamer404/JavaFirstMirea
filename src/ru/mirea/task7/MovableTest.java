package ru.mirea.task7;
import java.lang.*;
public class MovableTest {
    public static void main(String[] args)
    {
        MovableCircle circle1 = new MovableCircle(5, 4, 2, 3, 2);
        System.out.println(circle1);
        circle1.moveDown();
        System.out.println(circle1);
        circle1.moveRight();
        System.out.println(circle1);
        System.out.println('\n');

        MovableRectangle rectangle1 = new MovableRectangle(1, 4, 0,0,4,2);
        System.out.println(rectangle1);
        rectangle1.moveLeft();
        System.out.println(rectangle1);
        rectangle1.moveUp();
        System.out.println(rectangle1);
    }
}
