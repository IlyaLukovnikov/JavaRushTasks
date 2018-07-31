package com.javarush.task.task07.task0706;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Улицы и дома
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] array = new int[15];

        for (int i = 0; i < array.length; i++) {
            array[i] = Integer.parseInt(reader.readLine());
        }

        int sumChet = 0;
        int sumNeChet = 0;

        for (int i = 0, j = 1; i < array.length && j < array.length; i = i + 2, j = j + 2) {
            sumChet += array[i];
            sumNeChet += array[j];
        }

        if (sumChet > sumNeChet){
            System.out.println("В домах с четными номерами проживает больше жителей.");
        }
        else
        {
            System.out.println("В домах с нечетными номерами проживает больше жителей.");
        }
    }
}