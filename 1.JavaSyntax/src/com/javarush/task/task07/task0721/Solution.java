package com.javarush.task.task07.task0721;

import com.sun.org.apache.regexp.internal.RE;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;

/* ж
Минимаксы в массивах
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] array = new int[20];
        for (int i = 0; i < array.length; i++) {
            array[i] = Integer.parseInt(reader.readLine());
        }
        int maximum = array[0];
        int minimum = array[0];
        for (int i = 1, j = 1; i < array.length && j < array.length; i++, j++) {
            if (maximum < array[i]) maximum = array[i];
            if (minimum > array[j]) minimum = array[j];
        }
        //напишите тут ваш код

        System.out.print(maximum + " ");
        System.out.print(minimum);
    }
}
