package com.meroapp.myapp.interest;


public class Interest {
    private int principal;
    private int time;
    private int rate;

    public Interest(int principal, int time, int rate) {
        this.principal = principal;
        this.time = time;
        this.rate = rate;
    }
    public int intrest(){
        return principal*rate*time/100;
    }
}

