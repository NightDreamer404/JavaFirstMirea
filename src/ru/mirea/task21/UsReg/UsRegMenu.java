package ru.mirea.task21.UsReg;
import ru.mirea.task21.UsReg.UserRegulation;

import java.util.Scanner;
public class UsRegMenu extends UserRegulation {
    public int regMenuOption() {
        boolean off = false;
        int bufIndex = 0;
        while (!off) {
            System.out.println("Введите букву интересующей опции");
            showInfo();
            Scanner read = new Scanner(System.in);
            switch (read.next()) {
                case "A": {
                    addUser();
                    break;
                }
                case "B": {
                    if(userList.isEmpty())
                    {
                        System.out.println("Список пользователей пуст, добавьте хотя бы одного пользователя");
                        System.out.print("\n");
                    }
                    else {
                        boolean stop = false;
                        while(!stop) {
                            try {
                                System.out.println("Введите номер пользователя");
                                bufIndex = searchUser(read.nextInt());
                                stop = true;
                            } catch (IndexOutOfBoundsException e)
                            {
                                System.out.println(e.getMessage());
                                System.out.println("Повторите ввод");
                            }
                        }
                        off = true;
                    }
                    break;
                }
                case "C": {
                    if(userList.isEmpty())
                    {
                        System.out.println("Список пользователей пуст, добавьте хотя бы одного пользователя");
                        System.out.print("\n");
                    }
                    else {
                        System.out.println("Введите номер пользователя");
                        removeUser(read.nextInt());
                        break;
                    }
                }
                default: {
                    break;
                }
            }
        }
        return bufIndex;
    }
}
