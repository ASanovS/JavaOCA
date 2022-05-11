package lesson6;

public class StudentTest {
    public static void main(String[] args) {
        Student student = new Student();
        student.id = 1;
        student.firstName = "Ivan";
        student.lastName = "Ivanov";
        student.course = "JavaScrtipt";
        student.economicAssessment = 5;
        student.mathScore = 7;
        student.foreignLanguageAssessment = 8;
        System.out.println(student.printStudentInfo());

        Student student1 = new Student(1, "Joe", "Doe", "Java");
        student1.mathScore = 10;
        student1.economicAssessment = 10;
        student1.foreignLanguageAssessment = 10;
        System.out.println(student1.printStudentInfo());

        Student student2 = new Student(2, "Jon","Black","Python", 4,6,7);
        System.out.println(student2.printStudentInfo());
    }
}
