package learnJava6;

import java.util.ArrayList;

public class WithOutGeneric {
    public static void main(String[] args) {
        ArrayList list=new ArrayList();//no generics so it can hold any types of object
        list.add(10);
        list.add(100);
        list.add("10");
        String str=(String) list.get(0);
        System.out.println(str);
        String num = (String) list.get(1);//classCastException
    }
}
