package learnJava2;

public class Main {
    public static void main(String[] args){
        MathUtils math=new MathUtils();
        System.out.println(math.add(5));
        System.out.println(math.add(5,10));
        System.out.println(math.add(5,10,15));
        math.show(5);
        math.show("hello");
        math.printData(5, 10.5);
        math.printData(2.5,5);

    }
}
