import java.util.ArrayList;

public class WithGenerics {
    public static void main(String[] args) {
        ArrayList<String> list =new ArrayList<>();//this list holds strings
        list.add("Hello");
        String str=list.get(0);
        System.out.println(str);
    }
}
