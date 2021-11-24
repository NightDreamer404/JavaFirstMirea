package ru.mirea.task24;
import java.lang.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import ru.mirea.task21.Human;

public class Worker extends Human {
    private String regCode;
    private String idWorker;
    protected String logKey;

    public void generateUniqueKey()
    {
        int buf = (int) (100 + Math.random()*999);
        regCode = Integer.toString(buf);
        long buf1 = (long) (10000 + Math.random()*99999);
        idWorker = Long.toString(buf1);
        logKey = regCode + idWorker;
        System.out.println("Приветствуем! Данное сообщение будет показано только один раз. Используйте следующий ключ для входа как сотрудник");
        System.out.println(logKey);
    }
    @Override
    public String toString()
    {
        return getSurname() + " " + getName() + " " + getPatronymic() + " " + getAge() + " лет";
    }

    public boolean checkWorkerKey(String key)
    {
        boolean approvedRegCode = false;
        Pattern pattern1 = Pattern.compile("\\b"+regCode);
        Matcher matcher1 = pattern1.matcher(key);
        if(matcher1.find())
        {
            approvedRegCode = true;
            System.out.println("Регистрационный код корректен");
        } else {
            System.out.println("Регистрационный код некорректен");
        }

        boolean approvedidWorker = false;
        Pattern pattern2 = Pattern.compile(idWorker);
        Matcher matcher2 = pattern2.matcher(key);
        if(matcher2.find())
        {
            approvedidWorker = true;
            System.out.println("ID сотрудника корректен");
        }
        else
        {
            System.out.println("ID сотрудника некорректен");
        }
        return approvedidWorker&&approvedRegCode;
    }
}
