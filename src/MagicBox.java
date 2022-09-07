import java.util.Random;

public class MagicBox<T> {

    private final int SIZE;

    private final T[] items;

    public MagicBox(int size) {
        this.SIZE = size;
        this.items = (T[]) new Object[SIZE];
    }

    public boolean add(T item) {
        for (int i = 0; i < SIZE; i++) {
            if (items[i] == null) {
                items[i] = item;
                return true;
            }
        }
        System.out.println("Мест для добавления нового элемента нет!");
        return false;
    }

    public T pick() {
        Random random = new Random();
        for (int i = 0; i < SIZE; i++) {
            if (items[i] == null) {
                throw new RuntimeException("Коробка не полна, осталось заполнить ячеек: " + (SIZE - (i)));
            }
        }
        return items[random.nextInt(SIZE)];
    }
}
