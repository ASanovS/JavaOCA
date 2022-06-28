package lesson12.hw;

import lesson11.Student;

public class StudentTest {

    public static void studentEquals1(Student st1, Student st2) {

        if (st1.name.equals(st2.name) && st1.course == st2.course && st1.grade == st2.grade) {
            System.out.println("Student equals true");
        } else {
            System.out.println("Student equals false");
        }
    }

    public static void studentEquals2(Student st1, Student st2) {

        if (st1.name.equals(st2.name)) {
            if (st1.course == st2.course) {
                if (st1.grade == st2.grade) {
                    System.out.println("Student1 equals Student2");
                } else {
                    System.out.println("Student name and course ==, grade !=");
                }
            } else {
                System.out.println("Student name ==, course !=");
            }
        } else {
            System.out.println("Student name !=");
        }
    }
}
