package com.javarush.task.task08.task0827;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.nio.Buffer;
import java.util.Date;

/* 
Работа с датой
*/

public   class Solution {
    public static void main(String[] args) {
        System.out.println(isDateOdd("MAY 1 2013"));
        System.out.println(isDateOdd("MAY 2 2013"));
    }


    private static boolean isDateOdd(String date) {
        Date curDate = new Date(date);
        Date date1 = new Date();

        date1.setYear(curDate.getYear());
        date1.setMonth(0);
        date1.setDate(1);

        long msDistance = curDate.getTime() - date1.getTime();
        long msDay = 24 * 60 * 60 * 1000;

        int dayCount = (int) (msDistance / msDay);

        return dayCount % 2 != 0;
    }

}

