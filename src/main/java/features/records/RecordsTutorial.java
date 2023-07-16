package src.main.java.features.records;

public class RecordsTutorial {
    public static void main(String[] a) {
        EmployeeClass employee = new EmployeeClass("Java 8: James", 122102);
        System.out.println(employee.getEmployeeName());
        System.out.println(employee); //automatically calling the toString() method that we wrote
        EmployeeRecord employeeRecord = new EmployeeRecord("Record: St James", 532401);
        System.out.println(employeeRecord.EmployeeName());
        System.out.println(employeeRecord); //automatically calling the toString() method that is auto generated in the record
        System.out.println(employeeRecord.nameInUpperCase());
        EmployeeRecord.printWhatever(); //calls user-defined static method
    }
}