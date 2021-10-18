import java.util.*;

public class Sample {
    public static void main(String[] args) {
        // ArrayList Declaration
        ArrayList<String> fruits = new ArrayList<String>();
        // Add Items
        fruits.add("Apple");
        fruits.add("Banana");

        // print the size of the list

        System.out.println(fruits.size());

        // print the list
        System.out.println(fruits);

        // Add element at specific position
        fruits.add(0, "At index 0");
        fruits.add(3, "orange");

        // print list
        System.out.println(fruits);

        // access an item
        System.out.println(fruits.get(0));

        // change an item
        fruits.set(0, "Fruits");
        System.out.println(fruits);

        // remove an item by index
        fruits.remove(0);
        System.out.println(fruits);

        // remove an item by value
        fruits.remove("orange");
        System.out.println(fruits);

        // remove all elements
        fruits.clear();
        System.out.println(fruits);
    }

}
