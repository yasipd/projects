package learnJava7;
import java.util.Scanner;
//Implement the area calculation using the appropriate operator.
public class AreaCalculator {
    public static void main(String[] args) {
         
        Scanner scanner =new Scanner(System.in);
        System.out.println("give the length of rectangle: ");
        int length=scanner.nextInt();
        System.out.println("givr the length of the rectangle: ");
        int width=scanner.nextInt();
        scanner.close();
        int area=width*length;
        System.out.println("the Area of this rectangle is : "+area);
     }
}
