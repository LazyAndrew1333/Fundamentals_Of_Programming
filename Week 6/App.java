// import the Scanner class
import java.util.Scanner;

public class App {
    // Scanner Object
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        myOrder();
    }

    static void myOrder() {
        
        System.out.println("\nWelcome, please enter your order");

        System.out.println("\nMenu");
        System.out.println("CS:\nFlavor - Creamy Spinach | PizzaPrice - 400.00");
        System.out.println("CP:\nFlavor - Cheese Pizza | Price - 300.00");

        System.out.print("Flavor: ");
        String pizzaFlavor = scan.next();

        String Flavor = "";
        double Price = 0.00;
        double totalPrice = 0.00;

        switch (pizzaFlavor) {
            case "CS":
                Flavor = "Creamy Spinach Pizza";
                Price = 400.00;
                break;

            case "CP":
                Flavor = "Cheese Pizza";
                Price = 300.00;
                break;

            default:
                System.out.println("Invalid flavor");
                break;
        }

        System.out.println("\nWhat type of crust would you like?");
        System.out.println("HT:\nHand Tossed");
        System.out.println("TC:\nThin Crust");

        System.out.print("Crust: ");
        String pizzaCrust = scan.next();

        String Type = "";

        switch (pizzaCrust) {
            case "HT":
                Type = "Hand Tossed";
                break;

            case "TC":
                Type = "Thin Crust";
                break;

            default:
                System.out.println("Invalid crust");
                break;
        }
        
        System.out.println("\nWhat size would you like?");
        System.out.println("S:\nSmall");
        System.out.println("M:\nMedium");
        System.out.println("L:\nLarge");

        System.out.print("Size: ");
        char pizzaSize = scan.next().charAt(0);

        String Size = "";

        switch (pizzaSize) {
            case 'S':
                Size = "Small";
                break;

            case 'M':
                Size = "Medium";
                break;

            case 'L':
                Size = "Large";
                break;

            default:
                System.out.println("Invalid Size");
                break;
        }

        System.out.println("\nHow many orders would you like?");
        System.out.print("Amount: ");
        int Amount = scan.nextInt();

        totalPrice = Price * Amount;

        System.out.println("\nYour order\n" + "Flavor: " + Flavor + "\nCrust Type: " + Type + "\nCrust Size: " + Size + "\nAmount: " + Amount + "\ntotalPrice: " + totalPrice);
    }
}
