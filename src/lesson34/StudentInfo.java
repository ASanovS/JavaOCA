package lesson34;

class StudentInfo {

    void printStudent(Student student) {
        System.out.print("Student name: " + student.name +
                ", student sex: " + student.sex +
                ", student age: " + student.age +
                ", student course: " + student.course +
                ", student grade: " + student.avgGrade);
    }
}
