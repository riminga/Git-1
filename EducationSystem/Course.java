package EducationSystem;

import java.util.Arrays;

public class Course {
    private String name;
    private int hours;
    private Tutor tutor;
    private Student student;
    private Student[] students;

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public Tutor getTutor() {
        return tutor;
    }

    public void setTutor(Tutor tutor) {
        this.tutor = tutor;
    }

    public Student[] getStudents() {
        return students;
    }

    public void setStudents(Student[] students) {
        this.students = students;
    }

    public Course(String name, int hours, Tutor tutor, Student[] students) {
        this.name = name;
        this.hours = hours;
        this.tutor = tutor;
        this.students = students;
    }

    public Course(String name, int hours, Tutor tutor) {
        this(name, hours, tutor, null);
    }

    public Course(String name, int hours){
        this(name, hours, null, null);
    }

    @Override
    public String toString() {
        return "Course{" +
                "name='" + name + '\'' +
                ", hours=" + hours +
                ", tutor=" + tutor +
                ", students=" + student +
                '}';
    }


    public Student studInfo(){
        String groupName = student.getGroupName();

   return null;
    }

    public String getStudentInfo() {
        if(students == null) return null;
        String result = "";
        for (Student student: students){
            if(student != null){
                result += student.getFullName()+" "+student.getGroupName()+" "+student.getAge();
            }
        }
        return result;
    }
}
