package Battleship;

public class SimpleStartUpTestDrive {
    public static void main(String[] args) {
        SimpleStartUp dot = new SimpleStartUp();
        int[] locations = {2, 3, 4}; // Create an array for the location of the startup
        dot.setLocationCells(locations); // Set the location for the startup
        int userGuess = 2; // Define a user's guess
        String result = dot.checkYourself(userGuess); // Check the user's guess
        String testResult = "failed"; // Default test result

        // Check if the result of the guess is "hit"
        if (result.equals("hit")) {
            testResult = "passed"; 
        }

        
        System.out.println(testResult);
    }
}
