import java.util.ArrayList;

public abstract class Product {

    protected String name;
    protected int amount;
    protected double price;

    public Product (String name, int amount, double price){
        this.name = name;
        this.amount = amount;
        this.price = price;
    }

    public String productInfo(){
        return ("Name: " + this.name + "\n\tPrice: " + this.price + " \n\tAvailable amount: " + this.amount);
    }

    public static void displayProductArray(ArrayList<Product> products){
        for (Product i: products){
            System.out.println(i.productInfo());
        }
    }
}
