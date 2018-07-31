package com.javarush.task.task04.task0425;

/* 
Цель установлена!
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader( new InputStreamReader(System.in));
        String xStr = reader.readLine();
        String yStr = reader.readLine();

        int x = Integer.parseInt(xStr);
        int y = Integer.parseInt(yStr);

        if (x > 0 && y > 0)
            System.out.println(1);
        if (x < 0 && y > 0)
            System.out.println(2);
        if (x < 0 && y < 0)
            System.out.println(3);
        if (x > 0 && y < 0)
            System.out.println(4);
    }
}
