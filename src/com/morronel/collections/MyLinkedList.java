package com.morronel.collections;

public class MyLinkedList<T> implements MyList<T> {

    private int size;
    private MyNode<T> lastNode;

    public MyLinkedList() {
        size = 0;
    }

    @Override
    public void add(T t) {
        MyNode<T> newNode = new MyNode<T>(t);

        size++;
    }

    @Override
    public T get(int index) {
        return null;
    }

    @Override
    public void remove(int index) {

    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

}
