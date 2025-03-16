package com.example.leetcode.forloop;

public class Demo {

    public static void main(String[] args) {

        for (int i = 1; i <= 5; i++) {
            System.out.println("i: " + i); // println (i)
            for (int j = 1; j <= i; j++) {
                System.out.print("j: " + j + " | "); // println (j)
//                System.out.print("*"); // println (j)
            }
            System.out.println(); // new line
        }
    }

    // if (a<b){}
    // if (a<=b){}
    // if (a>b){}
    // if (a>=b){}
    // if (a==b){}


}
