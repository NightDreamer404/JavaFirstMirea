package ru.mirea.task21.MenuUpgrade;

import ru.mirea.test.UserMenu;
import ru.mirea.task17.WorkerMenu;
import ru.mirea.task21.UsReg.UsRegMenu;

import java.util.Scanner;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.TimeZone;

public class MainMenu {
    public void getInfo()
    {
        System.out.println("Выберите пользователя (введите цифру):");
        System.out.println("1) Клиент");
        System.out.println("2) Сотрудник");
        System.out.println("0) Завершение работы");
    }

    public void getAppWorkTime(Date date1, Date date2)
    {
        long seconds = (date2.getTime() - date1.getTime()) / 1000;
        int minutes = 0;
        int hours = 0;
        if (seconds > 59) {
            minutes += seconds / 60;
            hours += seconds / 3600;
            seconds = seconds % 60;
        }

        System.out.println("Время работы программы: " + hours + " час. " + minutes + " мин. " + seconds + " сек.");
        System.out.println("Хорошего дня!");
    }
    public int mainMenuSwitcher(int buf, UsRegMenu usRegMenu) {
        int stopCode = 0;
        boolean clicker = true;
        UserMenu menuUser = new UserMenu();
        WorkerMenu menuWork = new WorkerMenu();
        Scanner scan = new Scanner(System.in);
        while(clicker)
        {
        if(stopCode == 1)
        {
            break;
        }
        switch (buf) {
            case 1: {
                if (menuUser.getTimeHlp() == 1) {
                    Calendar usrClndr1 = new GregorianCalendar();
                    TimeZone tmzn1 = TimeZone.getDefault();
                    System.out.println("Текущий часовой пояс: " + "\"" + tmzn1.getID() + "\"" + " (" + tmzn1.getDisplayName() + ")");
                    System.out.println("Начало пользовательской сессии: " + usrClndr1.getTime());
                    System.out.print("\n");
                    int bufUserIndex = usRegMenu.regMenuOption();
                    menuUser.setClientIndex(bufUserIndex);
                }


                menuUser.showMenu();
                String buf2 = scan.next();
                menuUser.searchOption(buf2);
                if (menuUser.getTimeHlp() == 1) {
                    clicker = false;
                    Calendar usrClndr2 = new GregorianCalendar();
                    System.out.println("Окончание пользовательской сессии: " + usrClndr2.getTime());
                    System.out.print("\n");
                }
                break;
            }
            case 2: {
                if (menuWork.getTimeHlp() == 1) {
                    Calendar wrkClndr1 = new GregorianCalendar();
                    TimeZone tmzn2 = TimeZone.getDefault();
                    System.out.println("Текущий часовой пояс: " + "\"" + tmzn2.getID() + "\"" + " (" + tmzn2.getDisplayName() + ")");
                    System.out.println("Начало сессии сотрудника: " + wrkClndr1.getTime());
                    System.out.print("\n");
                }
                menuWork.showMenu();
                String buf3 = scan.next();
                menuWork.searchOption(buf3);
                if (menuWork.getTimeHlp() == 1) {
                    clicker = false;
                    Calendar wrkClndr2 = new GregorianCalendar();
                    System.out.println("Окончание сессии сотрудника: " + wrkClndr2.getTime());
                    System.out.print("\n");
                }
                break;
            }
            case 0: {
                clicker = false;
                stopCode = 1;
                break;
            }
            default: {
                break;
            }
            }
        }
        return stopCode;
    }
}
