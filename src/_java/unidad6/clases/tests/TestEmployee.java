package _java.unidad6.clases.tests;

import _java.unidad6.clases.classes.Employee;
import _java.unidad6.clases.classes.Player2;
import _java.unidad6.clases.comparators.AgeEmployeeComparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class TestEmployee {
    public static void main(String[] args) {
// Test constructor and toString()
        List<Employee> lista = new ArrayList<>();
        Employee e1 = new Employee (8, "PeterA", "Tan", 25001);
        Employee e2 = new Employee (9, "PeterB", "Tan", 25002);
        Employee e3 = new Employee (10, "PeterC", "Tan", 25003);

        lista.add(e1);
        lista.add(e2);
        lista.add(e3);

        System.out.println(e1); // toString();
// Test Setters and Getters
        e1.setSalary(999);
        System.out.println(e1); // toString();
        System.out.println("id is: " + e1.getId());
        System.out.println("firstname is: " + e1.getFirstName());
        System.out.println("lastname is: " + e1.getLastName());
        System.out.println("salary is: " + e1.getSalary());
        System.out.println("name is: " + e1.getName());
        System.out.println("annual salary is: " + e1.getAnnualSalary()); // Test method #
// Test raiseSalary()
        System.out.println(e1.raiseSalary (10));
        System.out.println(e1);
        System.out.println("");

        Collections.sort(lista, new AgeEmployeeComparator());
        lista.forEach(System.out::println);
        System.out.println("");

        Collections.sort(lista, new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                return o1.getName().compareToIgnoreCase(o2.getName());
            }
        });
        lista.forEach(System.out::println);
        System.out.println("");

        Collections.sort(lista, (x, y) -> Integer.compare(x.getSalary(), y.getSalary()));
        lista.forEach(System.out::println);
    }
}
