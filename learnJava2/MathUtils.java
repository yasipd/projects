package learnJava2;

public class MathUtils {
    //method with one parameter
    public int add(int a){
        return a;
    }
    //overloaded method with 2 parametes
    public int add(int a,int b){
        return a+b;
    }
    //overloaded method with 3 parameters
    public int add(int a,int b,int c){
        return a+b+c;
    }
    //overloading by changing the type of parameters
    public void show(int num){
        System.out.println("integer "+num);
    }
    public void show(String num){
        System.out.println("String "+ num);
    }
    //overloading with different parameter types and counts
    public void printData(int a,double b){
        System.out.println ("integer "+a+" ,double: "+b);
    }
    public void printData(double a,int b){
        System.out.println("double "+a+" integer: "+b);
    }
    
}
