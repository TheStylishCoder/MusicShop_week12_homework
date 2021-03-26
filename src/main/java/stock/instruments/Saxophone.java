package stock.instruments;

public class Saxophone extends Instrument {

    private String mouthpieceMaterial;

    public Saxophone(String description, double costPrice, double sellingPrice, String material, String colour, InstrumentType instrumentType, String mouthpieceMaterial) {
        super(description, costPrice, sellingPrice, material, colour, instrumentType);
        this.mouthpieceMaterial = mouthpieceMaterial;
    }

    public String getMouthpieceMaterial() {
        return mouthpieceMaterial;
    }

    public String play(String sound) {
        return "I sound like " + sound;
    }

    public double calculateMarkup(double costPrice, double sellingPrice) {
        return sellingPrice - costPrice;
    }
}
