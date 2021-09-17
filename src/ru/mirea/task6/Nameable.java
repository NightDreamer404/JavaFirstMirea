package ru.mirea.task6;
import java.lang.*;
public interface Nameable {
    void getName();
}

class Planets implements Nameable{
    private int radius;
    private double density;     // (г/см^3)
    private String name;

    Planets(String name, int radius, double density)
    {
        this.radius = radius;
        this.density = density;
        this.name = name;
    }

    public void getName()
    {
        System.out.println("Planet's name: " + name);
    }
}

class Autos implements Nameable
{
    private String manufacturer;
    private int maxSpeed;
    private int maxSeats;

    Autos(String manufacturer, int maxSpeed, int maxSeats)
    {
        this.manufacturer = manufacturer;
        this.maxSpeed = maxSpeed;
        this.maxSeats = maxSeats;
    }

    public void getName()
    {
        System.out.println("Car's name: " + manufacturer);
    }
}

class Dogs implements Nameable
{
    private char gender;
    private String breed;
    private String name;

    Dogs(String name, String breed, char gender)
    {
        this.name = name;
        this.breed = breed;
        this.gender = gender;
    }

    public void getName()
    {
        System.out.println("Dog's nickname: " + name);
    }
}