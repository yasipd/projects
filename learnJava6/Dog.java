package learnJava6;

public class Dog extends Animal{
    @Override
    void makeSound(){
        System.out.println("barks");
    }
    void fetch(){
        System.out.println("Fetching...");
    }
    
}
