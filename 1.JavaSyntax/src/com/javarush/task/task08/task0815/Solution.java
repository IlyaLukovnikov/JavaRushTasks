package com.javarush.task.task08.task0815;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/* 
Перепись населения
*/

public class Solution {
    public static HashMap<String, String> createMap() {
        //напишите тут ваш код
        HashMap<String, String > map = new HashMap<>();
        map.put("Иванов", "Иван");
        map.put("Васечкин", "Илья");
        map.put("Сидоров", "Саша");
        map.put("Попов", "Иван");
        map.put("Луковников", "Илья");
        map.put("Крылов", "Дмитрий");
        map.put("Грачев", "Миша");
        map.put("Толстов", "Гриша");
        map.put("Парашин", "Иван");
        map.put("Краснов", "Игорь");
        return map;
    }

    public static int getCountTheSameFirstName(HashMap<String, String> map, String name) {
        //напишите тут ваш код
        int countNames = 0;
        for (Map.Entry<String, String> pair: map.entrySet()) {
            if (pair.getValue().equals(name))
                countNames++;
        }
        return countNames;
    }

    public static int getCountTheSameLastName(HashMap<String, String> map, String lastName) {
        //напишите тут ваш код
        int coutLastName = 0;
        for (Map.Entry<String, String> pair: map.entrySet()) {
            if (pair.getKey().equals(lastName))
                coutLastName++;
        }
        return coutLastName;
    }

    public static void main(String[] args) {
      // System.out.println(getCountTheSameFirstName(createMap(), "Иван"));
    }
}
