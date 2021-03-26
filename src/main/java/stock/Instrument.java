package stock;

import behaviours.IPlay;

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

    
}
