import behaviours.ISell;

import java.util.ArrayList;

public class MusicShop {

    private String name;
    private ArrayList<ISell> stock;

    public MusicShop(String name){
        this.name = name;
        this.stock = new ArrayList<ISell>();
    }

    public String getName() {
        return this.name;
    }

    public ArrayList<ISell> getStock() {
        return this.stock;
    }

    public int getStockCount(){
        return this.stock.size();
    }

    public void addToStockList(ISell stockItem){
        this.stock.add(stockItem);
    }

    public ISell removeFromStockList(){
        return this.stock.remove(0);
    }

    public double calculateProfit(ArrayList<ISell> stock){
        double total = 0;
        for(ISell item : stock){
            total += item.calculateMarkup();
        }
        return total;
    }
}
