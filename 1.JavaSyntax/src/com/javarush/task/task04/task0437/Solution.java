package com.javarush.task.task04.task0437;


/* 
Треугольник из восьмерок
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        for (int i = 1; i < 11; i++) {
            printN(i) ;
            System.out.println();
        }
    }

    public static void printN( int n){
        for (int i = 0; i < n; i++) {
            System.out.print(8);
        }
    }
}
