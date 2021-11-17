package ru.mirea.task21.UsReg;

import ru.mirea.task19.CustomException.EmptyException;
import ru.mirea.task19.CustomException.UnknownLettersException;
import ru.mirea.task17.UserMenu;
import ru.mirea.task21.User;

import java.util.ArrayList;
import java.util.Scanner;

public class UserRegulation {
    public ArrayList<User> userList = new ArrayList<>();

    public void showInfo()
    {
        System.out.println("Список пользователей: ");
        getUserListText();
        System.out.print("\n");
        System.out.println("Выберете одну из опций ниже (буква)");
        System.out.println("A. Добавить нового пользователя");
        System.out.println("B. Выбрать существующего пользователя");
        System.out.println("C. Удалить пользователя");
    }

    public int searchUser(int index)
    {
        if(userList.get(index-1) == null)
        {
            throw new IndexOutOfBoundsException("Пользователя с указанным номером не существует");
        }
        else
        {
            return index;
        }
    }
    public void addUser()
    {
        boolean click = true;
        User user = new User();
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите фамилию");
        while(click) {
            try {
                user.setSurname(scan.nextLine());
                click = false;
            } catch (EmptyException | UnknownLettersException ex) {
                System.out.println(ex.getMessage());
            }
        }
        click = true;

        System.out.println("Введите имя");
        while(click) {
            try {
                user.setName(scan.nextLine());
                click = false;
            }catch(EmptyException | UnknownLettersException ex)
            {
                System.out.println(ex.getMessage());
            }
        }
        click = true;

        System.out.println("Введите отчество");
        while(click) {
            try {
                user.setPatronymic(scan.nextLine());
                click = false;
            }catch(EmptyException | UnknownLettersException ex)
            {
                System.out.println(ex.getMessage());
            }
        }
        click = true;

        System.out.println("Введите возраст");
        while (click) {
            try {
                user.setAge(scan.nextInt());
                click = false;
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
                System.out.println("Повторите ввод");
            }
        }
        user.createAccount("Rub");
        System.out.println("Счёт в рублях открыт");
        System.out.print("\n");
        userList.add(user);
    }
    public void getUserListText()
    {
        for(int i = 0; i < userList.size(); i++)
        System.out.println("Пользователь №" + (i+1) + " " + userList.get(i));
        if(userList.isEmpty())
            System.out.println("Пользователей нет");
    }
    public ArrayList<User> getUserList()
    {
        return userList;
    }
    public void removeUser(int index)
    {
        if (index > userList.size())
        {
            System.out.println("Указанного пользователя нет в списке");
            System.out.print("\n");
        }
        else {
            userList.remove(index - 1);
        }
    }
}
