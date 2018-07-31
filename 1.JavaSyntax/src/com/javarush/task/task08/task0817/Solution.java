package com.javarush.task.task08.task0817;

import java.util.HashMap;
import java.util.Map;

/* 
Нам повторы не нужны
*/

public class Solution {
    public static HashMap<String, String> createMap() {
        //напишите тут ваш код
        HashMap<String, String> map = new HashMap<>();
        map.put("Иванов","Иван");
        map.put("Козлов","Вася");
        map.put("Васек","Иван");
        map.put("Какшн","Рома");
        map.put("Бонд","Дима");
        map.put("Доукали","Миша");
        map.put("Киборг","Иван");
        map.put("Тааааагииил","Вася");
        map.put("Кстово","Илья");
        map.put("Асламбек","Толян");

        return map;
    }

    public static void removeTheFirstNameDuplicates(HashMap<String, String> map) {
        //напишите тут ваш код
      HashMap<String, String> copy2 = new HashMap<>(map);
        for (Map.Entry<String, String> pair: copy2.entrySet()) {
            int i = 0;
            for (Map.Entry<String, String> pair2: copy2.entrySet()) {
                if(pair.getValue().equals(pair2.getValue())) {
                    i++;
                }
                if (i > 1)
                    removeItemFromMapByValue(map,pair.getValue());
                }
            }

        }


    public static void removeItemFromMapByValue(HashMap<String, String> map, String value) {
        HashMap<String, String> copy = new HashMap<String, String>(map);
        for (Map.Entry<String, String> pair : copy.entrySet()) {
            if (pair.getValue().equals(value))
                map.remove(pair.getKey());
        }
    }

    public static void main(String[] args) {
        HashMap<String, String> map = createMap();
        removeTheFirstNameDuplicates(map);
        System.out.println(map);
    }
}
