package com.javarush.task.task07.task0704;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Переверни массив
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = Integer.parseInt(reader.readLine());
        }
        int[] tmp = new int[10];
        System.arraycopy(array,0, tmp, 0, 10);

       for(int i =0, j = tmp.length - 1; i < array.length && j >= 0; i++, j--){
           array[i] = tmp[j];
       }

        for (int anArray : array) {
            System.out.println(anArray);
        }
    }
}

