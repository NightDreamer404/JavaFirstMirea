package ru.mirea.task17;

public enum WorkerOptions
{
    Locking("Блокировка"),
    Review ("Рассмотрение"),
    Convertate ("Конвертирование"),
    Return ("Возврат"),
    Error ("Ошибка");
    public String titleWork;
    WorkerOptions(String title)
    {
        this.titleWork = title;
    }

    public String getTitle()
    {
        return titleWork;
    }
}