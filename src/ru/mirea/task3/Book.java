package ru.mirea.task3;
import java.lang.*;
public class Book {
    private String author;
    private String name;
    private int year;

    Book(String author, String name, int year)
    {
        this.author = author;
        this.name = name;
        this.year = year;
    }

    public String getAuthor()
    {
        return author;
    }

    public String getName()
    {
        return name;
    }

    public int getYear()
    {
        return year;
    }

    public void setAuthor(String author)
    {
        this.author = author;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public void setYear(int year)
    {
        this.year = year;
    }

    public String toString()
    {
        return "Author: " + this.author +", Name: "+ this.name + ", Year: " + this.year;
    }
}
