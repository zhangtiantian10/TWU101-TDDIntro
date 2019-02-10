package com.thoughtworks.tddintro.exercises.factorial;

public class Factorial {
    public Integer compute(int i) {
        if (i < 0) {
            throw new IllegalArgumentException();
        } else if (i == 1 || i == 0) {
            return 1;
        } else {
            return i * (i - 1);
        }
    }
}
