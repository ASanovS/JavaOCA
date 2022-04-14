package lesson5;

public class App {
    public static void main(String[] args) {

        //method call
        int sumThreeNumber = summa(1, 2, 3);
        System.out.println(sumThreeNumber);
 
        System.out.println();

        PrintInformation pI = new PrintInformation();
        pI.methodPrintInfo();

        System.out.println();

        Student student = new Student();
        student.firtsName = "Ivan";
        student.lastName = "Petrov";
        student.economicAssessment = 5.5;
        student.mathScore = 8.7;
        student.foreignLanguageAssessment = 9.5;

        student.printScoreInfo();
    }

    //method creation
    static int summa(int a, int b, int c) {

        return a + b + c;
    }

 
}

class PrintInformation {
    
    void methodPrintInfo() {
        System.out.println("Print information");
    }
}