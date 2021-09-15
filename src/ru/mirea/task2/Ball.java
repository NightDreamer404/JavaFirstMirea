package ru.mirea.task2;
import java.lang.*;

public class Ball {
    private String color;
    private String material;
    private int price;
    private int radius;

    public Ball(String color, String material, int price, int radius)
    {
        this.color = color;
        this.material = material;
        this.price = price;
        this.radius = radius;
    }

    public Ball(String color, int price)
    {
        this.color = color;
        this.price = price;
        this.material = "rubber";
        this.radius = 20;
    }

    public Ball()
    {
        this.color = "transparent";
        this.price = 1000;
        this.material = "glass";
        this.radius = 5;
    }

    public String getcolor()
    {
        return color;
    }

    public String getmaterial()
    {
        return material;
    }

    public void setRadius(int rad)
    {
        this.radius = rad;
    }

    public String toString()
    {
        return "Color: " + this.color + " " + "Material: " + this.material + " " + "Price: " + this.price + " " + "Radius: " +this.radius;
    }

    public void getBallVolume()
    {
        System.out.println("Volume of the ball is " + radius*radius*radius*(4/3)*3.14);
    }
}
