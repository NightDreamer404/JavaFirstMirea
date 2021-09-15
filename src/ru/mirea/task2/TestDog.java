package ru.mirea.task2;
import java.lang.*;

public class TestDog {
    public static void main(String[] args)
    {
        Dog doge1 = new Dog("Anubis", 2);
        Dog doge2 = new Dog("Sekhmet", 7);
        Dog doge3 = new Dog("Sobek", 2);
        doge3.setAge(9);
        System.out.println(doge1);
        doge1.intoHumanAge();
        doge2.intoHumanAge();
        doge3.intoHumanAge();
    }
}
