package nusiss;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CSVReader {

    public List<Employee> readCSV(String newFileEmployee) throws IOException {

        FileReader fr = new FileReader(newFileEmployee);
        BufferedReader br = new BufferedReader(fr);
        String line;
        List<Employee> employeeFromReader = new ArrayList<Employee>();

        // ignores the first line
        br.readLine();

        while (null != (line = br.readLine())) {
            // Ignores blank line
            if (line.isEmpty()) {
                continue;
            }

            String[] values = line.split(",");

            if (values.length < 6) {
                continue;
            }
            String staffNo = values[0].trim();
            String fullName = values[1].trim();
            String department = values[2].trim();
            String role = values[3].trim();
            String emailAddress = values[4].trim();
            String salary = values[5].trim();
            Integer salaryEmployee = Integer.parseInt(salary);

            Employee employee = new Employee(staffNo, fullName, department, role, emailAddress, salaryEmployee);            
            
            employeeFromReader.add(employee);
            
        }

        br.close();
        fr.close();
        return employeeFromReader;        

    }
}
