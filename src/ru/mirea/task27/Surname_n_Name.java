package ru.mirea.task27;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

public class Surname_n_Name {
    public static void main(String[] args) {

        HashMap<String, String> humanMap = new HashMap<>();
        humanMap.put("Василенко", "Дмитрий");
        humanMap.put("Юрченко", "Олег");
        humanMap.put("Алкентов", "Владимир");
        humanMap.put("Сухарев", "Дмитрий");
        humanMap.put("Марущак", "Владислав");
        humanMap.put("Наумов", "Виктор");
        humanMap.put("Пышнов", "Иван");
        humanMap.put("Уметов", "Андрей");
        humanMap.put("Скрипник", "Иван");
        humanMap.put("Микрюков", "Олег");

        Set<String> keys = humanMap.keySet();
        ArrayList<String> keysToDelete = new ArrayList<>();

        //Набираем ArrayList повторных имен
        ArrayList<String> values = new ArrayList<>(humanMap.values());
        String equalityChecker;
        ArrayList<String> equalValues = new ArrayList<>();
        for(int i = 0; i < values.size() - 1; i++)
        {
            equalityChecker = values.get(i);
            for(int j = i+1; j < values.size(); j++)
            {
                if (equalityChecker.equals(values.get(j)) && !equalValues.contains(values.get(j)))
                {
                    equalValues.add(equalityChecker);
                    break;
                }
            }
        }
        System.out.println(equalValues);


        //Набираем ключи записей с повторным именем
        for (String value : equalValues) {
            for (String key : keys) {
                String search = humanMap.get(key);
                if (key != null && search.equals(value)) {
                    keysToDelete.add(key);
                }
            }
        }

        //Очищаем map от записей с повторяющимся именем
        for (String delKeys : keysToDelete)
        {
            humanMap.remove(delKeys);
        }
        System.out.println(humanMap);
    }
}
