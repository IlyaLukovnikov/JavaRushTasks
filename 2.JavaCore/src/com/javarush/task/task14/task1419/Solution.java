package com.javarush.task.task14.task1419;

import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.List;

/* 
Нашествие исключений
*/

public class Solution {
    public static List<Exception> exceptions = new ArrayList<Exception>();

    public static void main(String[] args) {
        initExceptions();

        for (Exception exception : exceptions) {
            System.out.println(exception);
        }
    }

    private static void initExceptions() {   //it's first exception
        try {
            float i = 1 / 0;

        } catch (Exception e) {
            exceptions.add(e);
        }

        //напишите тут ваш код
        try {
            int[] array = new int[0];
            System.out.print(array[1]);
        } catch (Exception e) {
            exceptions.add(e);
        }

        try {
            int[] array = new int[-1];
        } catch (Exception e) {
            exceptions.add(e);
        }

        try {
            Integer integer = (Integer) new Object();
        } catch (Exception e) {
            exceptions.add(e);
        }

        try {
            String s = null;
            s.length();
        } catch (Exception e) {
            exceptions.add(e);
        }

        try {
            System.out.println(Integer.parseInt(null));
        } catch (Exception e) {
            exceptions.add(e);
        }

        try {
            FileOutputStream outputStream = new FileOutputStream("");
        } catch (Exception e) {
            exceptions.add(e);
        }

        try {
            "".charAt(1);
        } catch (StringIndexOutOfBoundsException e) {
            exceptions.add(e);
        }

        try {
            Class<?> aClass = Class.forName("");
        } catch (ClassNotFoundException e) {
            exceptions.add(e);
        }

        try {
            Object[] x = new String[3];
            x[0] = new Integer(5);
        } catch (Exception e) {
            exceptions.add(e);
        }
    }
}
