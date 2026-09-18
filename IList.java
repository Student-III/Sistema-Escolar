
package com.mycompany.sistemaescolar;


public interface IList<t> {
    void add(t t);
    void add(t t, int index);
    t remove(int index);
    t get(int index);
    int size();
    void clear();
    boolean isEmpty();
}
