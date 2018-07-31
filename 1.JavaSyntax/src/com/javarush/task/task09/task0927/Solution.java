package com.javarush.task.task09.task0927;

import java.util.*;

/* 
Десять котов
*/

public class Solution {
    public static void main(String[] args) {
        Map<String, Cat> map = createMap();
        Set<Cat> set = convertMapToSet(map);
        printCatSet(set);
    }

    public static Map<String, Cat> createMap() {
        //напишите тут ваш код
        Map<String, Cat> cats = new HashMap<>();
        for (int i = 1; i < 11; i++) {
            cats.put("Cat" + i, new Cat("Cat" + i));
        }
        /*
        cats.put("Cat 1", new Cat("Cat 1"));
        cats.put("Cat 2", new Cat("Cat 2"));
        cats.put("Cat 3", new Cat("Cat 3"));
        cats.put("Cat 4", new Cat("Cat 4"));
        cats.put("Cat 5", new Cat("Cat 5"));
        cats.put("Cat 6", new Cat("Cat 6"));
        cats.put("Cat 7", new Cat("Cat 8"));
        cats.put("Cat 8", new Cat("Cat 8"));
        cats.put("Cat 9", new Cat("Cat 9"));
        cats.put("Cat 10", new Cat("Cat 10"));
*/
        return cats;
    }

    public static Set<Cat> convertMapToSet(Map<String, Cat> map) {
        //напишите тут ваш код
        /*
        for(Map.Entry<String, Cat> pair : map.entrySet())

        {
            Cat value = pair.getValue();
            cats.add(value);
        }
        */
        return new HashSet<>(map.values());
    }

    public static void printCatSet(Set<Cat> set) {
        for (Cat cat : set) {
            System.out.println(cat);
        }
    }

    public static class Cat {
        private String name;

        public Cat(String name) {
            this.name = name;
        }

        public String toString() {
            return "Cat " + this.name;
        }
    }

}
