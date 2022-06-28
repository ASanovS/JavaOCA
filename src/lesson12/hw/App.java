package lesson12.hw;

import lesson11.Student;

public class App {

    public static void main(String[] args) {
        Student st1 = new Student("Joe", 3, 4.0);
        Student st2 = new Student("Jon", 2, 5.0);
        StudentTest.studentEquals1(st1, st2);
        StudentTest.studentEquals2(st1, st2);

        Student st3 = new Student("Jane", 5, 5.0);

    }
}
