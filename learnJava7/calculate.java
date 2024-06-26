package learnJava7;
//Create a function that takes three parameters: two integers and a character representing an operation ('+', '-', '*', '/'). 
//The function should return the result of the operation.
public class Calculate {
    public static int calculate(int num1, int num2, char operator) {
        int result=0;
        switch(operator){
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result=num1 -num2;
                break;
            case '*':
                result =num1*num2;
                break;
            case '/':
                if(num2!=0){
                    result=num1/num2;
                }
             else {
                throw new ArithmeticException("Cannot divide by zero");
            }
            break;
            default:
                throw new IllegalArgumentException("Invalid operator: " + operator);
        }
        return result;
    }
    public static void main(String[]args){
        int num1 = 10;
        int num2 = 5;
        System.out.println("10 + 5 = " + calculate(num1, num2, '+'));
        System.out.println("10 - 5 = " + calculate(num1, num2, '-'));
        System.out.println("10 * 5 = " + calculate(num1, num2, '*'));
        System.out.println("10 / 5 = " + calculate(num1, num2, '/'));
    }
}
