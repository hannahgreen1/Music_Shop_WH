package Shop.items;

public class SheetMusic extends Items {

    private String author;


    public SheetMusic(String name, double boughtPrice, double sellPrice, String author){
        super(name, boughtPrice, sellPrice);
        this.author = author;
    }


    public String getAuthor() {
        return this.author;
    }
}
