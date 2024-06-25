package learnJava7;

public class AreaOfCircle {
    public static double circleArea(double radius) {
        double pi = 3.14159;
        double area = radius * radius * pi;
        return area;
    } 
    public static void main(String[] args) {
        double radius = 2;
        double result = circleArea(radius);  // Call the static method directly with the class name
        System.out.println("The area of the circle with radius " + radius + " is: " + result);
    }
}
