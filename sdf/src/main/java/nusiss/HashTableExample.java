package nusiss;

import java.io.Console;
import java.util.Hashtable;
import java.util.Map;

public class HashTableExample {

    public static void main(String[] args) {
        example();
    }
    
    public static void example() {
        Map<String, Integer> phones = new Hashtable<>();

        phones.put("iPhone", 10);
        phones.put("Huawei", 2);
        phones.put("Oppo", 6);
        phones.put("Samsung", 20);

        System.out.println("Total phone types = " + phones.size());

        for (String key : phones.keySet()) {
            System.out.println(key + " - " + phones.get(key));
            // get(key) is getting the value of the key in the hash mao
        }

        Console console = System.console();
        String searchString = "";
        while (!searchString.equals("quit")) {

            searchString = console.readLine("Enter the phone type = ");

            // String searchString = "Oppo";
            if (phones.containsKey(searchString)) {
                System.out.println(searchString + " - " + phones.get(searchString));
            } else {
                System.out.println("Item not found");
            }

            // remove all the phones map data
            phones.clear();

            // check the size of the map after clear
            System.out.println("Total phone types = " + phones.size());

        }
    }
}
