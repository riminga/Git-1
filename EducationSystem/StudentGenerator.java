package EducationSystem;

import java.util.Random;

public class StudentGenerator {
    private String[] groupName ={
            "11-801",
            "11-802",
            "11-803",
            "11-804",
            "11-805",
            "11-806",

    };
    private String[] name = {
            "Лапшина Елизавета Руслановна",
            "Попова Варвара Артёмовна",
            "Абрамова Дарья Вадимовна",
            "Дементьева Дарья Платоновна",
            "Тимофеев Константин Богданович",
            "Маслова Ксения Кирилловна",
            "Шилов Мирон Васильевич",
            "Балашов Пётр Семёнович",
            "Осипов Глеб Савельевич",
            "Савельев Михаил Артёмович",
            "Потапова Полина Андреевна",
            "Зубков Артём Георгиевич",
            "Касьянов Вячеслав Всеволодович",
            "Колосова Варвара Ивановна",
            "Полякова Александра Всеволодовна",
            "Бочаров Артём Ярославович",
            "Коротков Александр Максимович",
            "Пономарев Дмитрий Даниилович",
            "Афанасьев Михаил Маркович",
            "Артемова Валерия Константиновна",
            "Коротков Александр Максимович"

    };


    private Random random;


    public StudentGenerator() {
        this.random = new Random();
    }



    public Student[] getStudents (int n){
       Student[] students = new Student[n];
       for (int i = 0; i<n; i++){
          students[i] = getStudent();
       }
       return students;
    }
    public  Student getStudent(){
        return new Student(name[random.nextInt(20)],18 + random.nextInt(2),groupName[random.nextInt(6)]);
    }
}
