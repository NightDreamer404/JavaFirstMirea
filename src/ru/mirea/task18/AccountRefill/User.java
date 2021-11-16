package ru.mirea.task18.AccountRefill;

import java.lang.*;
import java.util.Scanner;

public class User
{
    private String surname;
    private String name;
    private String patronymic;
    private int age;
    protected Account acc;

    public void setSurname(String surname) { this.surname = surname; }
    public void setName(String name) { this.name = name; }
    public void setPatronymic(String patronymic) { this.patronymic = patronymic; }
    public void setAge(int age) {
        if (age < 0) {
            throw new IllegalArgumentException("Код ошибки 99: возраст не может быть отрицательным");
        }
        else {
            this.age = age;
        }
    }

    public String getSurname() { return surname; }
    public String getName() { return name; }
    public String getPatronymic() { return patronymic; }
    public int getAge() { return age; }

    public String toString()
    {
        return surname + " " + name + " " + patronymic + " " + age + " лет";
    }
    public void createAccount()
    {
        acc = new Account();
    }
    public void addMoney(double amount)
    {
        if (amount <= 0)
        {
            throw new IllegalArgumentException("Код ошибки 254: введённая сумма не может быть отрицательной или равна 0");
        }
        else
        {
            acc.setAmount(amount);
        }
    }
}

