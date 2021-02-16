public class Main {

    public static void main(String[] args) {
      TutorGenerator tutorGenerator = new TutorGenerator();
        StudentGenerator studentGenerator = new StudentGenerator();
    CourseGenerator courseGenerator = new CourseGenerator();
      Tutor[] tutors = tutorGenerator.getTutors(20);
      Course[] courses = courseGenerator.getCourses(6);
       Student[] students = studentGenerator.getStudents(20);
        CoursePrinter coursePrinter = new CoursePrinter();
        TutorPrinter tutorPrinter = new TutorPrinter();
        StudentPrinter studentPrinter = new StudentPrinter();
        System.out.println("___________________________________________________________________");
         tutorPrinter.printTutors(tutors, 3);
      coursePrinter.printCourses(courses, 3);

      studentPrinter.printStudents(students, 3);

        CourseTutorAutoMatcher courseTutorAutoMatcher = new CourseTutorAutoMatcher();

        courseTutorAutoMatcher.autoMatch(courses, tutors);
        System.out.println("___________________________________________________________________");

       tutorPrinter.printTutors(tutors, 3);
        System.out.println("___________________________________________________________________");
     //  coursePrinter.printCourses(courses, 3);
    }
}
