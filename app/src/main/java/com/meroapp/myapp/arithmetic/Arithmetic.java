package com.meroapp.myapp.arithmetic;

public class Arithmetic {
    private int first;
    private int second;

    public Arithmetic(int first, int second) {
        this.first = first;
        this.second = second;
    }
    public int add(){
        return first+second;
    }
    public int subtract(){
        return first-second;
    }

    public int getFirst() {
        return first;
    }

    public void setFirst(int first) {
        this.first = first;
    }

    public int getSecond() {
        return second;
    }

    public void setSecond(int second) {
        this.second = second;
    }
}
