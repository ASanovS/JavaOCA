package lesson5;

public class Student {
    int id;
    String firstName;
    String lastName;
    String course;
    double mathScore;
    double economicAssessment;
    double foreignLanguageAssessment;

    Student(int id1, String firstName1, String lastName1, String course1, double mathScore1, double economicAssessment1,
            double foreignLanguageAssessment1) {

        this(id1, firstName1, lastName1, course1);
        mathScore = mathScore1;
        economicAssessment = economicAssessment1;
        foreignLanguageAssessment = foreignLanguageAssessment1;
    }

    Student(int id2, String firstName2, String lastName2, String course2) {
        id = id2;
        firstName = firstName2;
        lastName = lastName2;
        course = course2;
    }

    Student() {
    }
}
