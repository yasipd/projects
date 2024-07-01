package learnJava1;

public class ElectricGuitar {
    String brand;
    int numOfPickUps;
    boolean rockStarUsesIt;
    String getBrand(){
        return brand;
    }
    void setBrand(String aBrand){
        brand=aBrand;
    }
    int getNumOfPickUps(){
        return numOfPickUps;
    }
    void setNumOfPickUps(int anumOfPickUps){
        numOfPickUps=anumOfPickUps;
    }
    boolean getRockStarUsesIt(){
        return rockStarUsesIt;
    }
    void setRockStarUsesIt(boolean yesOrNo){
        rockStarUsesIt=yesOrNo;
    }
}
