package com.javarush.task.task09.task0923;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Гласные и согласные
*/

public class Solution {
    public static char[] vowels = new char[]{'а', 'я', 'у', 'ю', 'и', 'ы', 'э', 'е', 'о', 'ё'};

    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String line = reader.readLine();

        StringBuilder builder = new StringBuilder();
        StringBuilder builder1 = new StringBuilder();

        for (int i = 0; i < line.length(); i++) {
            if (isVowel(line.charAt(i)))
                builder.append(line.charAt(i)).append(" ");
            else if (line.charAt(i) != ' ')
                builder1.append(line.charAt(i)).append(" ");
        }

        System.out.println(builder.toString());
        System.out.println(builder1.toString());
    }

    // метод проверяет, гласная ли буква
    public static boolean isVowel(char c) {
        c = Character.toLowerCase(c);  // приводим символ в нижний регистр - от заглавных к строчным буквам

        for (char d : vowels)   // ищем среди массива гласных
        {
            if (c == d)
                return true;
        }
        return false;
    }
}