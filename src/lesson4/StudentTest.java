package lesson4;

public class StudentTest {
    public static void main(String[] args) {
        Student student = new Student();

        student.firtsName = "Joe";
        student.lastName = "Doe";
        student.biletNumer = 1;
        student.mathScore = 10;
        student.economicAssessment = 8;
        student.foreignLanguageAssessment = 4;

        System.out.print("Sredniy bal po vsem predmetam: ");
        System.out.println((student.mathScore + student.economicAssessment + student.foreignLanguageAssessment) / 3);

    }
}
