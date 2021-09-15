package ru.mirea.task2;
import java.lang.*;
public class TestBook {
    public static void main(String[] args)
    {
        Book book1 = new Book("Jack London", "The White Fang", 550);
        Book book2 = new Book("Leo Tolstoy", "War and Peace", 950);
        Book book3 = new Book("J.R.R.Tolkien", "The Lord of the Rings", 1500);
        book2.setPrice(780);
        System.out.println("Book 2 price: " + book2.getPrice());
        System.out.println(book3);
    }
}
