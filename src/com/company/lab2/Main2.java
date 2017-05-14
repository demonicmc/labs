package com.company.lab2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/* Максимальное и минимальное числа в массиве
Создать массив на 20 чисел. Заполнить его числами с клавиатуры. Найти максимальное и минимальное числа в массиве.
Вывести на экран максимальное и минимальное числа через пробел.
*/
public class Main2 {
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int mas[] = new int[20];
        for (int i=0; i<20; i++){
            try {
                mas[i] = Integer.parseInt(reader.readLine());
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        Arrays.sort(mas);

        int  maximum =mas[19];
        int  minimum =mas[0];


        System.out.println(maximum);
        System.out.println(minimum);
    }

}
