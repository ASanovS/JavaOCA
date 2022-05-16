package lesson7;

public class App {
    public static void main(String[] args) {
        Employee emp1 = new Employee(5);
        Employee emp2 = new Employee("Joe");
        // Employee emp3 = new Employee(55.5);

        System.out.println(emp1.id);
        System.out.println(emp1.surname);
        // System.out.println(emp1.salary);

        System.out.println(emp2.id);
        System.out.println(emp2.surname);
        // System.out.println(emp2.salary);

        emp1.getID();
        emp1.getSalary();
        emp1.getSurname();

        emp2.getID();
        emp2.getSalary();
        emp2.getSurname();
    }
}
