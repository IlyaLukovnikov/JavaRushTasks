package com.javarush.task.task03.task0318;

/* 
План по захвату мира
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            String s1 = reader.readLine();
            String s2 = reader.readLine();
            int s3 = Integer.parseInt(s1);
            System.out.println(s2 + " захватит мир через " + s3 + " лет. Му-ха-ха!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}