package lesson34;

import java.util.ArrayList;

public class Application {
    public static void main(String[] args) {
        StudentInfo studentInfo = new StudentInfo();
        ArrayList<Student> listStudents = new ArrayList<>();

        Student st1 = new Student("Joe", 'm', 22, 3, 8.3);
        Student st2 = new Student("Jon", 'm', 28, 2, 6.4);
        Student st3 = new Student("Jane", 'f', 19, 1, 8.9);
        Student st4 = new Student("Steve", 'm', 35, 4, 7);
        Student st5 = new Student("Sara", 'f', 23, 3, 9.1);

        listStudents.add(st1);
        listStudents.add(st2);
        listStudents.add(st3);
        listStudents.add(st4);
        listStudents.add(st5);

        studentInfo.checkStudent(listStudents, (Student st) -> st.avgGrade > 8);
        System.out.println("----------------");
        studentInfo.checkStudent(listStudents, (Student st) -> st.age < 30);
        System.out.println("----------------");
        studentInfo.checkStudent(listStudents, (Student st) -> st.sex == 'm');
        System.out.println("----------------");
        studentInfo.checkStudent(listStudents, (Student st) -> st.course < 3);
    }
}
