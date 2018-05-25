package Shop.instruments;

public class Violin extends Instruments{

    private int age;

    public Violin(InstrumentType type, MaterialType material, String colour,double price, int age){
        super(type, material, colour, price);
        this.age = age;
    }

    public int getAge() {
        return this.age;
    }


}
