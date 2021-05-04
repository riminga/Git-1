package EducationSystem;

import java.util.Random;

public class TutorGenerator {
    public static String[] name = {
            "Никита Матвеев",
            "Евгений Степанов",
            "Вера Романова",
            "София Новикова",
            "София Савина",
            "Илья Никулин",
            "Ольга Лебедева",
            "Алёна Емельянова",
            "Анна Васильева",
            "Святослав Зубков",
            "Руслан Кочетков",
            "Матвей Григорьев",
            "Арина Давыдова",
            "Ярослав Наумов",
            "Екатерина Софронова",
            "Кира Петрова",
            "Вера Ермолова",
            "Михаил Елисеев",
            "Павел Смирнов",
            "Иван Петров",
            "Иван Усов",
            "Таисия Федорова",
            "Тимур Антонов",
            "Ярослав Фролов",
            "Полина Мартынова",
            "Владимир Куликов",
            "Ангелина Данилова",
            "Анна Муравьева",
            "Ангелина Бирюкова",
            "Анна Денисова",
            "Илья Богомолов",
            "Михаил Иванов",
            "Софья Михайло"};
    private Random random;

    public TutorGenerator() {
        this.random = new Random();
    }

    public Tutor[] getTutors(int n) {
        Tutor[] tutors = new Tutor[n];
        for (int i = 0; i < n; i++) {
            tutors[i] = getTutors();
        }
        return tutors;
    }

    private Tutor getTutors() {
        return new Tutor(name[random.nextInt(20)],21 + random.nextInt(40),
                15000 + (15000-15000) * random.nextDouble());
    }



}
