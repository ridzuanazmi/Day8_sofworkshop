package nusiss;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;
/*
public class CSVReader {
    
    public List<Employee> readCSV(String newFileEmployee) throws IOException {

        FileReader fr = new FileReader(newFileEmployee);
        BufferedReader br = new BufferedReader(fr);
        String line;

        // ignores the first line
        br.readLine();

        while (null != (line = br.readLine())) {
            // Ignores blank line
            if (line.isEmpty()) {
                continue;
            }

            String[] values = line.split(",");

            if (values.length < 5) {
                continue;
            }
            String staffNo = values[0].trim();
            String fullName = values[1].trim();
            String department = values[2].trim();
            String emailAddress = values[3].trim();
            String salary = values[4].trim();

            System.out.println("[" + staffNo + " , " + fullName + " , " + department + ", "
                    + emailAddress + ", " + salary + "]");
        }
        
        br.close();
        fr.close();

    }
}
*/