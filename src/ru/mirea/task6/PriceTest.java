package ru.mirea.task6;
import java.lang.*;
public class PriceTest {
    public static void main(String[] argc)
    {
        Priceable laptop1 = new Laptops("MSI", 87000, "Gaming");
        Priceable smartphone2 = new Smartphones("Samsung", 99990, 300);
        Priceable car3 = new Cars("Mercedes-Benz", 8.9, 280);

        laptop1.getPrice();
        smartphone2.getPrice();
        car3.getPrice();
    }
}
