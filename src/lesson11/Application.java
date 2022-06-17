package lesson11;

public class Application {
    public static void main(String[] args) {

        Employee employee = new Employee("Joe", 150.5);

        System.out.println(employee.salary); // зарплата студента
        // з.п. не увеличина вернувшееся значение не присвоено
        employee.salaryX2(200);
        System.out.println(employee.salary); // з.п. не увеличена
        // з.п. увеличина метод увеличивает непосредственно значение з.п.
        employee.salaryX2();
        System.out.println(employee.salary); // з.п. увеличина
        // увеличение з.п. присвоением через метод получающий значение
        employee.salary = employee.salaryX2(employee.salary);
        System.out.println(employee.salary); // з.п. увеличина

        Student st1 = new Student("Joe", 2, 8.2);
        Student st2 = new Student("Jon", 2, 5);

        System.out.println(st1.name);
        System.out.println(st2.name);
        swap(st1, st2);

        System.out.println(st1.name);
        System.out.println(st2.name);

        changeName(st1);
        System.out.println(st1.name);
    }

    public static void swap(Student s1, Student s2) {
        Student s3 = s1;
        s1 = s2;
        s2 = s3;
    }

    public static void changeName(Student s1) {
        s1.name = "Noname";
    }
}
