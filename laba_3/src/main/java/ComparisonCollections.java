import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Класс, реализующий сравнение производительности ArrayList и LinkedList.
 */
public class ComparisonCollections {
    /**
     * Количество вызовов сравниваемых методов коллекций.
     */
    private final int numberOfCalls = 70000;
    /**
     * Стартовое время.
     */
    private long startTime;

    /**
     * Обновляет время старта измерений.
     */
    private void startTimeUpdate() {
        startTime = System.currentTimeMillis();
    }

    /**
     * Выводит в консоль результат сравнения времени при использовании указанного метода.
     * @param resultAl результат в мс для ArrayList
     * @param resultLl результат в мс для LinkedList
     * @param method название метода
     */
    private void showResult(long resultAl, long resultLl, String method) {
        System.out.println("Метод " + method + ":\n"
                + "ArrayList " + resultAl + "ms" + "\n"
                + "LinkedList " + resultLl + "ms" + "\n");
    }

    /**
     * Сравнение производительности метода add() ArrayList и LinkedList.
     */
    public void compareAddMethod() {
        List<Integer> arrayList = new ArrayList<>();
        List<Integer> linkedList = new LinkedList<>();

        startTimeUpdate();
        for (int i = 0; i < numberOfCalls; i++) {
            arrayList.add(0, i);
        }
        long endTime = System.currentTimeMillis();
        long resultAl = endTime - startTime;

        startTimeUpdate();
        for (int i = 0; i < numberOfCalls; i++) {
            linkedList.add(0, i);
        }
        endTime = System.currentTimeMillis();

        showResult(resultAl, endTime - startTime, "add()");
    }
}
