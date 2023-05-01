package third_modul.eighth;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void printStudentInfo(Student student) {
        System.out.print("Имя: " + student.getName());
        student.getAddress().ifPresentOrElse(p -> System.out.println(". Ардес: " + p.getRegion() + ", " + p.getCity() + "."), () -> System.out.println("."));
    }
    public static void main(String[] args) {
        System.out.println("Задание 1\n-------------------------------------------");

        List<Student> students = new ArrayList<>();
        students.add(new Student("Матвей", new Address("Москва", "Россия")));
        students.add(new Student("Иван", new Address("Париж", "Франция")));
        students.add(new Student("Акбар"));
        students.add(new Student("Олег", new Address("Киев", "Украина")));
        students.add(new Student("Карим"));
        students.add(new Student("Николай"));
        for (int i = 0; i < students.size(); i++) {
            printStudentInfo(students.get(i));
        }

        System.out.println("-------------------------------------------\n\n\n");


        System.out.println("Задание 2\n-------------------------------------------");

        List<String> words = List.of("С", "помощью", "StreamAPI", "и", "метода", "reduce", "объедините", "слова", "в", "предложение");
        String sentence = words.stream().reduce((a, b) -> a + " " + b).get();
        System.out.println("Элементы списка: " + words);
        System.out.println("Полученное предложение: " + sentence);
        System.out.println("-------------------------------------------");
    }
}
