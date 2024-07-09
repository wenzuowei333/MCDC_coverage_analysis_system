package com.example;


public class SampleCode_v3 {
    public static void main(String[] args) {

        // Parse input arguments
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int c = Integer.parseInt(args[2]);
        int d = Integer.parseInt(args[3]);
        int e = Integer.parseInt(args[4]);
        int f = Integer.parseInt(args[5]);

        // Nested conditional statements
        if (a > 0) {
            if (b > 0) {
                if (c > 0) {
                    System.out.println("a, b, and c are all positive");
                } else if (c == 0) {
                    System.out.println("a and b are positive, c is zero");
                } else {
                    System.out.println("a and b are positive, c is negative");
                }
            } else if (b == 0) {
                if (c > 0) {
                    System.out.println("a is positive, b is zero, and c is positive");
                } else if (c == 0) {
                    System.out.println("a is positive, b and c are zero");
                } else {
                    System.out.println("a is positive, b is zero, and c is negative");
                }
            } else {
                if (c > 0) {
                    System.out.println("a is positive, b is negative, and c is positive");
                } else if (c == 0) {
                    System.out.println("a is positive, b is negative, and c is zero");
                } else {
                    System.out.println("a is positive, b and c are negative");
                }
            }
        } else if (a == 0) {
            System.out.println("a is zero");
        } else {
            System.out.println("a is negative");
        }

        // Switch-case with additional cases
        switch (d) {
            case 1:
                System.out.println("d is 1");
                break;
            case 2:
                System.out.println("d is 2");
                break;
            case 3:
                System.out.println("d is 3");
                break;
            default:
                System.out.println("d is not 1, 2, or 3");
        }

        // While loop with nested if-else
        while (e > 0) {
            if (e % 2 == 0) {
                System.out.println("e is positive and even, current value: " + e);
            } else {
                System.out.println("e is positive and odd, current value: " + e);
            }
            e--;
        }

        // Multiple nested while loops
        while (f > 0) {
            int g = f;
            while (g > 0) {
                System.out.println("Nested loop, f: " + f + ", g: " + g);
                g--;
            }
            f--;
        }

        // Complex logical operations
        if ((a > b && c < d) || (e > f && a != 0)) {
            System.out.println("Complex condition met");
        } else {
            System.out.println("Complex condition not met");
        }

    }
}
