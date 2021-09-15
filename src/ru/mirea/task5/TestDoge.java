package ru.mirea.task5;

import java.lang.*;
public class TestDoge {
    public static void main(String argc[])
    {
        Chihuahua doge1 = new Chihuahua(20, 3, "Jim", "Mexico");
        Husky doge2 = new Husky(15, 28, "Alan", "USA");
        ShibaInu doge3 = new ShibaInu(15, 13, "Twilight", "Japan");
        doge1.displayInfo();
        doge2.displayInfo();
        doge3.displayInfo();
    }
}
