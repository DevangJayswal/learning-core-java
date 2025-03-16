package com.example.leetcode.forloop;

public class DemoForLoop {

    public static void main(String[] args) {

        // print number 1 to 5
        for (int i = 0; i < 5; i++) {
            System.out.println("i: " + i);
        }
        System.out.println("--------------------");

        // print number * for 5 times
        for (int i = 0; i < 5; i++) {
            System.out.println("*");
        }
        System.out.println("--------------------");

        for (int i = 0; i < 5; i++) {
            System.out.println("i: " + i);
            for (int j = 0; j < 5; j++) {
                System.out.print("j: " + j + " | ");
            }
            System.out.println();
            System.out.println();
        }
        System.out.println("--------------------");

        for (int i = 0; i < 5; i++) {
            System.out.println("i: " + i);
            for (int j = 0; j <= i; j++) {
                System.out.print("j: " + j + " | ");
            }
            System.out.println();
            System.out.println();
        }
        System.out.println("--------------------");

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
            System.out.println();
        }
        System.out.println("--------------------");

        for (int i = 4; i >= 0; i--) {
//            System.out.println("i: " + i);
            for (int j = 0; j <= i; j++) {
//                System.out.print("j: " + j + " | ");
                System.out.print("*");
            }
            System.out.println();
            System.out.println();
        }
        System.out.println("--------------------");

    }

}
