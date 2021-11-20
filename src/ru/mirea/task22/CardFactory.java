package ru.mirea.task22;

import ru.mirea.task17.UserOptions;

public class CardFactory {
    public Card getCard (CardList type)
    {
        Card toReturn = null;
        switch(type)
        {
            case DEBIT:
            {
                toReturn = new DebitCard();
                break;
            }
            case CREDIT:
            {
                toReturn = new CreditCard();
                break;
            }
            case VIRTUAL:
            {
                toReturn = new VirtualCard();
                break;
            }
            case ERROR:
            {
                System.out.println("Некорректный тип карты: " + type);
            }
        }
        return toReturn;
    }

    public void searchType(String choice) {
        CardList card = null;
        CardList[] enums = CardList.values();
        for (int i = 0; i < enums.length; i++) {
            if (choice.equals(enums[i].getTitle())) {
                card = enums[i];
                break;
            }
        }
        if (card == null)
        {
            card = CardList.valueOf("Error");
        }
        getCard(card);
    }
}
