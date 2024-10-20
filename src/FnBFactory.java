public class FnBFactory {

    public Product createWater(){
        String name = Input.inputStr("Enter name of the product: ");
        int amount = Input.inputInt("Enter the amount of bottles: ", 1, Integer.MAX_VALUE);
        double price = Input.inputDouble("Enter price($): ", 0, Double.MAX_VALUE);
        double bottleSize = Input.inputDouble("Enter bottle size (l): ", 0, 101);
        return new Water(name, amount, price, bottleSize);
    }

    public Product createMeat (){
        String name = Input.inputStr("Enter name of the product: ");
        int amount = Input.inputInt("Enter the amount(kg): ", 1, Integer.MAX_VALUE);
        double price = Input.inputDouble("Enter price($): ", 0, Double.MAX_VALUE);
        String part = Input.inputStr("Enter part: ");
        return new Meat(name, amount, price, part);
    }

    public Product createVegetables (){
        String name = Input.inputStr("Enter name of the product: ");
        int amount = Input.inputInt("Enter the amount(kg): ", 1, Integer.MAX_VALUE);
        double price = Input.inputDouble("Enter price($): ", 0, Double.MAX_VALUE);
        String sort = Input.inputStr("Enter sort: ");
        return new Vegetables(name,amount,price, sort);
    }

}
