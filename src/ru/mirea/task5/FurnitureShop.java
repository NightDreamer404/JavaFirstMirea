package ru.mirea.task5;
import java.lang.*;
import java.util.Scanner;
public class FurnitureShop {
    public static void main(String[] args)
    {
        String[] model = {"Соренто", "Мартин", "Прованс", "Модекс", "Бланка", "Шерлок", "Александрия", "Милан"};
        System.out.println("Добро пожаловать в магазин мебели! Введите цифру интересующего вас товара.");
        System.out.println("1) Кресло; 2) Диван; 3) Комод");
        Scanner scan = new Scanner(System.in);
        switch (scan.nextInt())
        {
            case 1:
                System.out.println("Введите размер, материал мебели и максимальную нагрузку (число кг)");
                String par1 = scan.next();
                String par2 = scan.next();
                int par3 = scan.nextInt();
                Chair chair1 = new Chair(par1, par2, par3, "in shop");
                int randModel = 0 + (int) (Math.random() + 7);
                int randPrice = 5000 + (int) (Math.random() + 10000);
                chair1.displayInfo();
                System.out.println("По вашим параметрам было найдено кресло модели: " + model[randModel] + " по цене: " + randPrice + " рублей");
                System.out.println("Желаете приобрести?");
                System.out.println("1) Да; 2) Нет");
                switch (scan.nextInt())
                {
                    case 1:
                        chair1.setStatus("Sold");
                        System.out.println("Спасибо за покупку! Вы можете забрать заказ в ближайшее время");
                        break;
                }
                break;

        }
    }
}
