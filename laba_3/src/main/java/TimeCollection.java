import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Класс, реализующий измерение производительности коллекции.
 */
public class TimeCollection {
    /**
     * Количество вызовов метода.
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
     * Выводит в консоль результат измерений при использовании указанного метода.
     * @param colllection имя коллекции
     * @param result результат в мс для коллекции
     * @param method название метода
     */
    private void showResult(String colllection ,long result, String method) {
        System.out.println(colllection + ", метод " + method + ": " + result + "ms" + "\n");
    }

    /**
     * Заполняет указанную коллекцию значениями.
     * @param collection коллекция
     */
    private void fillCollection(List<Integer> collection) {
        for (int i = 0; i < numberOfCalls; i++) {
            collection.add(0, i);
        }
    }

    /**
     * Реализует метод get() для указанной коллекции.
     * @param collection коллекция
     * @param position позиция, из котороый будут извлекаться значения
     */
    private void getElementFromCollection(List<Integer> collection, int position) {
        for (int i = 0; i < numberOfCalls; i++) {
            collection.get(position);
        }
    }

    /**
     * Измерение производительности для метода add().
     * @param collection коллекция
     * @param collectionName имя коллекции
     */
    public void addMethod(List<Integer> collection, String collectionName) {
        startTimeUpdate();
        fillCollection(collection);
        long endTime = System.currentTimeMillis();
        showResult(collectionName,endTime - startTime, "add()");
    }

    /**
     * Измерение производительности для метода delete() из начала коллекции.
     * @param collection коллекция
     * @param collectionName имя коллекции
     */
    public void deleteBeginMethod(List<Integer> collection, String collectionName) {
        fillCollection(collection);
        startTimeUpdate();
        for (int i = 0; i < numberOfCalls; i++) {
            collection.remove(0);
        }
        long endTime = System.currentTimeMillis();
        showResult(collectionName, endTime - startTime, "delete() из начала");
    }

    /**
     * Измерение производительности для метода get() из конца коллекции.
     * @param collection коллекция
     * @param collectionName имя коллекции
     */
    public void getEndMethod(List<Integer> collection, String collectionName) {
        fillCollection(collection);
        startTimeUpdate();
        getElementFromCollection(collection,collection.size() - 1);
        long endTime = System.currentTimeMillis();
        showResult(collectionName, endTime - startTime, "get() из конца");
    }

    /**
     * Измерение производительности для метода get() из середины коллекции.
     * @param collection коллекция
     * @param collectionName имя коллекции
     */
    public void getMidMethod(List<Integer> collection, String collectionName) {
        fillCollection(collection);
        startTimeUpdate();
        getElementFromCollection(collection,collection.size() / 2);
        long endTime = System.currentTimeMillis();
        showResult(collectionName, endTime - startTime, "get() из середины");
    }

    /**
     * Измерение производительности для метода replaceAll().
     * @param collection коллекция
     * @param collectionName имя коллекции
     */
    public void replaceAllMethod(List<Integer> collection, String collectionName) {
        fillCollection(collection);
        startTimeUpdate();
        collection.replaceAll(element -> - element);
        long endTime = System.currentTimeMillis();
        showResult(collectionName, endTime - startTime, "replaceAll()");
    }

    /**
     * Измерение производительности для метода size().
     * @param collection коллекция
     * @param collectionName имя коллекции
     */
    public void sizeMethod(List<Integer> collection, String collectionName) {
        fillCollection(collection);
        startTimeUpdate();
        collection.size();
        long endTime = System.currentTimeMillis();
        showResult(collectionName, endTime - startTime, "size()");
    }
}
