package com.example.lab1;

import androidx.annotation.NonNull;

public class Pair<F, S>{
    private F first;
    private S second;

    public Pair(F first, S second) {
        this.first = first;
        this.second = second;
    }

    public void setFirst(F first) {
        this.first = first;
    }
    public void setSecond(S second) {
        this.second = second;
    }

    public boolean firstIsNull() {
        return first == null;
    }
    public boolean secondIsNull() {
        return second == null;
    }

    public F getFirst() {
        return first;
    }
    public S getSecond() {
        return second;
    }

    @NonNull
    @Override
    public String toString() {
        return "Tuple(first=" + first + ", second=" + second + ")";
    }
}
