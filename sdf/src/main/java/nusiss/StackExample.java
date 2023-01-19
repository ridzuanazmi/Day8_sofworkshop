package nusiss;

import java.util.Iterator;
import java.util.Stack;

public class StackExample {

    public static void main(String[] args) {
        example();
    }
    
    public static void example() {
        Stack<Integer> stack = new Stack<Integer>();

        // pushing or adding something into the stack (FILO. LIFO)
        for (int i = 0; i < 5; i++) {
            stack.push(i);
        }

        // removing or popping something from the stack
        for (int i = 0; i < 10; i++) {
            Integer stackItem = stack.pop();
            System.out.println("Stack item (pop) = " + stackItem);
        }

        // see what is the last item on top of the stack
        Integer item = stack.pop();
        System.out.println(item);
        Integer firstItem = stack.firstElement();
        System.out.println("First element of Stack = " + firstItem);

        // to find out which position
        Integer idElement = stack.search(2);
        System.out.println("Stack element found at index = " + idElement);

        Iterator<Integer> its = stack.iterator();

        while (its.hasNext()) {
            Integer stackITS = its.next();
            System.out.println("Iterator stack item = " + stackITS);
        }

        
    }
}
