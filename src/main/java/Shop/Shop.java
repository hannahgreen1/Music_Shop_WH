package Shop;

import Shop.instruments.Instruments;

import java.util.ArrayList;

public class Shop {

    private double till;
    private ArrayList<Instruments> instrument;
    Instruments instruments;
    private double sellPrice;


    public Shop(double till, double sellPrice){
        this.till = till;
        this.sellPrice = sellPrice;
    }


    public double getTill() {
        return this.till;
    }

    public double addMoneyToTill(){
       return this.till += sellPrice;
    }


}
