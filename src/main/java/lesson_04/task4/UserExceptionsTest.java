package lesson_04.task4;

import java.util.Scanner;

public class UserExceptionsTest {

    public static void main(String[] args) {
        //имитируем регистрацию пользователя
        //запрашиваем у пользователя возраст
        //запрет регистрации младше 12 лет
        //запрет регистрации старше 150

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите возраст: ");
        int age = Integer.parseInt(scanner.nextLine());
        System.out.println("Введенный возраст - " + age);

        try{
            registration(age);
        } catch (TooBigAgeException | TooSmallAgeException e) {
            System.out.println("Ошибка! - " + e.getMessage());
        }
        System.out.println("Успешное завершение программы");


    }

    public static void registration(int age) throws TooBigAgeException{
        if (age < 12) {
            throw new TooSmallAgeException("Возраст не может быть менее 12 лет");
        }
        if (age > 150) {
            throw new TooBigAgeException("Возраст не может быть более 150 лет");
        }
        System.out.println("Регистрация успешна!");
    }
}
