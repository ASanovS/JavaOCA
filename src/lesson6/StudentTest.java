package lesson6;

public class StudentTest {
    public static void main(String[] args) {
        Student student = new Student();
        System.out.println(student.printStudentInfo());

        Student student1 = new Student(1, "Joe", "Doe", "Java");
        System.out.println(student1.printStudentInfo());

        Student student2 = new Student(2, "Jon","Black","Python", 4,6,7);
        System.out.println(student2.printStudentInfo());
    }
}
