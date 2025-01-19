import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class StreamMain {
    public static void main(String[] args) {
        // Составляем список чисел
        List<Integer> intList = Arrays.asList(1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4);

        // Используем Stream API для фильтрации, сортировки и вывода
        intList.stream()
                .filter(x -> x > 0)                          // Оставляем только положительные числа
                .filter(x -> x % 2 == 0)                     // Оставляем только четные числа
                .sorted(Comparator.naturalOrder())           // Сортируем в порядке возрастания
                .forEach(x -> System.out.print(x + " "));    // Выводим результат
    }
}
