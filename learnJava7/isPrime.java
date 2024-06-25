package learnJava7;
//Write a function that takes an integer and returns true if the number is prime, and false otherwise.
public class isPrime {
     public static boolean primeChecker(int n){
        if (n <= 1) {
            return false;  // Numbers less than or equal to 1 are not prime
        }
    //     for (int i = 2; i < n; i++) {  // Loop from 2 to n-1
    //         if (n % i == 0) {
    //             return false;  // If n is divisible by any number between 2 and n-1, it is not prime
    //         }
    //     }
    //     return true;  // If no divisors were found, n is prime
    // }
    //this is not an efficient approach when a number is big then we need much bigger memory.
    //we should work with sqrt
    if (n == 2) {
        return true; // 2 is the only even prime number
    }
    if(n%2==0 ){
        return false;
    }
    for (int i = 3; i <= Math.sqrt(n); i += 2) {  // Only check odd numbers up to sqrt(n)
        if (n % i == 0) {
            return false;  // If divisible, n is not prime
        }
    }
    return true;  // If no divisors were found, n is prime
}
    public static void main(String[] args) {
        System.out.println(primeChecker(12));  
        System.out.println(primeChecker(13));  
        System.out.println(primeChecker(29));  
    }
}
