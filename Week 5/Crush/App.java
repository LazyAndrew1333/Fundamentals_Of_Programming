// import the Scanner class
import java.util.Scanner;

public class App {

    // Scanner Object
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {

        // Method call
        String crushName = revealMyCrush();
        System.out.println(crushName);

        // Close scanner
        scan.close();
    }

    static String revealMyCrush() {
        System.out.println("\nThis will reveal the name of your crush\n");
        System.out.print("Enter the your name: ");

        String myName = scan.nextLine();

        System.out.print("Enter the name of your previous crush: ");

        String nameOfMyPreviousCrush = scan.nextLine();

        System.out.print("Enter the name of your current crush: ");

        String nameOfMyCurrentCrush = scan.nextLine();

        return "\n" + myName + " previously liked " + nameOfMyPreviousCrush + "\nNow he likes " + nameOfMyCurrentCrush + "\n";
    }
}
