package com.javarush.task.task12.task1207;

/* 
Int и Integer
*/

public class Solution {
    public static void main(String[] args) {

        print(5);
        print(new Integer(10));
    }

    //Напишите тут ваши методы
    public static void print(int i) {
        System.out.println(i);
    }

    public static void print(Integer integer) {
        System.out.println(integer);
    }
}
