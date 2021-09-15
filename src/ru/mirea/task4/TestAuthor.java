package ru.mirea.task4;
import java.lang.*;
public class TestAuthor {
    public static void main(String[] args) {
        Author human1 = new Author("Dmitry Glukhovsky", "DGlukhovsky@mail.ru", 'M');
        Author human2 = new Author("Jenny Smith", "JenSmith@hotmail.com", 'F');

        human2.setEmail("AJSmith@gmail.com");
        System.out.println(human1.getGender());
        System.out.println(human2);
    }
}
