package nusiss;

public class Employee implements Comparable<Employee> {
    // fields
    private Integer staffNo;
    private String fullName;
    private String department;
    private String role;
    private String emailAdress;
    private Integer salary;

    // constructor
    public Employee(Integer staffNo, String fullName, String department, String role, String emailAdress,
            Integer salary) {
        this.staffNo = staffNo;
        this.fullName = fullName;
        this.department = department;
        this.role = role;
        this.emailAdress = emailAdress;
        this.salary = salary;
    }
    
    // getters and setters
    public Integer getStaffNo() {
        return staffNo;
    }

    public void setStaffNo(Integer staffNo) {
        this.staffNo = staffNo;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getEmailAdress() {
        return emailAdress;
    }

    public void setEmailAdress(String emailAdress) {
        this.emailAdress = emailAdress;
    }

    public Integer getSalary() {
        return salary;
    }

    public void setSalary(Integer salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee [staffNo = " + staffNo + ", fullName = " + fullName + ", department = " + department + ", role = "
                + role + ", emailAdress = " + emailAdress + ", salary = " + salary + "]";
    }

    @Override
    public int compareTo(Employee o) {
        // TODO Auto-generated method stub 
        return this.getFullName().compareTo(o.getFullName());
    }

} // end of Employee class
