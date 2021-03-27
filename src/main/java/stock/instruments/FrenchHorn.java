package stock.instruments;

public class FrenchHorn extends Instrument {

    private String hornType;

    public FrenchHorn(String description, double costPrice, double sellingPrice, String material, String colour, InstrumentType instrumentType, String hornType) {
        super(description, costPrice, sellingPrice, material, colour, instrumentType);
        this.hornType = hornType;
    }

    public String getHornType(){
        return this.hornType;
    }


    public String play(String sound) {
        return "I sound like: " + sound;
    }

    public double calculateMarkup() {
        return getSellingPrice() - getCostPrice();
    }
}
