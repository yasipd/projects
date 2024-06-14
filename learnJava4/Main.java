package learnJava4;

public class Main {
    public static void main(String[]arg){
        Car car1=new Car("chev","camaro",1993);
        Car car2=new Car("benz","mercedes",2000);
        car2.copy(car1);
        System.out.println(car1);
        System.out.println(car2);
        System.out.println();
        System.out.println(car1.getMake());
        System.out.println(car1.getModel());
        System.out.println(car1.getYear());
        System.out.println();
        System.out.println(car2.getMake());
        System.out.println(car2.getModel());
        System.out.println(car2.getYear());
    }
}
