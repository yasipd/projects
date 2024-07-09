package LambdaExpressions;

public class Main {
    public static void main(String[] args) {
        String name="paria";
        char symbol='!';
        MyInteface myInteface=(x,y)->{
            System.out.println("hello "+x+y);
            
    };
        myInteface.myMethod(name,symbol);
    }

    }
