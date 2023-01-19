package nusiss;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CSVWriter {
    
    public static final String COMMA_DELIMETER = ",";
    public static final String NEWLINE_SEPARATOR = "\n";
    private static final String FILE_HEADER = "staffNo,fullName,department,role,emailAddress,salary";
    public List<Employee> employees = null;

    public List<Employee> generateEmployee() {
        
        employees = new ArrayList<>();

        // create some employees
        // instantiate several objects from Employee class
        Employee employee1 = new Employee("12345", "Ridzuan Azmi", "Technical", "Engineer", 
        "ridzy666@email.com", 55000);
        Employee employee2 = new Employee("12435", "Almas Alwani", "HR", "Recruiter", 
        "alwaney@email.com", 100000);
        Employee employee3 = new Employee("89021", "Jalal Friday", "Engineering", "Senior Tecnician", 
        "jalal@email.com", 40000);
        Employee employee4 = new Employee("14309", "Atikah Hassan", "Kitchen", "Chef", 
        "teek@email.com", 10000);

        // add the employee to the list of employees
        employees.add(employee1);
        employees.add(employee2);
        employees.add(employee3);
        employees.add(employee4);

        return employees;
    }

    public void writeToCSV(List<Employee> employees, String fileName) throws IOException {

        FileWriter fw = new FileWriter(fileName);

        // write FILE_HEADER into CSV 
        fw.append(FILE_HEADER.toString());
        fw.append(NEWLINE_SEPARATOR);

        // read records row by row and write it using fw.append()
        for (Employee emp : employees) {
            fw.append(emp.getStaffNo());
            fw.append(COMMA_DELIMETER);
            fw.append(emp.getFullName());
            fw.append(COMMA_DELIMETER);
            fw.append(emp.getDepartment());
            fw.append(COMMA_DELIMETER);
            fw.append(emp.getEmailAdress());
            fw.append(COMMA_DELIMETER);
            fw.append(String.valueOf(emp.getSalary()));
            fw.append(COMMA_DELIMETER);

            fw.append(NEWLINE_SEPARATOR);
            
        }
        // flush to confirm writing to file and close the FileWriter object
        fw.flush();
        fw.close();
    }

}
