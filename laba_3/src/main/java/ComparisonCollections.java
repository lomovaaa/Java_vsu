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
     * Заполняет указанную коллекцию значениями.
     * @param collection коллекция
     */
    private void fillCollection(List collection) {
        for (int i = 0; i < numberOfCalls; i++) {
            collection.add(0, i);
        }
    }

    /**
     * Реализует метод get() для указанной коллекции.
     * @param collection коллекция
     * @param position позиция, из котороый будут извлекаться значения
     */
    private void getElementFromCollection(List collection, int position) {
        for (int i = 0; i < numberOfCalls; i++) {
            collection.get(position);
        }
    }

    /**
     * Сравнение производительности метода add() ArrayList и LinkedList.
     */
    public void compareAddMethod() {
        ArrayList<Integer> arrayList = new ArrayList<>();
        LinkedList<Integer> linkedList = new LinkedList<>();

        startTimeUpdate();
        fillCollection(arrayList);
        long endTime = System.currentTimeMillis();
        long resultAl = endTime - startTime;

        startTimeUpdate();
        fillCollection(linkedList);
        endTime = System.currentTimeMillis();

        showResult(resultAl, endTime - startTime, "add()");
    }

    /**
     * Сравнение производительности метода delete() ArrayList и LinkedList.
     * Удаление элемента из начала коллекции.
     */
    public void compareDeleteBeginMethod() {
        ArrayList<Integer> arrayList = new ArrayList<>();
        fillCollection(arrayList);
        LinkedList<Integer> linkedList = new LinkedList<>();
        fillCollection(linkedList);

        startTimeUpdate();
        for (int i = 0; i < numberOfCalls; i++) {
            arrayList.remove(0);
        }
        long endTime = System.currentTimeMillis();
        long resultAl = endTime - startTime;

        startTimeUpdate();
        for (int i = 0; i < numberOfCalls; i++) {
            linkedList.remove(0);
        }
        endTime = System.currentTimeMillis();

        showResult(resultAl, endTime - startTime, "delete() из начала");
    }

    /**
     * Сравнение производительности метода get() ArrayList и LinkedList.
     * Получение элемента из конца.
     */
    public void compareGetEndMethod() {
        ArrayList<Integer> arrayList = new ArrayList<>();
        fillCollection(arrayList);
        LinkedList<Integer> linkedList = new LinkedList<>();
        fillCollection(linkedList);

        startTimeUpdate();
        getElementFromCollection(arrayList,arrayList.size() - 1);
        long endTime = System.currentTimeMillis();
        long resultAl = endTime - startTime;

        startTimeUpdate();
        getElementFromCollection(linkedList,linkedList.size() - 1);
        endTime = System.currentTimeMillis();

        showResult(resultAl, endTime - startTime, "get() из конца");
    }

    /**
     * Сравнение производительности метода get() ArrayList и LinkedList.
     * Получение элемента из середины.
     */
    public void compareGetMidMethod() {
        ArrayList<Integer> arrayList = new ArrayList<>();
        fillCollection(arrayList);
        LinkedList<Integer> linkedList = new LinkedList<>();
        fillCollection(linkedList);

        startTimeUpdate();
        getElementFromCollection(arrayList,arrayList.size() / 2);
        long endTime = System.currentTimeMillis();
        long resultAl = endTime - startTime;

        startTimeUpdate();
        getElementFromCollection(linkedList,linkedList.size() / 2);
        endTime = System.currentTimeMillis();

        showResult(resultAl, endTime - startTime, "get() из середины");
    }
}
