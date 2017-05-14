package com.company.lab3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main2 {

    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        char[] ch = s.toCharArray();

        for (int i = 0; i < ch.length-1; i++)
        {
            if (ch[i] == ' ' & ch[i+1] != ' ') ch[i+1] = Character.toUpperCase(ch[i+1]);
        }
        System.out.print(ch);

    }
}
