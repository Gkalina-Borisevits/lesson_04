package lesson_04.task1;

import java.util.Scanner;

public class UserInputTest {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите имя: ");
        String name = scanner.nextLine();

        System.out.println("Введите возраст: ");
        int age;

        try {
            age = Integer.parseInt(scanner.nextLine());
        } catch (Exception e) {

            System.out.println("Некорректные данные! Значение возраста по умолчанию принято 0");
            age = 0;
            e.printStackTrace();
            System.out.println("Причина ошибки - " + e.getCause());
            System.out.println("Сообщение об ошибке -" + e.getMessage());
            System.out.println("Пользователем внесены следующие некорректные данные: - " + e.getMessage().split("")[3]);
        }


        System.out.printf("Имя - %s, возраст - %d.\n", name, age);
        System.out.println("Работа программы завершена успешно");
    }
}
