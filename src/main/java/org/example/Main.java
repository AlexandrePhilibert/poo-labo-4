package org.example;

public class Main {
    public static void main(String[] args) {
        int[] values = new int[args.length];

        for (int i = 0; i < args.length; ++i) {
            values[i] = parseInt(args[i]);
        }

        bubbleSort(values);

        for (int v : values) {
            System.out.println(v);
        }
    }

    private static int parseInt(String s) {
        int value = 0;
        boolean negative = s.charAt(0) == '-';

        for (int i = negative ? 1 : 0; i < s.length(); ++i) {
            if (s.charAt(i) < '0' || s.charAt(i) > '9') {
                throw new IllegalArgumentException("Oops");
            } else {
                value = value * 10 + s.charAt(i) - '0';
            }
        }

        return negative ? -value : value;
    }

    private static void bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length; ++i) {
            for (int j = 0; j < arr.length; ++j) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
}