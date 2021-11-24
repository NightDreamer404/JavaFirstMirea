package ru.mirea.task24.WorkerReg;

import ru.mirea.task19.CustomException.EmptyException;
import ru.mirea.task19.CustomException.UnknownLettersException;
import ru.mirea.task24.Worker;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class WorkerRegulation extends Worker {
    public void addWorker(Worker worker)
    {
        boolean click = true;
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите фамилию");
        while(click) {
            try {
                worker.setSurname(scan.nextLine());
                click = false;
            } catch (EmptyException | UnknownLettersException ex) {
                System.out.println(ex.getMessage());
            }
        }
        click = true;

        System.out.println("Введите имя");
        while(click) {
            try {
                worker.setName(scan.nextLine());
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
                worker.setPatronymic(scan.nextLine());
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
                worker.setAge(scan.nextInt());
                click = false;
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
                System.out.println("Повторите ввод");
            }
        }
    }
}
