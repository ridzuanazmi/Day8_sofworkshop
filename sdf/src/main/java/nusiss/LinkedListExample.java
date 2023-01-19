package nusiss;

import java.util.LinkedList;

public class LinkedListExample {

    public static void main(String[] args) {
        example();
    }

    public static void example() {
        LinkedList<String> ll = new LinkedList<String>();

        ll.add("A");
        ll.add("B");
        ll.add("C");
        ll.add("D");
        ll.add("E");
        ll.add("F");
        ll.add("G");

        // print out the LinkedList
        ll.forEach(itm -> System.out.println(itm));
        // System.out.println(ll);

        ll.remove("C");
        // print out the LinkedList after removing C
        // ll.forEach(itm -> System.out.println(itm));
        System.out.println(ll);

        ll.removeFirst();
        ll.removeLast();
        System.out.println(ll);

    }
    
}
