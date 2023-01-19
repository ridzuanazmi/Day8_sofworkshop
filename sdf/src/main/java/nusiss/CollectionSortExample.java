package nusiss;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CollectionSortExample {

    public static void main(String[] args) {
        example01();
        example02();
    }
    
    public static void example01() {

        List<Integer> numbers = new ArrayList<Integer>();

        for (int i = 0; i < 10; i++) {
            numbers.add((int) (Math.random() * 100));

            // print out unsorted list
            System.out.println("Unsorted list = " + numbers);

            // sort in ascending
            Collections.sort(numbers);

            // print out sorted list
            System.out.println("Sorted list (ascending order) = " + numbers);

            // sort in descending
            // Collections.sort(numbers, Collections.reverseOrder());
            numbers.sort(Collections.reverseOrder());
            

            // print out sorted list in descending order
            System.out.println("Sorted list (descending order) = " + numbers);

            System.out.println("");
        }
    }

    public static void example02() {

        // instantiate several objects from Employee class
        Employee employee1 = new Employee(12345, "Ridzuan Azmi", "Technical", "Engineer", 
        "ridzy666@email.com", 55000);
        Employee employee2 = new Employee(12435, "Almas Alwani", "HR", "Recruiter", 
        "alwaney@email.com", 100000);
        Employee employee3 = new Employee(89021, "Jalal Friday", "Engineering", "Senior Tecnician", 
        "jalal@email.com", 40000);
        Employee employee4 = new Employee(14309, "Atikah Hassan", "Kitchen", "Chef", 
        "teek@email.com", 10000);

        // make a list, employees, to store the employee objects
        List<Employee> employees = new ArrayList<Employee>();
        employees.add(employee1);
        employees.add(employee2);
        employees.add(employee3);
        employees.add(employee4);

        // print out emplyees list before sorting
        System.out.println("Employees before sorting = " + employees);
        System.out.println("");

        // sort employees name in ascending order using Collections
        Collections.sort(employees);

        // print out sorted employees 
        System.out.println("Employees after sorting by full name = " + employees);
        System.out.println("");

        // sorting out employees using Comparator and lambda
        employees.sort(Comparator.comparing(e -> e.getSalary()));
        System.out.println("Employees after sorting by salary = " + employees);

    } // end of example02 method
}
