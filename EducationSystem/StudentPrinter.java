package EducationSystem;

public class StudentPrinter {
    public void printStudents(Student[] students, int i){
        switch (i){
            case(3):
                for (Student student: students){
                    printStudentFullInfo(student);
                }
                break;
        }
    }

    private void printStudentFullInfo(Student student) {
        System.out.println(student.toString() +" "+ student);
    }
}
