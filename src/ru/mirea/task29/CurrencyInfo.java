package ru.mirea.task29;

import java.io.Serializable;

public class CurrencyInfo implements Serializable {
    private PurchaseExRate purchaseExRate;
    private SellExRate sellExRate;

    public CurrencyInfo(PurchaseExRate pObj, SellExRate sObj)
    {
        this.purchaseExRate = pObj;
        this.sellExRate = sObj;
    }

    public SellExRate getSellExRate() {
        return sellExRate;
    }

    public PurchaseExRate getPurchaseExRate() {
        return purchaseExRate;
    }

    public void setPurchaseExRate(PurchaseExRate purchaseExRate) {
        this.purchaseExRate = purchaseExRate;
    }

    public void setSellExRate(SellExRate sellExRate) {
        this.sellExRate = sellExRate;
    }

    @Override
    public String toString() {
        return "CurrencyInfo{" +
                "purchaseExRate=" + purchaseExRate +
                ", sellExRate=" + sellExRate +
                '}';
    }
}
