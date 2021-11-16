package ru.mirea.task21.MenuUpgrade;

import ru.mirea.task21.UsReg.UsRegMenu;

import java.util.Date;
import java.util.Scanner;

public class TestMenu {
    public static void main(String args[])
    {
        Date date1 = new Date();
        MainMenu menu = new MainMenu();
        UsRegMenu usRegMenu= new UsRegMenu();
        while(true)
        {
            menu.getInfo();
            Scanner scan = new Scanner(System.in);
            int buf = scan.nextInt();
            int stop = menu.mainMenuSwitcher(buf, usRegMenu);
            if (stop == 1)
                break;
        }
        Date date2 = new Date();
        menu.getAppWorkTime(date1, date2);
    }
}
