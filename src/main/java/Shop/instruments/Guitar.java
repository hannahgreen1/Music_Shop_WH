package Shop.instruments;

public class Guitar extends  Instruments{

    private int strings;

    public Guitar(InstrumentType type, MaterialType material, String colour, int strings, double price){
        super(type, material, colour, price);
        this.strings = strings;
    }

    public int getStrings() {
        return this.strings;
    }


}
