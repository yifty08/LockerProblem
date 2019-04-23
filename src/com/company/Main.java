package com.company;

public class Main {

    public static void main(String[] args) {
        boolean[] arr = new boolean[100];

        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j += (i+1)) {
                arr[j] = !arr[j];
            }
        }

        System.out.print("Lockers are remained opened: ");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]) {
                System.out.print((i+1) + " ");
            }
        }
    }
}
