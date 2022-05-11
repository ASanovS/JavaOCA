package lesson6;

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

        id = id1;
        firstName = firstName1;
        lastName = lastName1;
        course = course1;
        mathScore = mathScore1;
        economicAssessment = economicAssessment1;
        foreignLanguageAssessment = foreignLanguageAssessment1;
    }

    Student(int id2, String firstName2, String lastName2, String course2) {
        this(id2, firstName2, lastName2, course2, 0, 0, 0);
    }

    Student() {
    }

    String printStudentInfo() {
        return "ID " + id +
                " firstName " + firstName +
                " lastName " + lastName +
                " course " + course + 
                " mathScore " + mathScore + 
                " economic " + economicAssessment +
                " foreign " + foreignLanguageAssessment;
    }
}
