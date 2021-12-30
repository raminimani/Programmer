package JavaClass28.Maps;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Demo1 {
    public static void main(String[] args) {

        int [] numbers={10,20,40,600}; // things are stored based on the index's
        // hard to search have to go through all the elements in worst case

        for (int number:numbers){
            if (number==600){
                System.out.println("found");
            }
        }

        ArrayList<Integer> integerArrayList=new ArrayList<>();
        integerArrayList.add(30);
        integerArrayList.add(49);
        integerArrayList.add(80);
        integerArrayList.add(90);
        integerArrayList.add(120);
        integerArrayList.add(20);
        System.out.println(integerArrayList.contains(80));
        //internally contains method is doing the same going through all the elements to search

        Map<Integer,String> studentsInfo=new HashMap<>();
        studentsInfo.put(12345,"Alexay");
        studentsInfo.put(4345,"Jimmy");
        System.out.println(studentsInfo.get(4345));// not going through all the

    }
}
