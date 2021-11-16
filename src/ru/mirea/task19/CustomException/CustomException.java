package ru.mirea.task19.CustomException;

import java.util.Scanner;

public class CustomException {
    static boolean click = true;
    public static void main (String[] args)
    {
        UserWithCustomException user1 = new UserWithCustomException();
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите фамилию");
        while(click) {
            try {
                user1.setSurnameEx(scan.nextLine());
                click = false;
            } catch (EmptyException | UnknownLettersException ex) {
                System.out.println(ex.getMessage());
            }
        }
        click = true;

        System.out.println("Введите имя");
        while(click) {
            try {
                user1.setNameEx(scan.nextLine());
                click = false;
            }catch(EmptyException | UnknownLettersException ex)
            {
                System.out.println(ex.getMessage());
            }
        }
        click = true;

        System.out.println("Введите отчество");
        while(click) {
            try {
                user1.setPatronymicEx(scan.nextLine());
                click = false;
            }catch(EmptyException | UnknownLettersException ex)
            {
                System.out.println(ex.getMessage());
            }
        }
        click = true;

        System.out.println("Введите возраст");
        while (click) {
            try {
                user1.setAge(scan.nextInt());
                click = false;
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
                System.out.println("Повторите ввод");
            }
        }

        System.out.println(user1);
    }
}
