package stock.accessories;

public class SheetMusic extends Accessory{

    public SheetMusic(String description, double costPrice, double sellingPrice) {
        super(description, costPrice, sellingPrice);

    }


    public double calculateMarkup() {
        return getSellingPrice() - getCostPrice();
    }
}
