package learnJava7;
import java.util.ArrayList;


public class ArrayListExample {
    public static void main(String[] args) {
        //create an arraylist of string type
        ArrayList<String> fruits=new ArrayList<>();
    
    //adding elements to the arraylist
    fruits.add("Apple");
    fruits.add("Banana");
    fruits.add("cherry");
    fruits.add("date");
    //print the array list
    System.out.println("fruits: "+fruits);
    //get an element from arraylist
    String fruit=fruits.get(1);
    System.out.println("fruits at index 1: "+fruit);
    //set an elemnt at specific index
    fruits.set(2,"Blueberry");
    System.out.println("after setting: "+fruits);
    // Remove an element from the ArrayList
    fruits.remove("Date"); // removes "Date"
    System.out.println("After removing 'Date': " + fruits);
    // Check if the ArrayList contains an element
    boolean hasApple = fruits.contains("Apple");
     System.out.println("Contains 'Apple': " + hasApple);
     // Get the size of the ArrayList
     int size = fruits.size();
     System.out.println("Size of the ArrayList: " + size);
     // Clear the ArrayList
     fruits.clear();
     System.out.println("After clearing: " + fruits);
 }

}

