package Shop.instruments;

public class Violin extends Instruments implements IPlay{

    private int age;

    public Violin(InstrumentType type, MaterialType material, String colour,double price, int age, String sound){
        super(type, material, colour, price, sound);
        this.age = age;
    }

    public int getAge() {
        return this.age;
    }


    @Override
    public String play(String sound) {
        return sound;
    }
}
