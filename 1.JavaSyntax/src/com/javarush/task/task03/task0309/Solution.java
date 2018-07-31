package com.javarush.task.task03.task0309;

/* 
Сумма 10 чисел
*/

import com.sun.tools.doclets.formats.html.SourceToHTMLConverter;

import java.sql.SQLOutput;

public class Solution {
    public static void main(String[] args) {
        summ(15);
    }

    public static void summ(int count) {
        int sum = 0;
        for (int i = 1; i <= count; i++) {
            sum += i;
            System.out.println(sum);
        }
    }
}