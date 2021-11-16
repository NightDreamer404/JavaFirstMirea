package ru.mirea.task18.AccountRefill;


import java.util.Scanner;

public class AccountRefill {
    public static void main(String[] args) {
        User user1 = new User();
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите фамилию");
        user1.setSurname(scan.nextLine());
        System.out.println("Введите имя");
        user1.setName(scan.nextLine());
        System.out.println("Введите отчество");
        user1.setPatronymic(scan.nextLine());
        System.out.println("Введите возраст");
        boolean repeat = true;
        while (repeat) {
            try {
                user1.setAge(scan.nextInt());
                repeat = false;
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
                System.out.println("Повторите ввод");
            }
        }
        user1.createAccount();
        System.out.println("Счёт номер " + user1.acc.getNumber() + " успешно создан");
        System.out.println("Добрый день, " + user1.getName() + "!");
        System.out.println("\n");

        repeat = true;
        while (repeat) {
            System.out.println("Если вы желаете пополнить счёт, то введите 1");
            System.out.println("Если вы желаете узнать количество средств на счету, то введите 2");
            System.out.println("Для завершения программы введите 0");
            int selector = scan.nextInt();
            switch (selector) {
                case 1: {
                    try {
                        System.out.println("Введите размер суммы для пополнения");
                        user1.addMoney(scan.nextDouble());
                        System.out.println("Счёт успешно пополнен");
                        System.out.println("\n");
                    } catch (IllegalArgumentException e) {
                        System.out.println(e.getMessage());
                        System.out.println("\n");
                    }
                    break;
                }
                case 2: {
                    System.out.println("В данный момент на счёту: " + user1.acc.getAmount() + " рублей");
                    System.out.println("\n");
                    break;
                }
                case 0: {
                    repeat = false;
                    break;
                }
                default: {
                    break;
                }
            }
        }
    }
}
