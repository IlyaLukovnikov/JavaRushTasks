package com.javarush.task.task04.task0415;

/* 
Правило треугольника
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String aStr = reader.readLine();
        int a = Integer.parseInt(aStr);
        String bStr = reader.readLine();
        int b = Integer.parseInt(bStr);
        String cStr = reader.readLine();
        int c = Integer.parseInt(cStr);

        if ( a < (b + c) && b < (a + c) && c < (a + b))
            System.out.println("Треугольник существует.");
        else
            System.out.println("Треугольник не существует.");
    }
}