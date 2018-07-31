package com.javarush.task.task04.task0429;

/* 
Положительные и отрицательные числа
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        int num1 = Integer.parseInt(in.readLine());
        int num2 = Integer.parseInt(in.readLine());
        int num3 = Integer.parseInt(in.readLine());

        PosNeg(num1, num2, num3);
    }

    public static void PosNeg(int num1, int num2, int num3) {
        int countPos = 0;
        int countNeg = 0;

        int[] arrPosNeg = {num1, num2, num3};


        for (int i = 0; i < arrPosNeg.length; i++) {
            if (arrPosNeg[i] > 0) {

                countPos++;
            } else if (arrPosNeg[i] < 0) {
                countNeg++;
            }
        }
        System.out.println("количество отрицательных чисел: " + countNeg);
        System.out.println("количество положительных чисел: " + countPos);
    }
}

