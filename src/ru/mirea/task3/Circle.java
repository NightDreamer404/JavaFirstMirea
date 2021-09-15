package ru.mirea.task3;
import java.lang.*;
public class Circle {
    private String color;
    private int radius;

    Circle(String color, int radius)
    {
        this.color = color;
        this.radius = radius;
    }

    public String getColor()
    {
        return color;
    }

    public int getRadius()
    {
        return radius;
    }

    public void setColor(String color)
    {
        this.color = color;
    }

    public void setRadius(int radius)
    {
        this.radius = radius;
    }

    public double getArea()
    {
        return radius * 3.14;
    }

    public String toString()
    {
        return "Color: " + color + ", radius: " + radius + ", area: " + getArea();
    }
}
