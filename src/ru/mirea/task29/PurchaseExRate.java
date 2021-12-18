package ru.mirea.task29;

import java.io.Serializable;
import java.util.Arrays;

public class PurchaseExRate implements Serializable {
    private String[] purchaseInfo;

    public PurchaseExRate(String[] purchaseInfo)
    {
        this.purchaseInfo = purchaseInfo;
    }

    public String[] getPurchaseInfo() {
        return purchaseInfo;
    }

    public void setPurchaseInfo(String[] purchaseInfo) {
        this.purchaseInfo = purchaseInfo;
    }

    @Override
    public String toString() {
        return "PurchaseExRate{" +
                "purchaseInfo=" + Arrays.toString(purchaseInfo) +
                '}';
    }
}
