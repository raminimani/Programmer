package JavaClass25.Collectionframework;

import java.util.ArrayList;

public class Demo1 {
    public static void main(String[] args) {
        String name="Hasim";
        String name2="Ahmet";
        String[] names={"Maryum","Amran"};

        //  names[2]="Mohammad"; // can't add more than 2 elements

        ArrayList<String> listOfNames=new ArrayList<>();
        System.out.println("Size of listOfNames "+listOfNames.size());
        listOfNames.add("Mustafa");
        listOfNames.add("Aysha");
        listOfNames.add("Tamanna");
        System.out.println("Size of listOfNames "+listOfNames.size());
        listOfNames.remove("Tamanna");
        System.out.println("Size of listOfNames "+listOfNames.size());
    }
}
