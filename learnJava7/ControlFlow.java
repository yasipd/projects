package learnJava7;
//contorl structure example : prints numbers from 1 to 5 using a loop and an if condition to check if the number is 3.
//with exception handling
import java.util.Scanner;
public class ControlFlow {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        // int number;
//         while (true) { 
//             System.out.println("Give a number: ");
//             number = scanner.nextInt();
//         if (number == 3) {
//             for (int i = 1; i <= 5; i++) {  
//                 System.out.println(i);
//             }
//             break;
//         } else {
//             System.out.println("No way. Try again.");  
//         }
//     }

//     scanner.close();  // It's important to close the scanner to free up resources
// we can have this approach that the user quit the program by entering e

        String input;
        while (true) { 
            System.out.println("give a number or enter e to exit");
            input=scanner.nextLine();
        
        if (input.equalsIgnoreCase("e")) {  
            System.out.println("Exiting program...");
            break;  
        } 
        else 
        try {
            int number = Integer.parseInt(input);  // Try to convert the string to an integer
            if (number == 3) {
                for (int i = 1; i <= 5; i++) {  // If the number is 3, print numbers from 1 to 5
                    System.out.println(i);
                }
            } else {
                System.out.println("No way. Try again.");  // If the number is not 3, ask to try again
            }
        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please enter a valid number or 'e' to exit.");  // Handle non-integer inputs
        }
    }
    scanner.close();
        
}
}