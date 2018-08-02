package com.javarush.task.task13.task1319;

import java.io.*;

/* 
Писатель в файл с консоли
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        // напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();
        BufferedWriter writer = new BufferedWriter(new FileWriter(fileName));

        String data;
        while (!(data =reader.readLine()).equals("exit")) {

            writer.write(data + "\n");

        }
        writer.write("exit");
        writer.close();
        reader.close();
    }
}
