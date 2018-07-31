package com.javarush.task.task05.task0526;

/* 
Мужчина и женщина
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        Man man = new Man("safaf", 23, "dfhdshs");
        Man man1 = new Man("sfaf", 12, "fsdgsf");
        System.out.println(man);
        System.out.println(man1);
        Woman woman = new Woman("safaf", 54, "afaf");
        Woman woman1 = new Woman("sfa", 32, "sfsg");
        System.out.println(woman);
        System.out.println(woman1);
    }

    //напишите тут ваш код
    public static class Man {
        String name;
        int age;
        String address;

        public Man(String name, int age, String address) {
            this.name = name;
            this.age = age;
            this.address = address;
        }

        public String toString() {
            return name + " " + age + " " + address;
        }
    }

    public static class Woman {
        String name;
        int age;
        String address;

        public Woman(String name, int age, String address) {
            this.name = name;
            this.age = age;
            this.address = address;
        }
        @Override
        public String toString() {
            return name + " " + age + " " + address;
        }
    }
}
