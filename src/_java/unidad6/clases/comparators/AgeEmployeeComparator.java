package _java.unidad6.clases.comparators;

import _java.unidad6.clases.classes.Employee;

import java.util.Comparator;

public class AgeEmployeeComparator implements Comparator<Employee> {
    public int compare(Employee e1, Employee e2){
        return Integer.compare(e1.getEdad(), e2.getEdad());
    }
}
