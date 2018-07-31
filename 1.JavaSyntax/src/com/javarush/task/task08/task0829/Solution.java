package com.javarush.task.task08.task0829;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Модернизация ПО
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        //list of addresses
        List<String> addresses = new ArrayList<String>();
        while (true) {
            String city = reader.readLine();
            if (city.isEmpty()) break;
            String family = reader.readLine();
            addresses.add(city);
            addresses.add(family);
        }

        //read home number
        String cityName = reader.readLine();
        for (int i = 0; i < addresses.size(); i++) {
            if(addresses.get(i).equals(cityName))
                System.out.println(addresses.get(i + 1));
        }
    }
}

