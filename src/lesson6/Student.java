package lesson6;

public class Student {
    int id = 0;
    String firstName = "FName";
    String lastName = "LName";
    String course = "none";
    double mathScore = 0.0;
    double economicAssessment = 0.0;
    double foreignLanguageAssessment = 0.0;

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
