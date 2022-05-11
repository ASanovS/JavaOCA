package lesson5;

public class Student {
    int biletNumer;
    String firtsName;
    String lastName;
    double mathScore;
    double economicAssessment;
    double foreignLanguageAssessment;

    void printScoreInfo() {
        System.out.println(
            "Student " + firtsName + " " + lastName
        );
        System.out.println(
            "Srednii bal po predmetam: " + 
            (mathScore + economicAssessment + foreignLanguageAssessment) / 3
        );
    }
}
