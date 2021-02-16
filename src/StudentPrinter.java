public class StudentPrinter {
    public void printStudents(Student[] students, int i){
        switch (i){
            case 3:
                    for(Student student: students){
                        printStudentFulInfo(student);
                    }
                    break;
        }


    }
    public void printStudentFulInfo(Student student) {
        System.out.println(student.toString() + "\n" + "Student: "+ student.getFullName());
    }

}
