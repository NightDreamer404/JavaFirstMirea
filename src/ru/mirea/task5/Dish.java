package ru.mirea.task5;
import java.lang.*;
public abstract class Dish {
    private String material;
    private String color;
    private int price;

    public String getMaterial()
    {
        return material;
    }
    public String getColor()
    {
        return color;
    }
    public int getPrice() { return price; }

    Dish(String material, String color, int price)
    {
        this.material = material;
        this.color = color;
        this.price = price;
    }

    public abstract void displayInfo();
}

class Cup extends Dish {
    private double volume;

    Cup(String material, String color, double volume, int price)
    {
        super(material, color, price);
        this.volume = volume;
    }

    public void displayInfo()
    {
        System.out.println("Кружка:: Материал: " + super.getMaterial() + ", объём (л): " + volume + ", цвет: " + super.getColor() + ", цена (руб): " + super.getPrice());
    }
}

class Pot extends Dish {
    private double volume;

    Pot(String material, String color, double volume, int price)
    {
        super(material, color, price);
        this.volume = volume;
    }

    public void displayInfo()
    {
        System.out.println("Кастрюля:: Материал: " + super.getMaterial() + ", объём (л): " + volume + ", цвет: " + super.getColor() + ", цена (руб): " + super.getPrice());
    }
}

class Pan extends Dish {
    private int diameter;

    Pan(String material, String color, int diameter, int price)
    {
        super(material, color, price);
        this.diameter = diameter;
    }

    public void displayInfo()
    {
        System.out.println("Сковородка:: Материал: " + super.getMaterial() + ", диаметр: " + diameter + ", цвет: " + super.getColor() + ", цена: " + super.getPrice());
    }
}