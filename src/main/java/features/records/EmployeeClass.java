package src.main.java.features.records;

/*
before Records
source: https://www.youtube.com/watch?v=gJ9DYC-jswo
 */
public class EmployeeClass {
    private final String EmployeeName;
    private final int EmployeeNumber;

    public EmployeeClass(String name, int empNumber) { //constructor
        this.EmployeeName = name;
        this.EmployeeNumber = empNumber;
    }

    public String getEmployeeName() {
        return EmployeeName;
    }

    public int getEmployeeNumber() {
        return EmployeeNumber;
    }
}