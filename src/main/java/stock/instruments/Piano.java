package stock.instruments;

public class Piano extends Instrument {

    private String pianoType;

    public Piano(String description, double costPrice, double sellingPrice, String material, String colour, InstrumentType instrumentType, String pianoType) {
        super(description, costPrice, sellingPrice, material, colour, instrumentType);
        this.pianoType = pianoType;
    }

    public String getPianoType() {
        return pianoType;
    }

    public String play(String sound) {
        return "I sound like: " + sound;
    }

    public double calculateMarkup() {
        return getSellingPrice() - getCostPrice();
    }

}
