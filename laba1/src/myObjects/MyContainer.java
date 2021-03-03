package myObjects;

public class MyContainer {
    private final int initSize = 10;
    private int[] numbers = new int[initSize];
    private int lastIndex = 0;

    /**
     * Получение размера контейнера.
     * @return возвращает размер контейнера
     */
    public int size() {
        return lastIndex;
    }

    /**
     * Получение элемента контейнера по индексу.
     * @param index индекс
     * @return возвращает элемент с указанным индексом
     */
    public int get(int index) {
        return numbers[index];
    }

    /**
     * Определяет, содержит ли контейнер указанный элемент.
     * @param element элемент
     * @return true/false в зависимости от наличия элемента в контейнере
     */
    public boolean includes(int element) {
        for (int num: numbers) {
            if (num == element) {
                return true;
            }
        }
        return false;
    }

    /**
     * Добавление указанного элемента в конец контейнера.
     * @param element элемент
     */
    public void add(int element) {
        if (numbers.length - 1 >= lastIndex) {
            resize(numbers.length + initSize);
        }
        numbers[lastIndex++] = element;
    }

    /**
     * Увеличение размера контейнера.
     * @param newSize новый размер
     */
    private void resize(int newSize) {
        int[] newNumbers = new int[newSize];
        System.arraycopy(numbers, 0, newNumbers, 0, newSize);
        numbers = newNumbers;
    }
}
