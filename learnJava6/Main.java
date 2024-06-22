package learnJava6;

public class Main {
    public static void main(String[] args) {
        Animal myAnimal=new Dog();//upcasting
        myAnimal.makeSound();
        if(myAnimal instanceof Dog){
            Dog myDog=(Dog) myAnimal;//downcasting
            myDog.fetch();
        }
    }
}
