package EducationSystem;

public class Main {
     public static void main(String[] args) {
          TutorGenerator tutorGenerator = new TutorGenerator();
          CourseGenerator courseGenerator = new CourseGenerator();
          StudentGenerator studentGenerator = new StudentGenerator();
          Tutor[] tutors = tutorGenerator.getTutors(20);
          Course[] courses = courseGenerator.getCourses(6);
          Student[] students = studentGenerator.getStudents(20);
          StudentPrinter studentPrinter = new StudentPrinter();
          CoursePrinter coursePrinter = new CoursePrinter();
          TutorPrinter tutorPrinter = new TutorPrinter();
          CourseTutorAutoMatcher courseTutorAutoMatcher = new CourseTutorAutoMatcher();
          StudentAuthoMatcher studentAuthoMatcher = new StudentAuthoMatcher();
          System.out.println("___________________________________________________________________");
          courseTutorAutoMatcher.autoMatch(courses, tutors);
          studentAuthoMatcher.autoMatch(courses,students);
          System.out.println("___________________________________________________________________");
          tutorPrinter.printTutors(tutors, 3);
        //  coursePrinter.printCourses(courses, 3);
       //   System.out.println("___________________________________________________________________");
         // studentPrinter.printStudents(students,3);
        //  System.out.println("___________________________________________________________________");
        //  coursePrinter.printCourses(courses,1);
        //  System.out.println("___________________________________________________________________");
        //  coursePrinter.printCourses(courses,2);


     }


}
