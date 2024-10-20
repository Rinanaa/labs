import java.util.ArrayList;

public class Main {

    public static Product addProduct (FnBFactory fnbFactory, WeaponFactory weaponFactory){

        return switch (Input.inputInt("""
                Which product do you want to add?
                1. Water
                2. Vegetables
                3. Meat
                4. Gun
                5. Sword
                6. Knife
                Input: """, 1, 6)){

            case 1 -> fnbFactory.createWater();
            case 2 -> fnbFactory.createVegetables();
            case 3 -> fnbFactory.createMeat();
            case 4 -> weaponFactory.createGuns();
            case 5 -> weaponFactory.createSwords();
            case 6 -> weaponFactory.createKnives();
            default -> throw new IllegalArgumentException("How?...");
        };
    }

    public static void main(String[] args) {

        FnBFactory fnbFactory = new FnBFactory();
        WeaponFactory weaponFactory = new WeaponFactory();

        ArrayList<Product> weapons = new ArrayList<>();
        ArrayList<Product> fnb = new ArrayList<>();

        while (true){
             switch (Input.inputInt("""
                    1. Show all products
                    2. Show weapons
                    3. Show Food&Beverages
                    4. Add product
                    5. Exit
                    Input: """, 1, 5)){

                 case 1:

                     if (weapons.isEmpty() && fnb.isEmpty()) {
                         System.out.println("No products");
                     }
                     else {
                     Product.displayProductArray(weapons);
                     Product.displayProductArray(fnb);
                     }
                     break;

                 case 2:

                     if (weapons.isEmpty()) {
                         System.out.println("No weapons");
                     }
                     else {
                         Product.displayProductArray(weapons);
                     }
                     break;

                 case 3:

                     if (fnb.isEmpty()) {
                         System.out.println("No food and drinks");
                     }
                     else {
                         Product.displayProductArray(fnb);
                     }
                    break;

                 case 4:

                     Product tempProduct = addProduct(fnbFactory, weaponFactory);

                     Class<? extends Product> prc = tempProduct.getClass();

                     if (prc == Water.class || prc == Meat.class || prc == Vegetables.class){
                         fnb.add(tempProduct);
                     }
                     else{
                         weapons.add(tempProduct);
                     }
                     break;

                 case 5:
                     return;
             }
        }
    }
}