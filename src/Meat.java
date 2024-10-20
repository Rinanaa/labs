public class Meat extends Product{

    protected String part;

    public Meat (String name, int amount, double price, String part){
        super(name, amount, price);
        this.part = part;
    }

    @Override
    public String productInfo(){
        return (super.productInfo() + "\n\tPart: " + this.part);
    }
}
