public class Array {
    public static void main(String[] args) throws Exception {

        // Array
        char[] myName = {'J', 'O', 'H', 'N', 'A', 'N', 'D', 'R', 'E', 'W'};

        System.out.println("\n");

        // ---------Manually call characters---------
        // System.out.println("Mannualy call characters:");
        // System.out.println(myName[0]);
        // System.out.println(myName[9]);
        // System.out.println(myName[100]);

        System.out.println("\n");

        // -------Using for loop---------
        System.out.println("Call using for loop:");
        for (int i = 0; i < myName.length; i++) {
            System.out.print(myName[i]);
        }

        System.out.println("\n");

        // System.out.println("Reverse call:");
        // for (int i = 9; i >= 0; i--) {
        //     System.out.print(myName[i]);
        // }

        System.out.println("\n");

        // for (int i = myName.length - 1; i >= 0; i--) {
        //     System.out.print(myName[i]);
        // }

        System.out.println("\n");

        // System.out.println("Call only the vowels:");
        // for (int i = 0; i < myName.length; i++) {
        //     if (myName[i] == 'A' || myName[i] == 'E' || myName[i] == 'I' || myName[i] == 'O' || myName[i] == 'U'){
        //         System.out.print(myName[i]);
        //     }
        // }

        System.out.println("\n");

        // System.out.println("Call only the consonants:");
        // for (int i = 0; i < myName.length; i++) {
        //     if (!(myName[i] == 'A' || myName[i] == 'E' || myName[i] == 'I' || myName[i] == 'O' || myName[i] == 'U')){
        //         System.out.print(myName[i]);
        //     }
        // }

        System.out.println("\n");

        // -------Using while loop---------
        // System.out.println("Call using while loop:");
        // int i = 0;
        // while (i < myName.length){
        //     System.out.print(myName[i]);
        //     i++;
        // }
    }
}
