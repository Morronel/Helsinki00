package com.morronel.collections;

public class MyLinkedList<T> implements MyList<T> {

    private int size;
    private MyNode<T> lastNode;
    private MyNode<T> firstNode;

    public MyLinkedList() {
        size = 0;
    }

    @Override
    public void add(T t) {
        MyNode<T> newNode = new MyNode<T>(t);
        if (size == 0) {
            firstNode = newNode;
            lastNode = newNode;
        }
        lastNode.setNextNode(newNode);
        size++;
    }

    @Override
    public T get(int index) {

        MyNode<T> currentNode = firstNode;

        for (int i = 0; i <= index; i++) {
            currentNode = currentNode.getNextNode();
        }

        return currentNode.getData();
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
