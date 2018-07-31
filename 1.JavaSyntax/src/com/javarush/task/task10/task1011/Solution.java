package com.javarush.task.task10.task1011;

/* 
Большая зарплата
*/

public class Solution {
    public static void main(String[] args) {
        String s = "Я не хочу изучать Java, я хочу большую зарплату";

        //напишите тут ваш код
        while (!s.equals("арплату")) {
            int i = 1;
            System.out.println(s);
            s = s.substring(i, s.length());
            i++;
        }
    }

}

