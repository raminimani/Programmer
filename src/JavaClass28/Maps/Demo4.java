package JavaClass28.Maps;

import java.util.TreeMap;

public class Demo4 {
    public static void main(String[] args) {

        TreeMap<String, Double>  groceriesList1= new TreeMap<>();
        groceriesList1.put("Eggs",4.3);
        groceriesList1.put("Tomato", 2.8);
        //groceriesList1.put("Potato",10);//Auto conversion does not work in wrapper classes
        groceriesList1.put("Potato",10.0);
        groceriesList1.put("Milk",5.0);
        groceriesList1.put("Steak",15.2);

        TreeMap<String, Double> groceriesList2=new TreeMap<>();
        groceriesList2.put("Soup",20.2);
        groceriesList2.put("Shampo",12.4);
        groceriesList2.put("Beer",2.3);

        TreeMap<String, Double> groceriesList= new TreeMap<>();
        groceriesList.putAll(groceriesList1);
        groceriesList.putAll(groceriesList2);
        System.out.println(groceriesList);

    }
}
