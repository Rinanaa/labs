public class Water extends Product{

    protected double bottleSize;

    public Water (String name, int amount, double price, double bottleSize){
        super(name, amount, price);
        this.bottleSize = bottleSize;
    }

    @Override
    public String productInfo(){
        return (super.productInfo() + "\n\tBottle size: " + this.bottleSize);
    }
}
