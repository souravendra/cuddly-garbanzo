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

    @Override
    public String toString() {
        return "EmployeeClass{" +
                "EmployeeName='" + EmployeeName + '\'' +
                ", EmployeeNumber=" + EmployeeNumber +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof EmployeeClass that)) return false;

        if (getEmployeeNumber() != that.getEmployeeNumber()) return false;
        return getEmployeeName().equals(that.getEmployeeName());
    }

    @Override
    public int hashCode() {
        int result = getEmployeeName().hashCode();
        result = 31 * result + getEmployeeNumber();
        return result;
    }

    public String getEmployeeName() {
        return EmployeeName;
    }

    public int getEmployeeNumber() {
        return EmployeeNumber;
    }
}