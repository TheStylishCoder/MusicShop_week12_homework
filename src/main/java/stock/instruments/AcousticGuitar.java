package stock.instruments;

public class AcousticGuitar extends Instrument{

    private int noOfStrings;

    public AcousticGuitar(String description, double costPrice, double sellingPrice, String material, String colour, InstrumentType instrumentType, int noOfStrings) {
        super(description, costPrice, sellingPrice, material, colour, instrumentType);
        this.noOfStrings = noOfStrings;
    }



    public String play(String sound) {
        return null;
    }

    public double calculateMarkup(double costPrice, double sellingPrice) {
        return 0;
    }
}
