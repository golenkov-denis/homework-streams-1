import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Составляем список чисел
        List<Integer> intList = Arrays.asList(1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4);

        // Создаем новый список для положительных чисел
        List<Integer> positiveNumbers = new ArrayList<>();
        for (Integer num : intList) {
            if (num > 0) {
                positiveNumbers.add(num);
            }
        }

        // Создаем новый список для четных чисел
        List<Integer> evenNumbers = new ArrayList<>();
        for (Integer num : positiveNumbers) {
            if (num % 2 == 0) {
                evenNumbers.add(num);
            }
        }

        // Сортируем список четных чисел
        evenNumbers.sort(Integer::compareTo);

        // Выводим результат
        for (Integer num : evenNumbers) {
            System.out.print(num + " ");
        }
    }
}