import java.util.Scanner;

public class MultidimensionalArray {

    static Scanner scan = new Scanner(System.in);
    
    public static void main(String[] args) throws Exception{
        
        // String[][] seats =  {
        //     {"available", "available", "available"},
        //     {"available", "available", "available"},
        //     {"available", "available", "available"}
        // };

        // System.out.println("Choose your seat\n");

        // System.out.print("Choose your row[0-2][-]:");
        // int chosenRow = scan.nextInt();
        // System.out.print("Choose your column[-][0-2]:");
        // int chosenColumn = scan.nextInt();

        // seats[chosenRow][chosenColumn] = "Taken";

        // System.out.println("\n");

        // for (int i = 0; i < seats.length; i++) {
        //     for (int j = 0; j < seats.length; j++) {
        //         System.out.println(seats[i][j] + "[" + i + "]" + "[" + j + "]");
        //     }
        // }

        // ------------------------------------------------------Activity----------------------------------------------------------------

        char[][] alphabet =  {
            {'A', 'B', 'C'},
            {'D', 'E', 'F'},
            {'G', 'H', 'I'}
        };

        // System.out.println(alphabet[1][1]);
        // System.out.println(alphabet[2][0]);
        // System.out.println(alphabet[0][1]);

        for (int i = 0; i < alphabet.length; i++) {
            for (int j = 0; j < alphabet.length; j++) {
                System.out.print(alphabet[i][j]);
            }
            System.out.println(" ");
        }

        // --------------------------------------------------------Clock----------------------------------------------------------------
        
        // --------Hour--------
        // for (int hours = 0; hours < 12; hours++) {
            
        //     // -------Minute-------
        //     for (int minutes = 0; minutes < 60; minutes++) {

        //         // --------Second--------
        //         for (int seconds = 0; seconds < 60; seconds++) {
        //             System.out.println(hours + ":" + minutes + ":" + seconds);
        //         }
        //     }
        // }
    }
}
