package learnJava3;
public class PhraseOMatic {
    public static void main(String[]arg){
        String[] wordListOne={"Paria","Sima","Hafsa","Yasi","Hossei","Malte","Azra","Ehsan"};
        String[] wordListTwo={"Parisa","Rasool","Kaveh","Nosrat","Tobias","Nils"};
        String[] wordListThree={"Jasmin","Nils","Peter","Baps","Tim","Gaby","Jurgen"};
        int onelength=wordListOne.length;
        int twoLength=wordListTwo.length;
        int threeLength=wordListThree.length;
        java.util.Random randomGenerator=new java.util.Random();
        int rand1=randomGenerator.nextInt(onelength);
        int rand2=randomGenerator.nextInt(twoLength);
        int rand3=randomGenerator.nextInt(threeLength);
        String phrase=wordListOne[rand1]+" "+wordListTwo[rand2]+" "+wordListThree[rand3];
        System.out.println("what we need is this three one " +phrase);

    }
    
}

