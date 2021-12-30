package JavaClass28.Maps;

import JavaClass24.InterfaceDemo.Interface;

import java.util.HashMap;

public class Demo2 {
    public static void main(String[] args) {

        HashMap<String, Integer> fruit =new HashMap<>();
        fruit.put("Apple", 10);//instead of add method we use the put method to
        fruit.put("Mango", 15);// insert the data in a map
        fruit.put("Orange", 20);
        fruit.put("Kiwi",30);
        fruit.put("Apricot",45);

        System.out.println(fruit.get("Kiwi"));//returns the corresponding value to this key
        System.out.println(fruit.get("Mango"));
        System.out.println(fruit.remove("Orange"));//removes this key and corresponding value
        System.out.println(fruit);//print all the data in the map
        System.out.println(fruit.containsKey("Banana"));//check if this key is present in the map
        System.out.println(fruit.containsKey("Apricot"));
        System.out.println(fruit.containsValue(30));//check if this value is present in the map
        System.out.println(fruit.isEmpty());
        System.out.println(fruit.replace("Mango",15,80));
        System.out.println(fruit.replace("Apple",25));
        System.out.println(fruit);

    }
}
