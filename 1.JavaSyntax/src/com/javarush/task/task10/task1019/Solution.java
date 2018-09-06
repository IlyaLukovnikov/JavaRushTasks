package com.javarush.task.task10.task1019;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

/* 
Функциональности маловато!
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        HashMap<String, Integer> map = new HashMap<>();

        while (true) {
            String stringId = reader.readLine();
            if (stringId.trim().isEmpty()) {
                break;
            }
            int id = Integer.parseInt(stringId);

            String name = reader.readLine();
            if (name.trim().isEmpty()) {
                map.put("", id);
                break;
            }

            map.put(name, id);
        }

        map.forEach((key, value) -> System.out.println(value + " " + key));
    }
}
