package stock.instruments;

import behaviours.IPlay;
import stock.StockItem;

public abstract class Instrument extends StockItem implements IPlay {

    private String material;
    private String colour;
    InstrumentType instrumentType;

    public Instrument(String description, double costPrice, double sellingPrice, String material, String colour, InstrumentType instrumentType){
        super(description, costPrice, sellingPrice);
        this.material = material;
        this.colour = colour;
        this.instrumentType = instrumentType;
    }

    public String getMaterial() {
        return material;
    }

    public String getColour() {
        return colour;
    }

    public InstrumentType getInstrumentType() {
        return instrumentType;
    }
}
