package de.telran.javastart.Lessons.lesson16MyArrayList;

// ДЗ:
// 2. Дописать класс MyCustomArrayList - реализовать все оставшиеся операции.


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

    }

    @Override
    public int get(int index) {
        return 0;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public void append(int value) {
        // size
        // data.length
        if (size == data.length) {
            increaseCapacity();
        }
        data[size++] = value;
        //size++;
    }

    @Override
    public void append(int[] a) {

    }

    @Override
    public void insert(int index, int value) {

    }

    @Override
    public void delete(int index) {

    }

    @Override
    public boolean contains(int value) {
        return false;
    }

    private void increaseCapacity() {
        int[] newData = new int[data.length * 2];
        for (int i = 0; i < data.length; i++) {
            newData[i] = data[i];
        }
        data = newData;
    }
}
