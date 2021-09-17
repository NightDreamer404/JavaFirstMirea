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
        int randModel = (int) (0 + Math.random()*7);
        switch (scan.nextInt())
        {
            case 1:
                System.out.println("Введите размер, материал и максимальную нагрузку (число кг)");
                Chair chair1 = new Chair(scan.next(), scan.next(), scan.nextInt(), "in shop");
                int randPrice1 = (int) (5000 + Math.random()*10000);
                System.out.println("По вашим параметрам было найдено кресло модели: " + model[randModel] + " по цене: " + randPrice1 + " рублей");
                System.out.println("Желаете приобрести?");
                System.out.println("1) Да; 2) Нет");
                switch (scan.nextInt())
                {
                    case 1:
                        chair1.setStatus("Sold");
                        System.out.println("Спасибо за покупку! Вы можете забрать заказ в ближайшее время");
                        break;
                    case 2:
                        System.out.println("Всего доброго");
                        break;
                }
                break;
            case 2:
                System.out.println("Введите размер, материал каркаса и тип обивки");
                Sofa sofa1 = new Sofa(scan.next(), scan.next(), scan.next(), "in shop");
                int randPrice2 = (int) (25000 + Math.random()*40000);
                System.out.println("По вашим параметрам было найден диван модели: " + model[randModel] + " по цене: " + randPrice2 + " рублей");
                System.out.println("Желаете приобрести?");
                System.out.println("1) Да; 2) Нет");
                switch (scan.nextInt())
                {
                    case 1:
                        sofa1.setStatus("Sold");
                        System.out.println("Спасибо за покупку! Вы можете забрать заказ в ближайшее время");
                        break;
                    case 2:
                        System.out.println("Всего доброго");
                        break;
                }
                break;
            case 3:
                System.out.println("Введите размер, материал и кол-во ящиков");
                Dresser dresser1 = new Dresser(scan.next(), scan.next(), scan.nextInt(), "in shop");
                int randPrice3 = (int) (2500 + Math.random()*10000);
                System.out.println("По вашим параметрам было найден комод модели: " + model[randModel] + " по цене: " + randPrice3 + " рублей");
                System.out.println("Желаете приобрести?");
                System.out.println("1) Да; 2) Нет");
                switch (scan.nextInt())
                {
                    case 1:
                        dresser1.setStatus("Sold");
                        System.out.println("Спасибо за покупку! Вы можете забрать заказ в ближайшее время");
                        break;
                    case 2:
                        System.out.println("Всего доброго!");
                        break;
                }
                break;
            default:
                System.out.println("Некорректный ввод");
                break;
        }
    }
}
