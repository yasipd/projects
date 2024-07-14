package Array;

public class Main {
    public static void main(String[] args) {
        Array1 numbers =new Array1(3);
        numbers.insert(3);
        numbers.insert(5);
        numbers.insert(4);
        numbers.insert(10);
        numbers.insert(25);
        numbers.removeAt(1);
        // numbers.indexOf(3);
        numbers.print();    }
}
