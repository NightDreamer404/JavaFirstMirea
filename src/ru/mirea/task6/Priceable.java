package ru.mirea.task6;
import java.lang.*;
public interface Priceable {
    void getPrice();
}

class Laptops implements Priceable
{
    private String manufacturer;
    private int price;
    private String type;

    Laptops(String manufacturer, int price, String type)
    {
        this.manufacturer = manufacturer;
        this.price = price;
        this.type = type;
    }

    public void getPrice()
    {
        System.out.println("Laptop's price: " + price + " rubles");
    }
}

class Smartphones implements Priceable
{
    private String manufacturer;
    private int price;
    private double weight;

    Smartphones(String manufacturer, int price, double weight)
    {
        this.manufacturer = manufacturer;
        this.price = price;
        this.weight = weight;
    }

    public void getPrice()
    {
        System.out.println("Smartphone's price: " + price + " rubles");
    }
}

class Cars implements Priceable
{
    private String manufacturer;
    private double price;
    private int maxSpeed;

    Cars(String manufacturer, double price, int maxSpeed)
    {
        this.manufacturer = manufacturer;
        this.price = price;
        this.maxSpeed = maxSpeed;
    }

    public void getPrice()
    {
        System.out.println("Car's price: " + price + " million rubles");
    }
}