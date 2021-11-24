package ru.mirea.task24;

import java.util.Scanner;
import ru.mirea.task24.WorkerReg.WorkerRegulation;

public class Test {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Worker employee = new Worker();
        WorkerRegulation workReg = new WorkerRegulation();
        workReg.addWorker(employee);
        employee.generateUniqueKey();
        while (!employee.checkWorkerKey(scan.next()))
        {
            System.out.println("Одна или обе части ключа некорректны");
        }
        System.out.println("Ключ принят! Добрый день, " + employee.getName() + "!");
    }
}
