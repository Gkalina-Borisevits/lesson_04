package lesson_04.homework;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = 0;

        testingExceptions(n, scanner);
    }
        // Запросить значение n у пользователя.
        // Вызвать метод и передать туда значение, полученное от пользователя.
        // Посмотреть, какие ошибки возможны в данном коде и для каждой
        // ошибки создать пользовательское исключение.
        // Выбросить эти исключения в нужное время и обработать их в main.


    public static void testingExceptions(int n, Scanner scanner) {
        System.out.print("Введите целочисленный делитель: ");
        try {
            n = Integer.parseInt(scanner.nextLine());
            System.out.print("Вы ввели: " + n);
            System.out.println();

            int x = 10 / n;
            System.out.println(x);

            int[] array = new int[n];
            System.out.println(array.length);
            System.out.println(array[n]);

        } catch (ArithmeticException e) {
            System.err.println("Деление на ноль: " + e.getMessage());
        } catch (NegativeArraySizeException e) {
            System.err.println("Отрицательный размер массива: " + e.getMessage());
        } catch (ArrayIndexOutOfBoundsException e) {
            System.err.println("Выход за пределы массива: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.err.println("Некорректное ввод числа: " + e.getMessage());
        }
    }
}

