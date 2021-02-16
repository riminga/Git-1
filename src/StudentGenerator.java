import java.util.Random;

public class StudentGenerator {
    public static String[] names = {
         "Кулагина София" ,
          "Морозова Арина ",
           "Овсянникова Амина",
           "Зимин Никита",
           "Сорокина Анастасия ",
           "Зуев Матвей ",
            "Артамонов Лев ",
            "Измайлова София",
            "Корчагин Фёдор",
            "Савельева Майя ",
            "Королев Дмитрий ",
            "Добрынина Мария ",
            "Герасимов Максим",
            "Захаров Тимофей ",
            "Харитонов Кирилл",
            "Соловьев Иван ",
            "Демин Иван ",
            "Крылов Владимир",
            "Попов Артур ",
            "Попов Никита"
    };

    public static int[] groupNumber={
            417868, 421907, 443814, 424778, 418936, 448710, 433052, 404152, 439048, 401419
    };
    private Random random;





    public StudentGenerator() {
        this.random =  new Random();
    }

    public Student[] getStudents(int n){
        Student[] students = new Student[n];
        for(int i =0; i<n ;i++){
            students[i] = getStudent();
        }
        return students;
    }
    public Student getStudent(){
        return new Student(names[random.nextInt(20)],
                18,groupNumber[random.nextInt(10)]);
    }
}
