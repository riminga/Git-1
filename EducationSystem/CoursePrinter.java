package EducationSystem;
public class CoursePrinter {

    public void printCourses(Course[] courses, int i) {

        switch (i) {
            case 1:
                for(Course course: courses){
                    printCourseInfo(course);
                }
                break;
            case 2:
                for(Course course: courses){
                    printInfoToStudent(course);

                }
                break;

            case 3:
                for (Course course: courses) {
                    printCoursesFullInfo(course);
                }
                break;
        }

    }

    private void printInfoToStudent(Course course) {
        System.out.println(course.getStudentInfo());
    }

    private void printCourseInfo(Course course) {
        System.out.printf("%10s|%10s\n", course.getHours(), course.getName());
    }

    public void printCoursesFullInfo(Course course) {
        System.out.println(course.toString()+" "+ course.getStudentInfo());
    }
}
