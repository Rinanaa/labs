public class Guns extends Product{

    protected double calibre;

    public Guns (String name, int amount, double price, double calibre){
        super(name, amount, price);
        this.calibre = calibre;
    }

    @Override
    public String productInfo(){
        return (super.productInfo() + "\n\tCalibre: " + this.calibre);
    }
}
