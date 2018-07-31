package com.javarush.task.task05.task0532;

import java.io.*;

/* 
Задача по алгоритмам
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        int maximum = Integer.parseInt(reader.readLine());
        for (int i = 1; i < n; i++) {
            int number = Integer.parseInt(reader.readLine());
            if (number > maximum)
                maximum = number;
        }

        System.out.println(maximum);
    }
}
