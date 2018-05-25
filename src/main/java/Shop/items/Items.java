package Shop.items;

public abstract class Items {

    protected String name;
    protected double boughtPrice;
    protected double sellPrice;


    public Items(String name, double boughtPrice, double sellPrice){
        this.name = name;
        this.boughtPrice = boughtPrice;
        this.sellPrice = sellPrice;
    }


    public double getBoughtPrice() {
        return this.boughtPrice;
    }

    public String getName() {
        return this.name;
    }

    public double getSellPrice() {
        return this.sellPrice;
    }


}
