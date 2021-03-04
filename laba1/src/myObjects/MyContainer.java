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
     * Возвращает индекс первого вхождения элемента в контейнер.
     * Если объект не найден, то возвращается -1.
     * @param element элемент
     * @return индекс
     */
    public int indexOf(int element) {
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == element) {
                return i;
            }
        }
        return -1;
    }

    /**
     * Добавление указанного элемента в конец контейнера.
     * @param element элемент
     */
    public void add(int element) {
        if (numbers.length - 1 == lastIndex) {
            resize(numbers.length + initSize);
        }
        numbers[lastIndex++] = element;
    }

    /**
     * Удаляет указанный элемент из контейнера.
     * @param element элемент
     */
    public void remove(int element) {
        for (int i = 0; i < numbers.length; i++)
        {
            if (numbers[i] == element)
            {
                int[] newNumbers = new int[numbers.length - 1];
                System.arraycopy(numbers, 0, newNumbers, 0, i);
                System.arraycopy(numbers, i + 1, newNumbers, i, numbers.length - 1 - i);
                numbers = newNumbers;
                lastIndex--;
                return;
            }
        }
    }

    /**
     * Увеличение размера контейнера.
     * @param newSize новый размер
     */
    private void resize(int newSize) {
        int[] newNumbers = new int[newSize];
        System.arraycopy(numbers, 0, newNumbers, 0, numbers.length);
        numbers = newNumbers;
    }
}
