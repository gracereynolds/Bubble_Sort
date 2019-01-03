package com.company;

public class Main {

    public static void main(String[] args) {
        int[] testArr = {8, 6, 7, 5, 3, 0, 9, 10, 1, 2, 3};
        System.out.println("Before: " + BubbleSort.toString(testArr));
        BubbleSort.sort(testArr);
        System.out.println("After:" + BubbleSort.toString(testArr));
    }
}
