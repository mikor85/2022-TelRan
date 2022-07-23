package de.telran.javastart.lesson15;

public class AdvancedIntArray {
    private int[] source;

    // конструктор с целым числом элементов
    public AdvancedIntArray(int numberOfElements) {
        source = new int[numberOfElements];
    }

    public int get(int index) {
        return source[index];
    }

    public void set(int index, int value) {
        source[index] = value;
    }

    public int size() {
        return source.length;
    }

    public void append(int value) {
        //int [] newSource = new int[size() + 1];
        int[] newSource = new int[source.length + 1];

        for (int i = 0; i < source.length; i++) {
            newSource[i] = source[i];
        }
        newSource[size()] = value;
        source = newSource;
    }

    // расширить массив на 1 и вставить значение в указанный индекс
    public void insert(int index, int value) {
        int[] newSource = new int[source.length + 1];
        for (int i = 0; i < index; i++) {
            newSource[i] = source[i];
        }
        newSource[index] = value;
        for (int i = index + 1; i < newSource.length; i++) {
            newSource[i] = source[i - 1];
        }
        source = newSource;
    }

    // удаляет элемент под указанным номером и сдвигает весь массив влево
    public void delete(int index) {
        int[] newSource = new int[source.length - 1];
        for (int i = 0; i < index; i++) {
            newSource[i] = source[i];
        }
        for (int i = index + 1; i < source.length; i++) {
            newSource[i - 1] = source[i];
        }
        source = newSource;
    }

    // ищет в массиве значение, если есть - true, если нет - false
    public boolean contains(int value) {
//        for (int i = 0; i < source.length; i++) {
//            if (source[i] == value) {
//                return true;
//            }
//        }

        for (int i : source) {  // вариант массива, когда в оператор передается значение элемента
            if (i == value) {
                return true;
            }
        }

        return false;
    }
}
