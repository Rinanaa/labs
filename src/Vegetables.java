public class Vegetables extends Product{

    protected String sort;

    public Vegetables (String name, int amount, double price, String sort){
        super(name, amount, price);
        this.sort = sort;
    }

    @Override
    public String productInfo(){
        return (super.productInfo() + "\n\tSort: " + this.sort);
    }
}
