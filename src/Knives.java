public class Knives extends Product{

    protected String material;

    public Knives (String name, int amount, double price, String material){
        super(name, amount, price);
        this.material = material;
    }

    @Override
    public String productInfo(){
        return(super.productInfo() + "\n\tMaterial: " + this.material);
    }
}
