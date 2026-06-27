package com.example;

public class Calculator {
    private int result = 0;

    public void add(int number) {
        result += number;
    }

    public void subtract(int number) {
        result -= number;
    }

    public int getResult() {
        return result;
    }

    public void clear() {
        result = 0;
    }
}
