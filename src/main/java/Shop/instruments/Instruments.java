package Shop.instruments;


public abstract class Instruments {

    protected InstrumentType type;
    protected MaterialType material;
    protected String colour;
    protected double price;


    public Instruments(InstrumentType type, MaterialType material, String colour, double price){
        this.type = type;
        this.colour = colour;
        this.material = material;
        this.price = price;
    }

    public InstrumentType getType() {
        return this.type;
    }

    public MaterialType getMaterial() {
        return this.material;
    }

    public String getColour() {
        return this.colour;
    }

    public double getPrice() {
        return this.price;
    }
}
