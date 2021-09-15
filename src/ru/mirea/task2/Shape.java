package ru.mirea.task2;
import java.lang.*;
public class Shape {
    private String type;
    private int length;
    private int width;

    Shape(String type, int length, int width)
    {
        this.type = type;
        this.length = length;
        this.width = width;
    }

    public String toString()
    {
        return "Figure type: " + type + ", length: " + length + ", width: " + width;
    }
}
