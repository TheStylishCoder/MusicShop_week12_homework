package stock.instruments;

public class Violin extends Instrument{

    private int noOfStrings;

    public Violin(String description, double costPrice, double sellingPrice, String material, String colour, InstrumentType instrumentType, int noOfStrings) {
        super(description, costPrice, sellingPrice, material, colour, instrumentType);
        this.noOfStrings = noOfStrings;
    }

    public int getNoOfStrings() {
        return noOfStrings;
    }

    public String play(String sound) {
        return "I sound like " + sound;
    }

    public double calculateMarkup() {
        return getSellingPrice() - getCostPrice();
    }
}
