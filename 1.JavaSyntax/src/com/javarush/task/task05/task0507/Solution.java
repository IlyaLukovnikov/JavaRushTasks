package com.javarush.task.task05.task0507;

/* 
Среднее арифметическое
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int i = 0;
        double sum = 0;

        while (true) {
          int nummer = Integer.parseInt(reader.readLine());

          if (nummer == -1) {
              if (i == 0) {
                  System.out.println(0);
                  break;
              }
              double sred = sum / i;
              System.out.println(sred);
              break;
          }

          i++;
          sum = sum + nummer;
        }
    }
}

