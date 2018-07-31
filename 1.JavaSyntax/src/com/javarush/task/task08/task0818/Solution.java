package com.javarush.task.task08.task0818;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* 
Только для богачей
*/

public class Solution {
    public static HashMap<String, Integer> createMap() {
        //напишите тут ваш код
        HashMap<String, Integer> map = new HashMap<>();
        map.put("1", 1000);
        map.put("2", 450);
        map.put("3", 2000);
        map.put("4", 300);
        map.put("5", 750);
        map.put("6", 800);
        map.put("7", 3500);
        map.put("8", 390);
        map.put("9", 4000);
        map.put("10", 490);

        return map;
    }

    public static void removeItemFromMap(HashMap<String, Integer> map) {
        //напишите тут ваш код
        // Map.Entry<String, Integer> pair = iterator.next();
        map.entrySet().removeIf(stringIntegerEntry -> stringIntegerEntry.getValue() < 500);
    }

    public static void main(String[] args) {
    }
}