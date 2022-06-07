public class EmployeeRecord implements Prototype{
    private int employeeNum;
    private String employeeName,designation,address;
    private double salary;

    public EmployeeRecord(){
        System.out.println("Employee Records in ABC Company");
        System.out.println("==========================================");
        System.out.println("EmpId" + "\t" + "EmpName" + "\t\t" + "Designation" + "\t\t" + "Salary" + "\t\t" + "Address");
    }

    public EmployeeRecord(int employeeNum, String employeeName, String designation, double salary, String address) {
        this();
        this.employeeNum = employeeNum;
        this.employeeName = employeeName;
        this.designation = designation;
        this.address = address;
        this.salary = salary;
    }

    public void showRecord(){
        System.out.println(employeeNum + "\t" + employeeName + "\t" + designation + "\t" + salary + "\t\t" + address);
    }

    @Override
    public Prototype getClone() {
        return new EmployeeRecord(employeeNum,employeeName,designation,salary,address);
    }
}