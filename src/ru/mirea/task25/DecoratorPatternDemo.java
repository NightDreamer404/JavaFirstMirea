package ru.mirea.task25;
import java.lang.*;

public class DecoratorPatternDemo {
    public static void main(String[] args) {
        Shape circle = new Circle();
        Shape redCircle = new RedShapeDecorator(circle);
        redCircle.draw();

        System.out.println();

        Shape rectangle = new Rectangle();
        Shape redRectangle = new RedShapeDecorator(rectangle);
        redRectangle.draw();
    }
}
