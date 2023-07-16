package src.main.java.features.records;

public record EmployeeRecord(String EmployeeName, int EmployeeNumber) { //records are always final by default
    private static final String DEFAULT_EMPLOYEE_NAME = "George";

    //this is a replacement of the canonical constructor, sets fields automatically but we can add our own logic here if we want
    public EmployeeRecord {
        if (EmployeeNumber < 0) throw new IllegalArgumentException("Employee Number cant be 0");
    }

    //we can leave this empty, or we can define our own functions
    public static void printWhatever() {//static, this does not require an instance to be called
        System.out.println("whatever");
    }

    public String nameInUpperCase() { //this requires a record instance to be created
        return EmployeeName.toUpperCase();
    }
}