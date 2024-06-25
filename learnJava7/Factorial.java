package learnJava7;

import java.util.Scanner;
//write a recursive factorial program.

public class Factorial {
    public static int factorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Factorial is not defined for negative numbers");
        }
        if (n == 0) {
            return 1;
        }
        return n * factorial(n - 1);
    }

    //nonrecursive 

//     if (n < 0) {
//         throw new IllegalArgumentException("Factorial is not defined for negative numbers");
//     }
//     int result = 1;
//     for (int i = 1; i <= n; i++) {
//         result *= i;
//     }
//     return result;
// }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give a number for the factorial: ");
        int number = scanner.nextInt();
        scanner.close();

        if (number >= 0) {
            System.out.println("Factorial of " + number + " is: " + factorial(number));
        } else {
            System.out.println("Factorial is not defined for negative numbers.");
        }
    }
}