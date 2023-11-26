package lesson_04.homework;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;
        try {
            System.out.print("Введите целочисленный делитель: ");
            number = Integer.parseInt(scanner.nextLine());
            System.out.print("Вы ввели: " + number);
            System.out.println();

            testingExceptions(number);
            } catch (DivisionByZero | NegativeArraySizeException | ArrayIndexException e) {
                System.out.println("Ошибка! - " + e.getMessage());

        } catch (NumberFormatException e) {
            System.out.println("Некорректный ввод числа: " + e.getMessage());
        }
    }
    // Запросить значение n у пользователя.
    // Вызвать метод и передать туда значение, полученное от пользователя.
    // Посмотреть, какие ошибки возможны в данном коде и для каждой
    // ошибки создать пользовательское исключение.
    // Выбросить эти исключения в нужное время и обработать их в main.


    public static void testingExceptions(int n) throws DivisionByZero, NegativeArraySizeException, ArrayIndexException {
         if (n == 0) {
            throw new DivisionByZero("На ноль нельзя делить");
        }
        int x = 10 / n;
        System.out.println(x);


        if (n < 0) {
            throw new NegativeArraySizeException("Отрицательный размер массива");
        }

        int[] array = new int[n];
        System.out.println(array.length);

        if (n >= array.length) {
            throw new ArrayIndexException("Выход за пределы массива");
        }
        System.out.println(array[n]);
    }
}
