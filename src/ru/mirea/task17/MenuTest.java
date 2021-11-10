package ru.mirea.task17;
import java.util.Scanner;
import java.lang.*;

import static java.lang.System.exit;

public class MenuTest {
    public static void main (String[] args) {
        UserMenu menuUser = new UserMenu();
        WorkerMenu menuWork = new WorkerMenu();

        while(true) {
            System.out.println("Выберите пользвателя (введите цифру):");
            System.out.println("1) Клиент");
            System.out.println("2) Сотрудник");
            System.out.println("0) Завершение работы");
            Scanner scan = new Scanner(System.in);
            int buf1 = scan.nextInt();
            while (true) {
                switch (buf1) {
                    case 1: {
                        menuUser.showMenu();
                        String buf2 = scan.next();
                        menuUser.searchOption(buf2);
                        break;
                    }
                    case 2: {
                        menuWork.showMenu();
                        String buf3 = scan.next();
                        menuWork.searchOption(buf3);
                        break;
                    }
                    case 0: {
                        System.out.println("Хорошего дня!");
                        exit(0);
                    }
                    default: {
                        break;
                    }
                }
                if (menuUser.getReturnOption() == 1 || menuWork.getReturnOption() ==1) {
                    menuUser.setReturnOption(0);
                    menuWork.setReturnOption(0);
                    break;
                }
            }
        }
    }
}
