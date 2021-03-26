package stock.accessories;

public class InstrumentCase extends Accessory{

    public InstrumentCase(String description, double costPrice, double sellingPrice) {
        super(description, costPrice, sellingPrice);

    }

    public double calculateMarkup(double costPrice, double sellingPrice) {
        return sellingPrice - costPrice;
    }
}
