package ru.mirea.task2;
import java.lang.*;
public class Book {
    private String author;
    private String name;
    private int price;

    public Book(String author, String name, int price)
    {
        this.author = author;
        this.name = name;
        this.price = price;
    }

    public void setAuthor(String Author)
    {
        this.author = Author;
    }

    public void setName(String Name)
    {
        this.name = Name;
    }

    public void setPrice(int Price)
    {
        this.price = price;
    }

    public String getAuthor()
    {
        return author;
    }

    public String getName()
    {
        return name;
    }

    public int getPrice()
    {
        return price;
    }

    public String toString()
    {
        return "Author: " + this.author + " " + "Name: " + this.name + " " + "Price: " + this.price;
    }
}
