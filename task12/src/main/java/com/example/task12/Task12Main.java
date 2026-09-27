package com.example.task12;

public class Task12Main {
    public static void main(String[] args) {
        int[] arr = {9, 11, 7, 8};
        selectionSort(arr);
        System.out.println(java.util.Arrays.toString(arr));
    }

    static void selectionSort(int[] arr) {
        if (arr == null || arr.length < 2) {
            return;
        }
        for (int c = 0; c < arr.length-1; c++) {
            int minIndex = c;
            for (int i = c+1; i < arr.length; i++) {
                if (arr[i] < arr[minIndex]) {
                    minIndex = i;
                }
            }
            int temp = arr[c];
            arr[c] = arr[minIndex];
            arr[minIndex] = temp;
        }


    }

}