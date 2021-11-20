package ru.mirea.task22;

public enum CardList {
    DEBIT("Дебитовая"),
    CREDIT ("Кредитная"),
    VIRTUAL ("Виртуальная"),
    ERROR ("Ошибка");
    private String title;
    CardList(String title)
    {
        this.title = title;
    }

    public String getTitle()
    {
        return title;
    }
}
