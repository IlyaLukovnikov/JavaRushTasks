package com.javarush.task.task08.task0812;

import java.io.*;
import java.util.ArrayList;

/* 
Cамая длинная последовательность
*/
public class Solution {
    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> list = new ArrayList<Integer>();

        for (int i = 0; i < 10; i++) {
            list.add(Integer.parseInt(reader.readLine()));
        }
        int max = 0;
        int k = 0;
        for (int i = 0, j = 1; i < list.size() && j < list.size(); i++, j++) {
            if (!list.get(i).equals(list.get(j))){
                k = 0;
            }
           if (list.get(i).equals(list.get(j))){
               k++;
               if( k > max) max = k;
           }
        }
        System.out.println(max + 1);
    }
}