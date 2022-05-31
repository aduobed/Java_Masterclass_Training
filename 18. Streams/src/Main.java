import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        List<String> someBiggerNumbers = Arrays.asList(
                "N40", "N36",
                "B12", "B6", "B56", "B87",
                "G53", "G67", "G80", "G98",
                "I23", "I11", "I25",
                "072"
        );

//        someBiggerNumbers.forEach(number -> {
//            if (number.startsWith("B")) {
//                System.out.println(number);
//            }
//        });

        //Using streams to get strings starting With "B"
        someBiggerNumbers
                .stream()
                .map(String::toUpperCase)
                .filter(s -> s.startsWith("B"))
                .sorted()
                .forEach(System.out::println);

        Stream<String> ioNumberStream = Stream.of("I26", "I17", "I29", "071");
        Stream<String> inNumberStream = Stream.of("N40", "N36", "I26", "I17", "I29", "071");
        Stream<String> concatStream = Stream.concat(ioNumberStream, inNumberStream);
        System.out.println("-------------------------------");
        System.out.println(concatStream
                .distinct()
                .peek(System.out::println)
                .count());

        //The employee and Departments
        Employee john = new Employee("John Baffour", 30);
        Employee jane = new Employee("Jane Deer", 25);
        Employee jack = new Employee("Jack Hill", 40);
        Employee snow = new Employee("Snow WHite", 22);

        Department hr = new Department("Human Resource");
        hr.addEmployee(jane);
        hr.addEmployee(jack);
        hr.addEmployee(snow);
        Department accounting = new Department("Accounting");
        accounting.addEmployee(john);

        List<Department> departments = new ArrayList<>();
        departments.add(hr);
        departments.add(accounting);

        departments.stream()
                .flatMap(department -> department.getEmployees().stream())
                .forEach(System.out::println);

        Map<Integer, List<Employee>> groupByAge = departments.stream()
                .flatMap(department -> department.getEmployees().stream())
                .collect(Collectors.groupingBy(Employee::getAge));

        System.out.println("----------------------------------");

        departments.stream()
                .flatMap(department -> department.getEmployees().stream())
                .reduce((e1, e2) -> e1.getAge() < e2.getAge() ? e1 : e2)
                .ifPresent(System.out::println);
    }
}
