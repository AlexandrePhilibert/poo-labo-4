package org.example;

public class Main {
    public static void main(String[] args) {
        int[] values = new int[args.length];

        for (int i = 0; i < args.length; ++i) {
            values[i] = parseInt(args[i]);
        }

        for (int v : values) {
            System.out.println(v);
        }
    }

    private static int parseInt(String s) {
        int value = 0;
        boolean negative = false;

        for (int i = 0; i < s.length(); ++i) {
            if (i == 0 && s.charAt(i) == '-') {
                negative = true;
            } else if (s.charAt(i) < '0' || s.charAt(i) > '9') {
                throw new IllegalArgumentException("Oops");
            } else {
                value = value * 10 + s.charAt(i) - '0';
            }
        }

        return negative ? -value : value;
    }
}