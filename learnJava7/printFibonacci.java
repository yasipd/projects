package learnJava7;

public class printFibonacci {
    public static int Fibonacci(int n) {
            if(n<=1){
                return n;
            }
            //recursive method(inefficient for large number)
    //         return  Fibonacci(n-2)+Fibonacci(n-1); 
    // }
    //iterative method
    //first we need an array of the numbers up to n
//     int a=0,b=1;
//     int fib=1;
//     for (int i=2;i<=n;i++){
//         fib=a+b;
//         a=b;
//         b=fib;
//     }
//     return fib;
// }

//there is also another method :dynamic method that uses array to store fibonnaci 
//create an array to store fibonaci numbers
//initialize f(0)=0 and f(1)=1
//use loop to fill in array with fibonacci numbers up to n-th term
//each entry in the array is computed as the sum of two proceding entries
int[] fibArray=new int[n+1];
fibArray[0]=0;
fibArray[1]=1;
for(int i=2;i<=n;i++){
    fibArray[i]=fibArray[i-1]+fibArray[i-2];
}
return fibArray[n];
    }

    public static void main(String[] args) {
        System.out.println(Fibonacci(3));
    }
    
}
