package com.javarush.task.task04.task0424;

/* 
Три числа
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

        if(a != b && b != c && a != c);
        else  if (a != b && a != c)
                     System.out.println(1);
        else  if (b != a && b != c)
            System.out.println(2);
        else  if (c != a && c != b)
            System.out.println(3);
    }
}
