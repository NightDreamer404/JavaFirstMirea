package ru.mirea.task5;
import java.lang.*;
import java.util.Scanner;
public abstract class Furniture {
    private String size;
    private String material;
    private String status;

    Furniture(String size, String material, String status)
    {
        this.size = size;
        this.material = material;
        this.status = status;
    }
    public String getSize() { return size;}
    public String getMaterial() { return material;}
    public void setStatus(String status) { this.status = status;}
    public String getStatus() { return status;}
    public abstract void displayInfo();
}

class Chair extends Furniture
{
    private int peakLoad;

    Chair(String size, String material, int peakLoad, String status)
    {
        super(size, material, status);
        this.peakLoad = peakLoad;
    }

    public void displayInfo()
    {
        System.out.println("Кресло:: Размер: " + super.getSize() + ", материал: " + super.getMaterial() + ", макс. нагрузка: " + peakLoad);
    }
}

class Sofa extends Furniture
{
    private String upholstery;      //обивка

    Sofa(String size, String material, String upholstery, String status)
    {
        super(size, material, status);
        this.upholstery = upholstery;
    }
    public void displayInfo()
    {
        System.out.println("Диван:: Размер: " + super.getSize() + ", материал каркаса: " + super.getMaterial() + ", обивка: " + upholstery);
    }
}

class Dresser extends Furniture     //комод
{
    private int drawersAmount;      //кол-во ящичков

    Dresser(String size, String material, int drawersAmount, String status)
    {
        super(size, material, status);
        this.drawersAmount = drawersAmount;
    }
    public void displayInfo()
    {
        System.out.println("Комод:: Размер: " + super.getSize() + ", материал: " + super.getMaterial() + ", кол-во ящиков: " + drawersAmount);
    }
}
