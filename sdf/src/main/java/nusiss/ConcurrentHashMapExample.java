package nusiss;

import java.util.Enumeration;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapExample {

    public static void main(String[] args) {
        example();
    }

    public static void example() {
        Map<String, Integer> laptops = new ConcurrentHashMap<>();
        laptops.put("Acer", 5);
        laptops.put("Apple", 10);
        laptops.put("MSI", 10);
        laptops.put("Asus", 15);

        // get the total size of the map objects
        System.out.println("Total laptops = " + laptops.size());

        // iterate through the laptops map, use keySet method
        for (String key : laptops.keySet()) {
            System.out.println(key + " - " + laptops.get(key));
        }

        String searchString = "Asus";
        if (laptops.containsKey(searchString)) {
            System.out.println(searchString + " - " + laptops.get(searchString));
        }

        Enumeration<Integer> elems = ((ConcurrentHashMap<String, Integer>) laptops).elements();
        while (elems.hasMoreElements()) {
            System.out.println(elems.nextElement());
        }

        Integer retValue = laptops.putIfAbsent("Apple", 25);
        if (retValue != null) {
            System.out.println("Item found = " + retValue);
        }

        searchString = "Apple";
        if (laptops.containsKey(searchString)) {
            System.out.println(searchString + " - " + laptops.get(searchString));
        }

        // laptops.put("Microsoft", null);
        // laptops.put(null, 6); won't run as hash map cannot have a null value
        for (String keyString : laptops.keySet()) {
            System.out.println(keyString + " - " + laptops.get(keyString));
        }

    }
}
