package Algorithm;

public class BinarySearch {


    public static int doSearch(int[] array, int target) {
    int min=0;
    int max=array.length-1;
    while(min<=max){
        int guess=(min+max)/2;
        if(array[guess]==target){
            return guess;
        }else if(array[guess]<target){
            System.out.println("too low!");
            min=guess+1;
        }else if(array[guess]>target){
            System.out.println("too low");
            max=guess-1;
        }
    }
    return -1;
    }
    public static void main(String[] args) {
        int[] array = {1, 3, 5, 7, 9, 11};
        int target = 5;
        
        int result = doSearch(array, target);
        System.out.println("Index of target: " + result);
    }
}

