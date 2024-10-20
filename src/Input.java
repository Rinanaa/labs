import java.util.Scanner;

interface Input {

    static int inputInt (String str, int min, int max) {

        int x;
        Scanner intt = new Scanner(System.in);

        while (true)
            try {
                System.out.print(str);
                x = Integer.parseInt(intt.nextLine());
                if (x < min || x > max) {
                    throw new IllegalArgumentException();
                }
                return x;
            }
            catch(Exception e) {
                System.out.println("Invalid input");
            }
    }

    static double inputDouble (String str, double min, double max) {

        double x;
        Scanner doub = new Scanner(System.in);

        while (true)
            try {
                System.out.print(str);
                x = Double.parseDouble(doub.nextLine());
                if (x <= min || x >= max) {
                    throw new IllegalArgumentException();
                }
                return x;
            }
            catch(Exception e) {
                System.out.println("Invalid input");
            }
    }

    static String inputStr (String str){

        String x;
        Scanner string = new Scanner(System.in);

        while (true)
            try {
                System.out.print(str);
                x = string.nextLine();
                return x;
            }
            catch(Exception e) {
                System.out.println("Invalid input");
            }
    }

}
