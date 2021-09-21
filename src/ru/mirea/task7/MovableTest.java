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

        MovablePoint point1 = new MovablePoint(0,0,1,1);
        System.out.println(point1);
        point1.moveLeft();
        System.out.println(point1);
        point1.moveUp();
        System.out.println(point1);
    }
}
