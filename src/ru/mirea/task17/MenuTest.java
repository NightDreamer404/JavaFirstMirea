package ru.mirea.task17;
import java.util.Scanner;
import java.lang.*;
public class MenuTest {
    public static void main (String[] args) {
        System.out.println("Выберите пользвателя (введите цифру):");
        System.out.println("1) Клиент");
        System.out.println("2) Сотрудник");
        Scanner scan = new Scanner(System.in);
        int buf1 = scan.nextInt();

        while(true) {
            switch (buf1) {
                case 1: {
                    UserMenu menuUser = new UserMenu();
                    menuUser.showMenu();
                    String buf2 = scan.next();
                    menuUser.searchOption(buf2);
                    break;
                }
                case 2: {
                    WorkerMenu menuWork = new WorkerMenu();
                    menuWork.showMenu();
                    String buf3 = scan.next();
                    menuWork.searchOption(buf3);
                    break;
                }
                default: {
                    break;
                }
            }
        }
    }
}
