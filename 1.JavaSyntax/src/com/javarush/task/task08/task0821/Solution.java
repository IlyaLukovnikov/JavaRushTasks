package com.javarush.task.task08.task0821;

import java.util.HashMap;
import java.util.Map;

/* 
Однофамильцы и тёзки
*/

public class Solution {
    public static void main(String[] args) {
        Map<String, String> map = createPeopleList();
        printPeopleList(map);
    }

    public static Map<String, String> createPeopleList() {
        //напишите тут ваш код
        HashMap<String, String> people = new HashMap<>();
        people.put("1", "Jon");
        people.put("2", "Jon");
        people.put("3", "Sam");
        people.put("3", "Vasa");
        people.put("2", "Joli");
        people.put("1", "Franck");
        people.put("3", "Sam");
        people.put("2", "Jon");
        people.put("Homyak", "Misha");
        people.put("1", "Jon");


        return people;
    }

    public static void printPeopleList(Map<String, String> map) {
        for (Map.Entry<String, String> s : map.entrySet()) {
            System.out.println(s.getKey() + " " + s.getValue());
        }
    }
}
