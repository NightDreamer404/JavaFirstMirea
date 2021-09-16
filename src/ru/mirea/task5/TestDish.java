package ru.mirea.task5;
import java.lang.*;
public class TestDish {
    public static void main(String[] args)
    {
        Cup cup1 = new Cup("ceramic", "pink", 0.33, 550);
        Pot pot1 = new Pot("stainless steel", "metallic", 2.5, 5000);
        Pan pan1 = new Pan("aluminum", "black", 25, 4200);

        cup1.displayInfo();
        pot1.displayInfo();
        pan1.displayInfo();
    }
}
