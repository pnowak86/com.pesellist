package com.pesellist;



/**
 * Created by RENT on 2017-05-25.
 */
public class Pesel {
    private Object data;
    private Pesel next;

    public void setNext(Pesel next) {
        this.next = next;
    }

    public Pesel getNext() {
        return this.next;
    }

    public Object getData() {
        return this.data;
    }

    public Pesel(Object data) {
        this.data = data;
    }
}
