package lesson_04.task2;

public class ExceptionCauseTest {

    private static int[] array = {1, 2, 3, 4, 5};

    public static void main(String[] args) {

        try {
            System.out.println(getValueByIndex(2));
        } catch (IllegalArgumentException e) {
            System.out.println("Сщщбщение об ошибке -" + e.getMessage());
            System.out.println("Причина ошибки -" + e.getCause().getMessage());
        }
    }


    private static int getValueByIndex(int index) {
       try {
           return array[index];
       } catch (ArrayIndexOutOfBoundsException e) {
           throw new IllegalArgumentException("Некорректный индекс!", e);
       }
    }
}
