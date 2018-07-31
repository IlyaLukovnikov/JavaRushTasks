package com.javarush.task.task05.task0531;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Совершенствуем функциональность
*/

public class Solution {

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int x1 = Integer.parseInt(reader.readLine());
        int x2 = Integer.parseInt(reader.readLine());
        int x3 = Integer.parseInt(reader.readLine());
        int x4 = Integer.parseInt(reader.readLine());
        int x5 = Integer.parseInt(reader.readLine());

        int minimum = min(x1, x2, x3, x4, x5);

        System.out.println("Minimum = " + minimum);
    }


    public static int min(int x1, int x2, int x3, int x4, int x5) {
        int[] array = new int[] {x1, x2, x3, x4, x5};
        int min = array[0];
        for (int i = 1; i < 5; i++) {
             if (array[i] < min)
                 min = array[i];
        }
        return min;
    }
}
