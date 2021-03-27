package stock.accessories;

public class StringsPack extends Accessory {

    public StringsPack(String description, double costPrice, double sellingPrice) {
        super(description, costPrice, sellingPrice);

    }


    public double calculateMarkup() {
        return getSellingPrice() - getCostPrice();
    }
}
