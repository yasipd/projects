package learnJava7;

public class celsiusToFahrenheit {

    public static double celsiustoF(double celsius) {
        double f=celsius* (9.0/5)+32;
        return f;
    }
    public static void main(String[] args) {
        System.out.println(celsiustoF(25));
    }
    
}
