package JavaClass28.Maps;

import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Set;

public class Demo5 {
    public static void main(String[] args) {

        HashMap<String, Double> grocery=new LinkedHashMap<>();
        grocery.put("Egg",5.5);
        grocery.put("Rice",2.5);
        grocery.put("Milk",4.6);
        grocery.put("Tomato",1.5);
        grocery.put("Onion",1.9);

        Set<String> keys=grocery.keySet();
        System.out.println(keys);
        grocery.values();
        System.out.println(grocery.values());
        Collection<Double> values=grocery.values();
        System.out.println(values);
    }
}
