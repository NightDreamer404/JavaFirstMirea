package ru.mirea.task20;

import ru.mirea.task17.UserMenu;
import ru.mirea.task17.WorkerMenu;

import java.util.*;

import static java.lang.System.exit;

public class SessionTime {
    static boolean clicker;
    public static void main (String[] args) {
        Date date1 = new Date();
        UserMenu menuUser1 = new UserMenu();
        WorkerMenu menuWork1 = new WorkerMenu();
        while(true) {
            clicker = true;
            System.out.println("Выберите пользвателя (введите цифру):");
            System.out.println("1) Клиент");
            System.out.println("2) Сотрудник");
            System.out.println("0) Завершение работы");
            Scanner scan = new Scanner(System.in);
            int buf1 = scan.nextInt();
            while (clicker) {
                switch (buf1) {
                    case 1: {
                        if(menuUser1.getTimeHlp() == 1) {
                            Calendar usrClndr1 = new GregorianCalendar();
                            TimeZone tmzn1 = TimeZone.getDefault();
                            System.out.println("Текущий часовой пояс: " + "\"" + tmzn1.getID() + "\"" + " (" + tmzn1.getDisplayName() + ")");
                            System.out.println("Начало пользовательской сессии: " + usrClndr1.getTime());
                            System.out.print("\n");
                        }
                        menuUser1.showMenu();
                        String buf2 = scan.next();
                        menuUser1.searchOption(buf2);
                        if(menuUser1.getTimeHlp() == 1) {
                            clicker = false;
                            Calendar usrClndr2 = new GregorianCalendar();
                            System.out.println("Окончание пользовательской сессии: " + usrClndr2.getTime());
                            System.out.print("\n");
                        }
                        break;
                    }
                    case 2: {
                        if(menuWork1.getTimeHlp() == 1)
                        {
                            Calendar wrkClndr1 = new GregorianCalendar();
                            TimeZone tmzn2 = TimeZone.getDefault();
                            System.out.println("Текущий часовой пояс: " + "\"" + tmzn2.getID() + "\"" + " (" + tmzn2.getDisplayName() + ")");
                            System.out.println("Начало сессии сотрудника: " + wrkClndr1.getTime());
                            System.out.print("\n");
                        }
                        menuWork1.showMenu();
                        String buf3 = scan.next();
                        menuWork1.searchOption(buf3);
                        if(menuWork1.getTimeHlp() == 1)
                        {
                            Calendar wrkClndr2 = new GregorianCalendar();
                            System.out.println("Окончание сессии сотрудника: " + wrkClndr2.getTime());
                            System.out.print("\n");
                        }
                        break;
                    }
                    case 0: {
                        Date date2 = new Date();
                        long seconds = (date2.getTime() - date1.getTime())/1000;
                        int minutes = 0;
                        int hours = 0;
                        if(seconds > 59)
                        {
                            minutes +=seconds/60;
                            hours += seconds/3600;
                            seconds = seconds % 60;
                        }

                        System.out.println("Время работы программы: " + hours + " час. " + minutes + " мин. " + seconds + " сек.");
                        System.out.println("Хорошего дня!");
                        exit(0);
                    }
                    default: {
                        break;
                    }
                }
            }
        }
    }
}
