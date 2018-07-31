package com.javarush.task.task07.task0712;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

/* 
Самые-самые
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(reader.readLine());
        }
        int min = list.get(0).length();
       int max = list.get(0).length();
        String maxStr = null;
        String minStr = null;
        for (int i = 1; i < list.size(); i++) { //поиск максимальной длины
            if (max < list.get(i).length()){
                max = list.get(i).length();
            }
        }
        for (String aList : list) {
            if (aList.length() == max) {
                maxStr = aList;
                break;
            }
        }

        for (int i = 1; i < list.size(); i++) { //поиск минимальной длины
            if (min > list.get(i).length()){
                min = list.get(i).length();
            }
        }

        for (String aList : list) {
            if (aList.length() == min) {
                minStr = aList;
                break;
            }
        }

        int maxI = list.indexOf(maxStr);   //находим индекс max строки
        int minI = list.indexOf(minStr); //находим индекс min строки

        if(maxI > minI) //вывод
            System.out.println(list.get(minI));
        else
            System.out.println(list.get(maxI));
    }
}
