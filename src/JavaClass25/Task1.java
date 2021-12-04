package JavaClass25;

import java.util.ArrayList;

public class Task1 {
    public static void main(String[] args) {

        /*
        Create an ArrayList that will store 5 names into it.
        Find out whether the given ArrayList is empty or not?
        Check whether the specific name is present in an ArrayList or not?
        Find the size of your arrayList and print all values from that
         */

        ArrayList<String> NamesList=new ArrayList<>();

        NamesList.add("Nasir");
        NamesList.add("Ahmet");
        NamesList.add("Joseph");
        NamesList.add("Nabil");
        NamesList.add("Ammar");

        System.out.println(NamesList.isEmpty());
        System.out.println(NamesList.contains("Ramin"));
        System.out.println(NamesList.size());
        System.out.println(NamesList);


    }
}
