package de.telran.javastart.lesson16.ArrayList;

public class AppArrayList {
    public static void main(String[] args) {
        MyArrayList myArrayList1 = new MyArrayList(5);
        //myArrayList1.set(1, 1);
        //myArrayList1.set(2, 2);
        //myArrayList1.set(3, 3);
        //myArrayList1.set(4, 4);
        //myArrayList1.printArray();
        //System.out.println("Array size: " + myArrayList1.size());
        //System.out.println(myArrayList1.get(1));
        //myArrayList1.append(33);
        //myArrayList1.printArray();
        //System.out.println(myArrayList1.contains(33));
        System.out.println("--------------------");

        int[] array2 = new int[]{1, 2, 3};
        MyArrayList myArrayList2 = new MyArrayList(array2);
        //myArrayList2.set(2, 55);
        //myArrayList2.printArray();
        //System.out.println("Array size: " + myArrayList2.size());
        //System.out.println(myArrayList2.get(2));
        //myArrayList2.append(44);
        //myArrayList2.printArray();
        //System.out.println(myArrayList2.contains(33));
        //System.out.println("--------------------");

        //myArrayList1.append(array2);
        //myArrayList1.printArray();

        MyCustomArrayList myCAL1 = new MyCustomArrayList();
        myCAL1.printArray();
        myCAL1.append(10);
        myCAL1.append(11);
        myCAL1.append(12);
        myCAL1.append(13);
        myCAL1.printArray();
        System.out.println(myCAL1.get(1));
        System.out.println(myCAL1.size());

        System.out.println("--------------------");
        myCAL1.set(1, 99);
        myCAL1.printArray();

        System.out.println("--------------------");
        myCAL1.append(new int[]{1, 2, 3});
        myCAL1.printArray();
        System.out.println(myCAL1.contains(0));
        myCAL1.insert(1, 98);
        myCAL1.printArray();
        myCAL1.delete(2);
        myCAL1.printArray();
        myCAL1.delete(1);
        myCAL1.printArray();
        myCAL1.delete(3);
        myCAL1.printArray();
        myCAL1.delete(3);
        myCAL1.printArray();
        myCAL1.delete(3);
        myCAL1.printArray();
        myCAL1.insert(1, 11);
        myCAL1.printArray();

        System.out.println("--------------------");
        MyCustomArrayList l= new MyCustomArrayList();
        l.append(1);
        l.append(2);
        l.append(3);
        l.printArray();
        l.delete(1);
        l.printArray();

        System.out.println("--------------------");
        int [] a = new int[]{11,12,13,14,15,16,17,18,19,20};
        l.append(a);
        l.printArray();
    }
}
