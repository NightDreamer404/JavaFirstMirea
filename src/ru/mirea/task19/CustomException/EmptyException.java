package ru.mirea.task19.CustomException;

public class EmptyException extends Exception {
    private String request = "Повторите ввод";

    public EmptyException(String message) {
        super(message);
        System.out.println(request);
    }
}
