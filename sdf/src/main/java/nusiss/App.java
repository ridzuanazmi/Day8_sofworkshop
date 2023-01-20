package nusiss;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

/**
 * Hello world!
 */
public final class App {
    private App() {
    }

    /**
     * Says hello to the world.
     * 
     * @param args The arguments of the program.
     * @throws IOException
     */
    public static void main(String[] args) throws IOException {

        String dirPath = "data";
        String fileName = "data.txt";

        // create a directory to enter integers and a String
        File newDir = new File(dirPath);
        boolean isDirCreated = newDir.mkdir();

        // check if directory has been created
        if (isDirCreated) {
            System.out.println("New directory " + dirPath + " created");
        } else {
            System.out.println("Directory " + dirPath + " already exist");
        }

        // create a file in the directory created above
        File newFile = new File(dirPath + File.separator + fileName);
        boolean isFileCreated = newFile.createNewFile();

        if (isFileCreated) {
            System.out.println("New file " + fileName + " created");
        } else {
            System.out.println("File " + fileName + " already exists");
        }

        // list files under a directory
        File fileList[] = newDir.listFiles();
        for (File f : fileList) {
            System.out.println("File " + f.getCanonicalPath() + " : " + f.getCanonicalFile());           

        }

        // use fileOutputStream to write some integers to file 'data.txt'
        int[] data = { 1, 2, 3, 4, 5 };
        FileOutputStream fos = new FileOutputStream(newFile, true);
        try {
            for (int i : data) {
                String str = String.valueOf(i) + "\n";
                byte[] byteArray = str.getBytes();
                fos.write(byteArray);
            }
            fos.flush();
            fos.close();
        } catch (IOException e) {
            System.out.println("An error occurred while writing to file: " + e.getMessage());
        }

        // use FileWriter to write String into 'data.txt'
        String strData = "Hello, World!";
        FileWriter fw = new FileWriter(newFile, true);
        try {
            fw.write(strData + "\n");
            fw.flush();
            fw.close();
        } catch (IOException e) {
            System.out.println("An error occurred while writing to file: " + e.getMessage());
        }

        // Start of employee read and write
        String fileEmployee = "employee.txt";

        // create a file in the directory created above and writes it in csv format
        File newEmployeeFile = new File(dirPath + File.separator + fileEmployee);
        boolean isEmployeeFileCreated = newEmployeeFile.createNewFile();

        if (isEmployeeFileCreated) {
            System.out.println("New employee file " + fileName + " created");
        } else {
            System.out.println("Employee file " + fileName + " already exists");
        }
        // instantiate cw, an object from the CSVWriter class
        CSVWriter cw = new CSVWriter();
        List<Employee> employeeList = cw.generateEmployee();
        cw.writeToCSV(employeeList, dirPath + File.separator + fileEmployee);
        
         
        CSVReader cr = new CSVReader();
        List<Employee> readEmployees = cr.readCSV(dirPath + File.separator + fileEmployee);
        readEmployees.forEach(e -> System.out.println(e));
        
        /*
        // CSV reader. reads the CSV file
        FileReader fr = new FileReader(newEmployeeFile);
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
        */

    } // end of main
}
