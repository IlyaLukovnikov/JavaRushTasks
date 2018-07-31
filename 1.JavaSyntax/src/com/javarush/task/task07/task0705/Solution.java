package com.javarush.task.task07.task0705;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Один большой массив и два маленьких
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] bigArray = new int[20];
        int[] smallArray1 = new int[10];
        int[] smallArray2 = new int[10];

        for (int i = 0; i < bigArray.length; i++) {
            bigArray[i] = Integer.parseInt(reader.readLine());
        }

        System.arraycopy(bigArray, 0, smallArray1, 0, 10);
        System.arraycopy(bigArray, 10, smallArray2, 0, 10);

        for (int i = 0; i < smallArray2.length; i++) {
            System.out.println(smallArray2[i]);
        }
    }
}
