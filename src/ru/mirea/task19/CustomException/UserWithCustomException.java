package ru.mirea.task19.CustomException;

import ru.mirea.task18.AccountRefill.User;

public class UserWithCustomException extends User {
    public void setSurnameEx(String surname) throws EmptyException, UnknownLettersException {
        if (surname == "") throw new EmptyException("Код ошибки 103: пустой ввод");
        for (int i = 0; i < surname.length(); i++) {
            if (surname.charAt(i) < 192)
                throw new UnknownLettersException("Код ошибки 121: некорретные символы при вводе");
        }
        setSurname(surname);
    }

    public void setNameEx(String name) throws EmptyException, UnknownLettersException {
        if (name == "") throw new EmptyException("Код ошибки 103: пустой ввод");
        for (int i = 0; i < name.length(); i++) {
            if (name.charAt(i) < 192)
                throw new UnknownLettersException("Код ошибки 121: некорретные символы при вводе");
        }
        setName(name);
    }

    public void setPatronymicEx(String patronymic) throws EmptyException, UnknownLettersException {
        if (patronymic == "") throw new EmptyException("Код ошибки 103: пустой ввод");
        for (int i = 0; i < patronymic.length(); i++) {
            if (patronymic.charAt(i) < 192)
                throw new UnknownLettersException("Код ошибки 121: некорретные символы при вводе");
        }
        setPatronymic(patronymic);
    }
}
