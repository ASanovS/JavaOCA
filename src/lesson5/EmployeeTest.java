package lesson5;

public class EmployeeTest {
    public static void main(String[] args) {
        Employee employee1 = new Employee(1, "Joe", 2000, 20);
        Employee employee2 = new Employee(2, "Jon", 1000, 25);

        // employee1.salatyX2();
        // employee2.salatyX2();

        employee1.salary = employee1.salaryX2();
        employee2.salary = employee2.salaryX2();

        System.out.println("E1 salary: " + employee1.salary);
        System.out.println("E2 salary: " + employee2.salary);

    }
}
