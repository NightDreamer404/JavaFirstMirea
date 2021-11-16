package ru.mirea.task17;

public enum UserOptions
{
    Application ("Заявка"),
    Deposit ("Вклад"),
    Card ("Карта"),
    Refill ("Пополнение"),
    Transfer ("Перевод"),
    Analysis ("Анализ"),
    Convert ("Конвертация"),
    Return ("Возврат"),
    Error ("Ошибка");

    private String title;
    UserOptions(String title)
    {
        this.title = title;
    }

    public String getTitle()
    {
        return title;
    }
}