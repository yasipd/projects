package learnJava7;
//Write a function that takes an integer and returns an ArrayList containing its prime factors.

import java.util.ArrayList;

public class primeFactors {
    public static ArrayList<Integer> primeFactor(int number) {
        ArrayList<Integer> factors=new ArrayList<>();
        //dividing number by 2 till it becomes odd
        while(number%2==0){
            factors.add(2);
            number /=2;
        }
        //at this point, number must be odd.
        //so we start from 3 and check only odd numbers.
        for(int i=3;i<Math.sqrt(number); i+=2){
            while (number%i==0){
                factors.add(i);
                number /=i;
            }
        }
        // This condition is to check if number is a prime number
        // greater than 2
        if(number>2){
            factors.add(number);
        }
        return factors;
    }

    public static void main(String[] args) {
        int number = 66;
        ArrayList<Integer> primeFactors = primeFactor(number);
        System.out.println("Prime factors of " + number + " are: " + primeFactors);
    }
}
