package lesson34;

public class Application {
    public static void main(String[] args) {
        StudentInfo studentInfo = new StudentInfo();

        Student student = new Student("Joe",'m',30, 5,11.5);
        studentInfo.printStudent(student);
        }
}
