package lesson34;

import java.util.ArrayList;

class StudentInfo {

    void checkStudent(ArrayList<Student> studentArrayList, SudentCheck sc) {
        for (Student s : studentArrayList) {
            if (sc.test(s)) {
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
