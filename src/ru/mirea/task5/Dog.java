package ru.mirea.task5;
import java.lang.*;
public abstract class Dog {
    protected int maxAge;
    protected int maxWeight;
    protected String name;

    public String getName()
    {
        return name;
    }

    public int getMaxAge()
    {
        return maxAge;
    }

    public int getMaxWeight()
    {
        return maxWeight;
    }

    public Dog(int maxAge, int maxWeight, String name)
    {
        this.maxAge = maxAge;
        this.maxWeight = maxWeight;
        this.name = name;
    }

    public abstract void displayInfo();
}

class Chihuahua extends Dog
{
    private String homeCountry;
    public Chihuahua(int maxAge, int maxWeight, String name, String homeCountry)
    {
        super(maxAge, maxWeight, name);
        this.homeCountry = homeCountry;
    }
    public void displayInfo()
    {
        System.out.println("Имя: " + super.getName() + " Максимальный возраст: " + super.getMaxAge() + " Максимальный вес: " + super.getMaxWeight() + " Родная страна: " + homeCountry);
    }
}

class Husky extends Dog
{
    private String homeCountry;
    public Husky(int maxAge, int maxWeight, String name, String homeCountry)
    {
        super(maxAge, maxWeight, name);
        this.homeCountry = homeCountry;
    }
    public void displayInfo()
    {
        System.out.println("Имя: " + super.getName() + " Максимальный возраст: " + super.getMaxAge() + " Максимальный вес: " + super.getMaxWeight() + " Родная страна: " + homeCountry);
    }
}

class ShibaInu extends Dog
{
    private String homeCountry;
    public ShibaInu(int maxAge, int maxWeight, String name, String homeCountry)
    {
        super(maxAge, maxWeight, name);
        this.homeCountry = homeCountry;
    }
    public void displayInfo()
    {
        System.out.println("Имя: " + super.getName() + " Максимальный возраст: " + super.getMaxAge() + " Максимальный вес: " + super.getMaxWeight() + " Родная страна: " + homeCountry);
    }
}