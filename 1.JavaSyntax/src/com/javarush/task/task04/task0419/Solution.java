package com.javarush.task.task04.task0419;

/* 
Максимум четырех чисел
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader( new InputStreamReader(System.in));

        String a1 = reader.readLine();
        String a2 = reader.readLine();
        String a3 = reader.readLine();
        String a4 = reader.readLine();

        int a = Integer.parseInt(a1);
        int b = Integer.parseInt(a2);
        int c = Integer.parseInt(a3);
        int d = Integer.parseInt(a4);


        int max = a;

        if (max <= b)
            max = b;
        if (max <= c)
            max = c;
        if (max <= d)
            max = d;
        System.out.println(max);
    }
}

