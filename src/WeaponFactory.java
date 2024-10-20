public class WeaponFactory {

    public Product createGuns (){
        String name = Input.inputStr("Enter name of the product: ");
        int amount = Input.inputInt("Enter the amount: ", 1, Integer.MAX_VALUE);
        double price = Input.inputDouble("Enter price($): ", 0, Double.MAX_VALUE);
        double calibre = Input.inputDouble("Enter calibre(mm): ", 0, 900);
        return new Guns(name, amount, price, calibre);
    }

    public Product createKnives (){
        String name = Input.inputStr("Enter name of the product: ");
        int amount = Input.inputInt("Enter the amount: ", 1, Integer.MAX_VALUE);
        double price = Input.inputDouble("Enter price($): ", 0, Double.MAX_VALUE);
        String material = Input.inputStr("Enter material: ");
        return new Knives(name, amount, price, material);
    }

    public Product createSwords (){
        String name = Input.inputStr("Enter name of the product: ");
        int amount = Input.inputInt("Enter the amount: ", 1, Integer.MAX_VALUE);
        double price = Input.inputDouble("Enter price($): ", 0, Double.MAX_VALUE);
        return new Swords(name, amount, price);
    }
}
