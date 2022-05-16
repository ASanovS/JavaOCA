package lesson7;

public class Employee {
    int id;
    public String surname;
    int age;
    private double salary;
    String department;

    public Employee(int id2) {
        id = id2;
    }

    Employee(String surname2) {
        surname = surname2;
    }

    private Employee(double salary1) {
        salary = salary1;
    }

    double salaryX2() {
        salary *= 2;
        return salary;
    }

    public void getID() {
        System.out.println("ID = " + id);
    }

    public void getSurname() {
        System.out.println("Surname = " + surname);
    }

    public void getSalary() {
        System.out.println("Salary = " + salary);
    }
}
