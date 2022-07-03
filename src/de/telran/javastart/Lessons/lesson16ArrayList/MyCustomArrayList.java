package de.telran.javastart.Lessons.lesson16ArrayList;

// ДЗ:
// Дописать класс MyCustomArrayList - реализовать все оставшиеся операции.

public class MyCustomArrayList implements AdvancedArrayList {
    private static final int INITIAL_CAPACITY = 4;
    private int[] data;
    private int size = 0;  // "видимый" для пользователя размер массива

    // Конструктор
    public MyCustomArrayList() {
        data = new int[INITIAL_CAPACITY];
    }

    // Методы
    @Override
    public void set(int index, int value) {
        data[index] = value;
    }

    // Как сделать так, чтобы метод get работал только для имеющихся в массиве элементов?
    @Override
    public int get(int index) {
        if (index >= size()) {
            System.out.println("Элемент с таким индексом отсутствует в массиве, введите другой индекс");
        }
        return data[index];
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public void append(int value) {
        if (size == data.length) {
            increaseCapacity();
        }
        data[size++] = value;
    }

    @Override
    public void append(int[] a) {
        int[] newData = new int[data.length + a.length];
        if (size == data.length + a.length) {
            increaseCapacity();
        }
        size = data.length + a.length;
        for (int i = 0; i < data.length; i++) {
            newData[i] = data[i];
        }
        for (int i = 0; i < a.length; i++) {
            newData[data.length + i] = a[i];
        }
        data = newData;
    }

    @Override
    public void insert(int index, int value) {
        int[] newData = new int[data.length + 1];
        if (size == data.length) {
            increaseCapacity();
        }

        for (int i = 0; i < index; i++) {
            newData[i] = data[i];
        }
        newData[index] = value;
        for (int i = index + 1; i < newData.length; i++) {
            newData[i] = data[i - 1];
        }
        data = newData;
        size++;
    }

    @Override
    public void delete(int index) {
        int[] newData = new int[data.length - 1];
        for (int i = 0; i < index; i++) {
            newData[i] = data[i];
        }
        for (int i = index + 1; i < data.length; i++) {
            newData[i - 1] = data[i];
        }
        data = newData;
        size--;
    }

    @Override
    public boolean contains(int value) {
        for (int i : data) {
            if (i == value) {
                return true;
            }
        }
        return false;
    }

    private void increaseCapacity() {
        int[] newData = new int[data.length * 2];
        for (int i = 0; i < data.length; i++) {
            newData[i] = data[i];
        }
        data = newData;
    }

    public void printArray() {
        System.out.print("[");
        for (int i = 0; i < size; i++) {
            if (i != size - 1) {
                System.out.print(data[i] + ", ");
            } else {
                System.out.print(data[i]);
            }
        }
        System.out.print("]");
        System.out.println();
    }
}