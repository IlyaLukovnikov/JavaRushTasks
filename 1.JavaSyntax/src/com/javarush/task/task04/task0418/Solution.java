package com.javarush.task.task04.task0418;

/* 
Минимум двух чисел
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String a1 = reader.readLine();
        String a2 = reader.readLine();

        int number1 = Integer.parseInt(a1);
        int number2 = Integer.parseInt(a2);

        minNumber(number1, number2);
    }
    private static void minNumber(int a, int b) {
        if( a <= b)
            System.out.println(a);
        else
            System.out.println(b);
    }
}