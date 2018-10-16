package com.morronel.collections;

public interface MyList<T> extends MyCollection {

    void add(T t);
    T get(int index);
    void remove(int index);

}
