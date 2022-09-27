package lesson34;

import java.util.ArrayList;
import java.util.function.Predicate;

class StudentInfo {

    void checkStudent(ArrayList<Student> studentArrayList, Predicate<Student> studentPredicate) {
        for (Student s : studentArrayList) {
            if (studentPredicate.test(s)) {
                printStudent(s);
            }
        }
    }

    void printStudent(Student student) {
        System.out.println("Student name: " + student.name +
                ", student sex: " + student.sex +
                ", student age: " + student.age +
                ", student course: " + student.course +
                ", student grade: " + student.avgGrade);
    }
}
