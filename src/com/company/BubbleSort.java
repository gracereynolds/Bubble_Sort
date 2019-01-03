package com.company;

public class BubbleSort {
    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static void sort(int[] arr) {
        boolean sorted = false;
        int s;
        while(!sorted) {
            s = 0;
            for(int i = 0; i < arr.length - 1; i++) {
                if(arr[i] > arr[i+1]) {
                    swap(arr,i,i+1);
                    s++;
                }
            }
            if(s == 0) {
                sorted = true;
            }
        }
    }
    public static String toString(int[] arr) {
        String str = "";
        for(int i = 0; i < arr.length; i++) {
            str += arr[i];
            if(i < arr.length - 1) {
                str += ", ";
            }
        }
        return str;
    }
}
