package EducationSystem;

import java.util.Random;

public class CourseGenerator {
    private String[] name = {
            "Математика",
            "Физика",
            "Биология",
            "Английский",
            "История",
            "Химия"
    };
    private Random random;

    public CourseGenerator() {
        this.random = new Random();
    }

    public Course[] getCourses(int n) {
        Course[] courses = new Course[n];
        if(n > courses.length){
            throw new IllegalStateException("Can't generate courses.Not enough names");
        }
        for (int i = 0; i < n; i++) {
            courses[i] = getCourse(i);
        }
        return courses;
    }

    private Course getCourse(int i) {
        return new Course(name[i],random.nextInt(150),
                null,null);
    }




}
