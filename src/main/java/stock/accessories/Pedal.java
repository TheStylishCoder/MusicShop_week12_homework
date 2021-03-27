package stock.accessories;

public class Pedal extends Accessory {
    public Pedal(String description, double costPrice, double sellingPrice) {
        super(description, costPrice, sellingPrice);

    }

//    public double calculateMarkup(double costPrice, double sellingPrice) {
//        return sellingPrice - costPrice;
//    }


    public double calculateMarkup() {
        return getSellingPrice() - getCostPrice();
    }
}
