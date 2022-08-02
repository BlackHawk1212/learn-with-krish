import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EmployeeStreamEx {
    public static void main(String[] args) {
        List<Employee> empList = Arrays.asList(
                new Employee(1001,"A",25,"SL"),
                new Employee(1002,"B",26,"SL"),
                new Employee(1003,"C",30,"SL"),
                new Employee(1004,"D",35,"SL"),
                new Employee(1005,"E",24,"SL")
                );

        Consumer<Employee> employeeConsumer = System.out::println;
        empList.forEach(employeeConsumer);

        empList.stream().forEach(System.out::println);
        empList.stream().filter(employee -> employee.getAge() > 25).forEach(System.out::println);
        empList.stream().map(employee -> employee.getEmpName()).forEach(System.out::println);
        empList.stream().filter(employee -> employee.getAge() > 25).map(employee -> employee.getEmpName()).forEach(System.out::println);
        empList.stream().map(employee -> employee.getEmpName()).filter(name -> name.startsWith("A")).forEach(System.out::println);

        /*
        * REDUCTION - Terminal Operations
        *       1. Aggregation Function (min, max, avg, count)
        *       2. Collectors
        */

        Stream<Employee> stream1 = empList.stream();
        stream1.filter(employee -> employee.getAge() > 25).forEach(System.out::println);

        List<Employee> emp25LIst = empList.stream().filter(employee -> employee.getAge() > 25).collect(Collectors.toList());
        System.out.println(emp25LIst);

        String names = empList.stream().map(employee -> employee.getEmpName()).collect(Collectors.joining(","));
        System.out.println(names);
    }
}
