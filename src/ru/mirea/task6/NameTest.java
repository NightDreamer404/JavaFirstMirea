package ru.mirea.task6;
import java.lang.*;
public class NameTest {
    public static void main(String[] args)
    {
        Nameable planet1 = new Planets("Jupiter", 69991, 1.33);
        Nameable auto1 = new Autos("Audi", 220, 5);
        Nameable dog1 = new Dogs("Jenny", "corgi", 'f' );

        planet1.getName();
        auto1.getName();
        dog1.getName();
    }
}
