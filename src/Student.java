import java.util.Arrays;
import java.util.Scanner;

public class Student {
    private Student student;
    private String fullName;
    private int age;
    private int groupName;
    private CourseScore[] courses;


    @Override
    public String toString() {
        return "Student{" +
                "student=" + student +
                ", fullName='" + fullName + '\'' +
                ", age=" + age +
                ", groupName='" + groupName + '\'' +
                ", courses=" + Arrays.toString(courses) +
                '}';
    }

    public String getFullName() {
        return fullName;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getGroupName() {
        return groupName;
    }

    public void setGroupName(int groupName) {
        this.groupName = groupName;
    }

    public CourseScore[] getCourses() {
        return courses;
    }

    public void setCourses(CourseScore[] courses) {
        this.courses = courses;
    }

    public Student(String fullName, int age, int groupName, CourseScore[] courses) {
        this.fullName = fullName;
        this.age = age;
        this.groupName = groupName;
        this.courses = courses;
    }

    public Student(String fullName, int age, int groupName) {
        this(fullName, age, groupName, new CourseScore[100]);
    }

}
