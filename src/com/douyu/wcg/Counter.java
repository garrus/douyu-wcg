package com.douyu.wcg;

/**
 * A simple counter.
 *
 * Thread-unsafe.
 */
public class Counter {

    private static int nextId = 0;

    private String name;

    private int count;

    public Counter(){
        name = "Count#"+(Counter.nextId++);
    }

    public Counter(String name){
        this.name = name;
    }

    void count(){
        count++;
    }

    void add(int n){
        if (n > 0) {
            count += n;
        } else if (n < 0) {
            throw new RuntimeException("Argument #1 should be a positive integer.");
        }
    }

    public String toString(){
        return "[" + name + ": " + count + "]";
    }
}
