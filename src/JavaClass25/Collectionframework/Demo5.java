package JavaClass25.Collectionframework;

import java.util.ArrayList;
public class Demo5 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers=new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        System.out.println(numbers);

        ArrayList<Boolean> booleans=new ArrayList<>();
        booleans.add(true);
        booleans.add(false);
        booleans.add(true);
        //  booleans.add("ksdfbk");
        System.out.println(booleans);

     /*   ArrayList arrayList=new ArrayList();
        arrayList.add("Simon");
        arrayList.add(10);
        arrayList.add(false);
//not a good practice
        for (Object arr:arrayList
             ) {
            System.out.println(((String)arr).length());
        }*/

    }
}
