package Shop;

public abstract class Stock {

    private String name;
    private double price;

    public Stock(String name, double price){
        this.name = name;
        this.price = price;
    }


    public double getPrice() {
        return this.price;
    }

    public String getName() {
        return this.name;
    }
}
