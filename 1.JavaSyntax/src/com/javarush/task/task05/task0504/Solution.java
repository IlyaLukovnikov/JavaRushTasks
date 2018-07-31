package com.javarush.task.task05.task0504;


/* 
Трикотаж
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        Cat vaska = new Cat("Vaska", 2, 3, 5);
        Cat murka = new Cat("Murka", 1, 2, 3);
        Cat tishka = new Cat("Tishka", 5, 5, 7);
    }

    public static class Cat {
        private String name;
        private int age;
        private int weight;
        private int strength;

        public Cat(String name, int age, int weight, int strength) {
            this.name = name;
            this.age = age;
            this.weight = weight;
            this.strength = strength;
        }
    }
}