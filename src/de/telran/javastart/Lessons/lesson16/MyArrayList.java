package de.telran.javastart.Lessons.lesson16;

public class MyArrayList implements AdvancedArrayList {

    // Поля
    private int[] source;


    // Конструкторы
    public MyArrayList(int initialSize) {
        source = new int[initialSize];
    }

    public MyArrayList(int[] array) {
        //TODO
        source = array;
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
        return 0;
    }

    @Override
    public void append(int value) {

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
}
