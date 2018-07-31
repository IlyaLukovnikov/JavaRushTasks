package com.javarush.task.task04.task0433;


/* 
Гадание на долларовый счет
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        int j = 1;
            while (j < 101){
                System.out.print("S");
                if (j % 10 == 0)
                    System.out.println();
                j++;
            }

    }
}



