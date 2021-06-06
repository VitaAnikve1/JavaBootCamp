package sef.activity1;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class FirstActivity {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();

        employees.add(new Employee("Vita", "Accenture", 700.00));
        employees.add(new Employee("Andrew", "Accenture", 987.20));
        employees.add(new Employee("Arnold", "Accenture", 1000000.00));
        employees.add(new Employee("Max", "Accenture", 30000.75));
        employees.add(new Employee("John", "Accenture", 5000.00));

        employees
                .stream()
                .sorted(Comparator.comparingDouble(Employee::getSalary).reversed())
                .map(Employee::getName)
                .forEach(System.out::println);
    }
}
