package ru.mirea.task21;

import ru.mirea.task18.AccountRefill.Account;

import java.util.ArrayList;

public class User extends Human {
    private ArrayList<UserAccount> accountList = new ArrayList<>();
    private ArrayList<Card> cardList = new ArrayList<>();
    //private ArrayList<Application> appList;


    public void getAccountList() {
        for(int i = 0; i < accountList.size(); i++)
        {
            System.out.println("Счёт №" + (i+1) + ". Номер: " + accountList.get(i).getNumber() + "; Число средств на счёту: " + accountList.get(i).getAmount() + "; Валюта: " + accountList.get(i).getCurrency());
        }
    }

    public String toString()
    {
        return getSurname() + " " + getName() + " " + getPatronymic() + " " + getAge() + " лет";
    }
    public void createAccount(String currency)
    {
        accountList.add(new UserAccount(currency));
    }
    public void addMoney(double amount, String currency) {
        int err = 0;
        if (amount < 0) {
            throw new IllegalArgumentException("Код ошибки 254: введённая сумма не может быть отрицательной");
        }
        for (int i = 0; i < accountList.size(); i++) {
            if (currency.equals(accountList.get(i).getCurrency())) {
                accountList.get(i).setAmount(amount);
            } else
            {
                err++;
            }
            //acc.setAmount(amount);
        }
        if (err == accountList.size())
        {
            throw new IllegalArgumentException("Код ошибки 341: счёт не найден");
        }
    }
}
