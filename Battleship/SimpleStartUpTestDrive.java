package Battleship;

public class SimpleStartUpTestDrive {
    public static void main(String[] args) {
        SimpleStartUp dot=new SimpleStartUp();
        int[] locations={2,3,4};//make an int array for the location of the startup
        dot.setLocationCells(locations);
        int userGuess=2;
        String result=dot.checkYourself(userGuess);
        String testResult="failed";
        if(result.equals("hit")){
            testResult="passed";
        }
        System.out.println(testResult);
    }
    
}
