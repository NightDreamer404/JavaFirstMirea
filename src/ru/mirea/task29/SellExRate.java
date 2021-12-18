package ru.mirea.task29;

import java.io.Serializable;
import java.util.Arrays;

public class SellExRate implements Serializable {
    private String[] sellInfo;
    public SellExRate(String[] saleInfo)
    {
        this.sellInfo = saleInfo;
    }

    public void setSaleInfo(String[] saleInfo) {
        this.sellInfo = saleInfo;
    }

    public String[] getSaleInfo() {
        return sellInfo;
    }

    @Override
    public String toString() {
        return "SaleExRate{" +
                "saleInfo=" + Arrays.toString(sellInfo) +
                '}';
    }
}
