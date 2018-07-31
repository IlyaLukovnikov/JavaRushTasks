package com.javarush.task.task04.task0417;

/* 
Существует ли пара?
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader( new InputStreamReader(System.in));

        String a1Str = reader.readLine();
        int a1 = Integer.parseInt(a1Str);
        String a2Str = reader.readLine();
        int a2 = Integer.parseInt(a2Str);
        String a3Str = reader.readLine();
        int a3 = Integer.parseInt(a3Str);


        if (a1 == a2 && a2 == a3)
            System.out.println(a1 + " " + a2 + " " + a3);
        else if (a1 == a2)
            System.out.println(a1 + " " + a2);
        else if (a1 == a3)
            System.out.println(a1 + " " + a3);
        else if (a2 == a3)
            System.out.println(a2 + " " + a2);



    }
}