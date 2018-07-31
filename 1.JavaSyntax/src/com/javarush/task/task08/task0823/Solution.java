package com.javarush.task.task08.task0823;

        import java.io.BufferedReader;
        import java.io.IOException;
        import java.io.InputStreamReader;


/*
Омовение Рамы
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();

        StringBuilder s1 = new StringBuilder("");



        if (Character.isAlphabetic(s.charAt(0)))
            s1.append(Character.toUpperCase(s.charAt(0)));
        else s1.append(s.charAt(0));

        for (int i = 1; i < s.length(); i++) {
            char character = s.charAt(i);
            char beforeChar = s.charAt(i - 1);

            if (Character.isLetter(character) && !Character.isLetter(beforeChar)) {
                character = Character.toUpperCase(character);
                s1.append(character);

            } else
                s1.append(character);

        }
        System.out.println(s1);
    }
}
