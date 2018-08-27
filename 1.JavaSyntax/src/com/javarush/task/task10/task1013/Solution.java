package com.javarush.task.task10.task1013;

/* 
Конструкторы класса Human
*/

public class Solution {
    public static void main(String[] args) {
    }

    public static class Human {
        // напишите тут ваши переменные и конструкторы
        private int i = 0;
        private double d = 0;
        private String s = "";
        private long l = 0;
        private short aShort = 0;
        private byte b = 0;



        public Human () {}

        public Human (int i) {
            this.i = i;
        }

        public Human (double d) {
            this.d = d;
        }

        public Human (String s) {
            this.s = s;
        }

        public Human(long l) {
            this.l = l;
        }

        public Human(short aShort) {
            this.aShort = aShort;
        }

        public Human(byte b) {
            this.b = b;
        }

        public Human(int i, double d, String s, long l, short aShort, byte b) {
            this.i = i;
            this.d = d;
            this.s = s;
            this.l = l;
            this.aShort = aShort;
            this.b = b;
        }

        public Human(int i, double d) {
            this.i = i;
            this.d = d;
        }

        public Human(double d, String s, long l) {
            this.d = d;
            this.s = s;
            this.l = l;
        }
    }
}
