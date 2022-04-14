package lesson5;

public class Employee {
    int id;
    String surname;
    int salary;
    int age;

    Employee(int id, String surname, int salary, int age) {
        this.id = id;
        this.surname = surname;
        this.salary = salary;
        this.age = age;
    }

    // void salatyX2() {
    //     salary = salary * 2;
    // }

    int salaryX2() {
        return salary * 2;
    }
}
