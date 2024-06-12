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

        Hero hero1=new Hero("Batman", 42, "Money");
        Hero hero2=new Hero("superman",43,"everything");
        // System.out.println(hero1.name);
        // System.out.println(hero1.age);
        System.out.println(hero2.toString());

    }
}
