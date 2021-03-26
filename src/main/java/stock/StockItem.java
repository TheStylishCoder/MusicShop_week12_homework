package stock;

import behaviours.ISell;

public abstract class StockItem implements ISell {

    private String description;
    private double costPrice;
    private double sellingPrice;

    public StockItem(String description, double costPrice, double sellingPrice) {
        this.description = description;
        this.costPrice = costPrice;
        this.sellingPrice = sellingPrice;
    }
}
