package JavaClass28.Maps;

import java.util.LinkedHashMap;

public class Demo3 {
    public static void main(String[] args) {

        LinkedHashMap<Integer,String> students= new LinkedHashMap<>();
        students.put(10,"Ramin");
        students.put(10,"Jimmy"); //key should be always unique if we insert the data with same key it will replace the old one
        students.put(10,"Ramin");
        students.put(7,"Ahmet");
        students.put(9,"Henok");
        System.out.println(students);
    }
}
