package Shop.instruments;

public class Guitar extends  Instruments implements IPlay{

    private int strings;

    public Guitar(InstrumentType type, MaterialType material, String colour, int strings, double price, String sound){
        super(type, material, colour, price, sound);
        this.strings = strings;
    }

    public int getStrings() {
        return this.strings;
    }


    @Override
    public String play(String sound) {
        return sound;
    }
}
