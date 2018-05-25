package Shop.items;

public class GuitarStrings extends Items {

    private String stringType;

    public GuitarStrings(String name, double boughtPrice, double sellPrice, String stringType){
        super(name, boughtPrice, sellPrice);
        this.stringType = stringType;
    }


    public String getStringType() {
        return this.stringType;
    }
}
