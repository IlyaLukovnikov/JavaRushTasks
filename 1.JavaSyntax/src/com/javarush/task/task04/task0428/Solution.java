package com.javarush.task.task04.task0428;

/* 
Положительное число
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String a1 = reader.readLine();
        String a2 = reader.readLine();
        String a3 = reader.readLine();

        int a = Integer.parseInt(a1);
        int b = Integer.parseInt(a2);
        int c = Integer.parseInt(a3);
        int n = 0;

        if (a > 0)
            n += 1;
        if (b > 0)
            n += 1;
        if (c > 0)
            n += 1;
        System.out.println(n);
    }
}
