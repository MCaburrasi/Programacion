package _java.unidad6.clases.classes;

public class Employee {
    private int id;
    private String firstName;
    private String lastName;
    private int edad;
    private int salary;

    public Employee(int id, String firstName, String lastName, int salary) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getName() {
        return firstName + " " + lastName;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getEdad() {
        return edad;
    }

    public int getAnnualSalary(){
        return salary * 12;
    }

    public int raiseSalary(int percent){
        float numToPercent = (float)percent/100;
        this.salary = (int) (this.salary + (this.salary * numToPercent));
        return this.salary;
    }

    @Override
    public String toString() {
        return "Employee[" + "id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", salary=" + salary + ']';
    }
}
