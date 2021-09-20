package ru.mirea.task7;
import java.lang.*;
public abstract class Shape {
    protected String color;
    protected boolean filled;

    public Shape(){};
    public Shape(String color, boolean filled)
    {
        this.color = color;
        this.filled = filled;
    }

    public String getColor()
    {
        return color;
    }

    public void setColor(String color)
    {
        this.color = color;
    }

    public boolean isFilled()
    {
        return filled;
    }

    public void setFilled(boolean filled)
    {
        this.filled = filled;
    }

    public abstract double getArea();
    public abstract double getPerimeter();
    public abstract String toString();
}

class Circle extends Shape {
    protected double radius;

    public Circle() {};
    public Circle(double radius)
    {
        this.radius = radius;
    }
    public Circle(double radius, String color, boolean filled)
    {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius()
    {
        return this.radius;
    }

    public void setRadius(double radius)
    {
        this.radius = radius;
    }

    public double getArea()
    {
        return Math.PI * Math.pow(radius, 2);
    }

    public double getPerimeter()
    {
        return 2 * radius * Math.PI;
    }

    public String toString()
    {
        return "Окружность:: радиус: " + this.getRadius() + ", площадь: " + this.getArea() + ", периметр: " + this.getPerimeter();
    }
}

class Rectangle extends Shape {
    protected double width;
    protected double length;

    public Rectangle()
    {
        super("Red", true);
    };
    public Rectangle(double width, double length)
    {
        this.width = width;
        this.length = length;
    }
    public Rectangle(double width, double length, String color, boolean filled)
    {
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getArea() {
        return width * length;
    }

    public double getPerimeter()
    {
        return 2 * (width + length);
    }

    public String toString()
    {
        return "Прямоугольник:: длина: " + this.getLength() + ", ширина: " + this.getWidth() + ", площадь: " + this.getArea() + ", периметр: " + this.getPerimeter();
    }
}

class Square extends Rectangle
{
    public Square()
    {
        super();
    }
    public Square(double side)
    {
        this.width = side;
        this.length = side;
    }

    public Square(double side, String color, boolean filled)
    {
        super(side, side, color, filled);
    }

    public double getSide() {
        return width;
    }

    public void setSide(double side) {
        this.width = side;
        this.length = side;
    }

    public void setWidth(double side)
    {
        this.width = side;
    }

    public void setLength(double side)
    {
        this.length = side;
    }

    public String toString()
    {
        return "Квадрат:: длина стороны: " + this.getSide() + ", площадь: " + this.getArea() + ", периметр: " + this.getPerimeter();
    }
}