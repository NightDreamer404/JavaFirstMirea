package ru.mirea.task3;

public class TestBook {
    public static void main(String[] argc)
    {
        Book book1 = new Book("Tui Sutherland", "Dragonslayer", 2020);
        System.out.println(book1);

        book1.setAuthor("J. R. R. Tolkien");
        book1.setName("The Lord of the Rings");
        book1.setYear(1954);

        System.out.println(book1.getAuthor());
        System.out.println(book1.getName());
        System.out.println(book1.getYear());
    }
}
