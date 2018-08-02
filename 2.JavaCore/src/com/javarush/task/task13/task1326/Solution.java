package com.javarush.task.task13.task1326;

/* 
Сортировка четных чисел из файла
*/

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws IOException {
        // напишите тут ваш код

        //Задаем имя файла
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        InputStream inputStream = new FileInputStream(reader.readLine());
        reader.close();

        Scanner fileReader = new Scanner(inputStream);

        List<Integer> list = new ArrayList<>();

        // Читаем файл
        while (fileReader.hasNext()) {
            int number = fileReader.nextInt();
            if ((number % 2) == 0) {
                list.add(number);
            }
        }
        Collections.sort(list);

        for (int number :list) {
            System.out.println(number);
        }

        fileReader.close();
        inputStream.close();
    }
}
