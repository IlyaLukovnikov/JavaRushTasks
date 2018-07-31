package com.javarush.task.task04.task0427;

/* 
Описываем числа
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    String numberStr = reader.readLine();
    int number = Integer.parseInt(numberStr);
    if(number == 0);
    else if (number % 2 == 0 && numberStr.length() == 1)
        System.out.println("четное однозначное число");

    else if (number % 2 == 0 && numberStr.length() == 2)
            System.out.println("четное двузначное число");

    else if (number % 2 == 0 && numberStr.length() == 3)
            System.out.println("четное трехзначное число");

    else if (number % 2 != 0 && numberStr.length() == 1)
            System.out.println("нечетное однозначное число");

    else if (number % 2 != 0 && numberStr.length() == 2)
            System.out.println("нечетное двузначное число");

    else if (number % 2 != 0 && numberStr.length() == 3)
            System.out.println("нечетное трехзначное число");


    }
}
