package com.javarush.task.task10.task1012;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;

/* 
Количество букв
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        // алфавит
        String abc = "абвгдеёжзийклмнопрстуфхцчшщъыьэюя";
        char[] abcArray = abc.toCharArray();

        ArrayList<Character> alphabet = new ArrayList<Character>();
        for (int i = 0; i < abcArray.length; i++) {
            alphabet.add(abcArray[i]);
        }

        // ввод строк
        ArrayList<String> list = new ArrayList<String>();
        for (int i = 0; i < 10; i++) {
            String s = reader.readLine();
            list.add(s.toLowerCase());
        }



        // Создаем упорядоченную карту. добавляем в него алфавит <Буква, Количество раз = 0>
        Map<Character, Integer> map = new LinkedHashMap<>();
        for (int i = 0; i < alphabet.size(); i++) {
            map.put(alphabet.get(i), 0);
        }

        // Обновляем значения у нужных букв
        for (String word : list) {
           char charWord[] = word.toCharArray();
            for (char aCharWord : charWord) {
                if (map.containsKey(aCharWord)) {
                    map.computeIfPresent(aCharWord, (k, v) -> v + 1);
                }
            }
        }

        //Вывод карты
        map.forEach((key, value) -> System.out.println(key + " " + value));
    }

}
