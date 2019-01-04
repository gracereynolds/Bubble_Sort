package com.company;

public class BubbleSort {
    public static void sort(int[] arr) {
        boolean sorted = false;
        int s;
        while(!sorted) {
            s = 0;
            for(int i = 0; i < arr.length - 1; i++) {
                if(arr[i] > arr[i+1]) {
                    SortUtil.swap(arr,i,i+1);
                    s++;
                }
            }
            if(s == 0) {
                sorted = true;
            }
        }
    }
}
