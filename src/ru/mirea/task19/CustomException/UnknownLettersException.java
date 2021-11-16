package ru.mirea.task19.CustomException;

public class UnknownLettersException extends Exception {
    private String request = "Повторите ввод";

    public UnknownLettersException(String message) {
        super(message);
        System.out.println(request);
    }
}
