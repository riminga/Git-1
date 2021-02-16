import java.util.Arrays;

public class Course {
    private String name;
    private  int hours;
    private Tutor tutor;
    private Student[] students;


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


    public Student[] getStudent() {
        return students;
    }

    public void setStudent(Student[] student) {
        this.students = student;
    }

    public Course(String name, int hours, Tutor tutor, Student[] student) {
        this.name = name;
        this.hours = hours;
        this.tutor = tutor;
        this.students = student;
    }
    public Course (String name, int hours, Tutor tutor){
        this(name,hours,tutor,null);
    }
    public Course(String name, int hours){
        this(name, hours, null, null);
    }
    @Override
    public String  toString() {
        return "Course{" +
                "name='" + name + '\'' +
                ", hours=" + hours +
                ", tutor=" + tutor +
                ", students=" + Arrays.toString(students) +
                '}';
    }

    public String getStudentInfo() {
        if(students == null) return null;
        String result = "";
        for (Student student: students){
            if(student != null) {
                result += student.getFullName()+" "+ student.getAge()+ " "+ student.getGroupName();
            }
        }
        return result;
    }

}
