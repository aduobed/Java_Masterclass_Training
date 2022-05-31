import java.util.*;

public class Main {
    public static void main(String[] args) {
        //Creating an anonymous class
        new Thread(() -> {System.out.println("Runnable thread running");
            System.out.println("New line 2");
            System.out.println("New line 3");
        }).start();


        //Instantiating the Employee class
        Employee john = new Employee("John Champion",41);
        Employee Maria = new Employee("Maria Venice", 25);
        Employee Kofi = new Employee("Kofi Brown", 32);
        Employee Jack = new Employee("Jack Abba", 25);

        //Adding employees to the an arraylist
        List<Employee> employees = new ArrayList<>();
        employees.add(john);
        employees.add(Maria);
        employees.add(Kofi);
        employees.add(Jack);

        Collections.sort(employees, (emp1, emp2) -> emp1.getName().compareTo(emp2.getName()));
//        Collections.sort(employees, Comparator.comparing(Employee::getName));


        for (Employee employee : employees) {
            System.out.println(employee.getName());
        }
    }
}

//Creating Employee Class
class Employee {
    private String name;
    private int age;

    public Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
