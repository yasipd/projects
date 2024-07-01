package learnJava8;

public class Dog {
    int size;
    String name;
    void bark(){
        if(size>60){
            System.out.println("Woof!Woof");
        }else if(size>14){
            System.out.println("Ruff!Ruff!");
        }else{
            System.out.println("Yip!Yip!");
        }
    }
    public static void main(String[] args) {
        Dog myDog1=new Dog();
        myDog1.size=90;
        Dog myDog2=new Dog();
        myDog2.size=15;
        Dog myDog3=new Dog();
        myDog3.size=5;
        myDog1.bark();
        myDog2.bark();
        myDog3.bark();
    }
}
