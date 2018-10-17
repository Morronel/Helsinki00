package com.morronel.collections;

public class MyNode<T> {

    private T data;
    private MyNode<T> nextNode;

    public MyNode(T t) {
        data = t;
    }

    public void setNextNode(MyNode<T> nextNode) {
        this.nextNode = nextNode;
    }

    public MyNode<T> getNextNode() {
        return nextNode;
    }

    public T getData() {
        return data;
    }

}
