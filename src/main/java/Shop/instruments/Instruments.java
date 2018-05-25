package Shop.instruments;


public abstract class Instruments implements IPlay{

    protected InstrumentType type;
    protected MaterialType material;
    protected String colour;
    protected double price;
    protected String playSound;


    public Instruments(InstrumentType type, MaterialType material, String colour, double price, String playSound){
        this.type = type;
        this.colour = colour;
        this.material = material;
        this.price = price;
        this.playSound = playSound;
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

    public String playSound(String playSound) {
        return this.playSound;
    }
}
