package EducationSystem;

import java.util.Random;

public class StudentAuthoMatcher {
    Random random = new Random();

    public StudentAuthoMatcher() {
        this.random = new Random();
    }
    public void autoMatch(Course[] courses, Student[] students){
        for (Course course: courses) {
          course.setStudent(students[random.nextInt(students.length)]);
          if(course.getStudent().getCourses() == null){
              Course[] courseListToSet = new Course[courses.length];
              courseListToSet[0] = course;
              course.getStudent().setCourse(courseListToSet);
          }else{
              Course[] courseArray = course.getStudent().getCourse();
              boolean wasSet = false;
              for(int i = 0; i<courseArray.length; i++){
                  if (courseArray[i] == null) {
                      //добавляем курс
                      courseArray[i] = course;
                      //меняем флаг
                      wasSet = true;
                      break;
                  }
              }
              //если курс не был добавлен в лист - значит позиций в листе не хватает
              if (!wasSet) {
                  //создаём лист размером в двое больше чем предыдущий чтобы теперь точно поместилось
                  Course[] extendedCourseList = getExtendedCourseList(courseArray);
                  //добавляем в новом массиве на первую свободную позицию курс, которому мы сейчас проставили преподавателя
                  extendedCourseList[courseArray.length] = course;
                  //устанавливаем новый лист курсов преподавателю
                  course.getTutor().setCourses(extendedCourseList);
              }
              }
          }


        }

    private Course[] getExtendedCourseList(Course[] courseArray) {
        Course[] resultExtendedCourseList = new Course[courseArray.length * 2];
        //при создании копируем все значения из предыдущего списка в новый
        for (int i = 0; i < courseArray.length; i++) {
            resultExtendedCourseList[i] = courseArray[i];
        }
        return resultExtendedCourseList;
    }
    }


