package lesson34.hw;

import java.util.ArrayList;
import java.util.function.Predicate;

public class TestEmployee {

    public static void main(String[] args) {
        ArrayList<Employee> listEmployee = new ArrayList<>();

        Employee e1 = new Employee("Joe", "QA", 500);
        Employee e2 = new Employee("Jon", "IT", 350);
        Employee e3 = new Employee("Jane", "IT", 200);
        Employee e4 = new Employee("Sara", "HR", 300);
        Employee e5 = new Employee("HR", "HR", 300);

        listEmployee.add(e1);
        listEmployee.add(e2);
        listEmployee.add(e3);
        listEmployee.add(e4);
        listEmployee.add(e5);

        employeesFilter(listEmployee, (Employee em) -> em.department.equals("IT") && em.salary > 200);
        System.out.println("-----------------");
        employeesFilter(listEmployee, (Employee em) -> em.name.endsWith("e") && em.salary != 450);
        System.out.println("-----------------");
        employeesFilter(listEmployee, (Employee em) -> em.name.equals(em.department));
    }

    static void printEmployee(Employee employee) {
        System.out.println("Employee name: " + employee.name +
                ", department: " + employee.department +
                ", salary: " + employee.salary);
    }

    static void employeesFilter(ArrayList<Employee> employeeArrayList, Predicate<Employee> predicate) {
        for (Employee e : employeeArrayList) {
            if (predicate.test(e)) {
                printEmployee(e);
            }
        }
    }
}
