package lesson11;

public class Employee {

    public String name;
    public double salary;

    Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public double salaryX2(double input) {
        return input *= 2;
    }

    public double salaryX2() {
        return salary *= 2;
    }
    
}
