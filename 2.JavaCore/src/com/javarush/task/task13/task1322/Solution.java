package com.javarush.task.task13.task1322;

/* 
Интерфейс SimpleObject
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        SimpleObject<String> stringObject = new StringObject<String>();
    }

    interface SimpleObject<T> {
        SimpleObject<T> getInstance();
    }

    public static class StringObject<String> implements SimpleObject<java.lang.String> {
        @Override
        public SimpleObject<java.lang.String> getInstance() {
            return null;
        }
    }
}
