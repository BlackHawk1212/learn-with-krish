import java.io.*;

public class PrototypeDemo {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter Employee Id: ");
        int empId = Integer.parseInt(br.readLine());
        System.out.print("\n");

        System.out.print("Enter Employee Name: ");
        String empName = br.readLine();
        System.out.print("\n");

        System.out.print("Enter Employee Designation: ");
        String empDesignation = br.readLine();
        System.out.print("\n");

        System.out.print("Enter Employee Salary: ");
        double empSalary = Double.parseDouble(br.readLine());
        System.out.print("\n");

        System.out.print("Enter Employee Address: ");
        String empAddress = br.readLine();
        System.out.print("\n");

        EmployeeRecord e1 = new EmployeeRecord(empId,empName,empDesignation,empSalary,empAddress);

        e1.showRecord();
        System.out.println("\n");
        EmployeeRecord e2 = (EmployeeRecord) e1.getClone();
        e2.showRecord();
    }

}