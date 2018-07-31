package com.javarush.task.task04.task0412;

/* 
Положительное и отрицательное число
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String  x = reader.readLine();
        int y = Integer.parseInt(x);
       // System.out.println(y);
        compair(y);
    }
      public static void compair(int a){
        if (a < 0)
            System.out.println(a + 1);
        if (a == 0)
            System.out.println(0);
        if (a > 0)
            System.out.println(a * 2);
        }
}