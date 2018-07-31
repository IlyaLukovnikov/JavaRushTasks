package com.javarush.task.task04.task0403;

/* 
Реализовать метод setName
*/

import sun.tools.java.Scanner;
import sun.tools.java.ScannerInputReader;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;

public class Cat {
    private String name;

    public void setName(String name) {
        //напишите тут ваш код
        this.name = name;
    }

    public static void main(String[] args) throws IOException {
       BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
       Cat cat = new Cat();
       cat.name = reader.readLine();
        System.out.println(cat.name);
    }
}
