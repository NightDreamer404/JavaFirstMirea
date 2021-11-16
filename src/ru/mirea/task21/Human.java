package ru.mirea.task21;

import ru.mirea.task19.CustomException.EmptyException;
import ru.mirea.task19.CustomException.UnknownLettersException;

public abstract class Human {
    private String surname;
    private String name;
    private String patronymic;
    private int age;

    public void setSurname(String surname) throws EmptyException, UnknownLettersException {
        if (surname == "") throw new EmptyException("Код ошибки 103: пустой ввод");
        for (int i = 0; i < surname.length(); i++) {
            if (surname.charAt(i) < 192)
                throw new UnknownLettersException("Код ошибки 121: некорретные символы при вводе");
        }
        this.surname = surname;
    }
    public void setName(String name) throws EmptyException, UnknownLettersException {
        if (name == "") throw new EmptyException("Код ошибки 103: пустой ввод");
        for (int i = 0; i < name.length(); i++) {
            if (name.charAt(i) < 192)
                throw new UnknownLettersException("Код ошибки 121: некорретные символы при вводе");
        }
        this.name = name;
    }
    public void setPatronymic(String patronymic) throws EmptyException, UnknownLettersException {
        if (patronymic == "") throw new EmptyException("Код ошибки 103: пустой ввод");
        for (int i = 0; i < patronymic.length(); i++) {
            if (patronymic.charAt(i) < 192)
                throw new UnknownLettersException("Код ошибки 121: некорретные символы при вводе");
        }
        this.patronymic = patronymic;
    }
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

    public abstract String toString();
}