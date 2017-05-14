package com.company.lab3;

/* Вводить с клавиатуры строки, пока пользователь не введёт строку 'end'
Создать список строк.
Ввести строки с клавиатуры и добавить их в список.
Вводить с клавиатуры строки, пока пользователь не введёт строку "end".  "end" не учитывать.
Вывести строки на экран, каждую с новой строки.
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main3 {

    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        String e = "end";
        ArrayList<String> list = new ArrayList<>();
        //напишите тут ваш код
        while (!"end".equals(s.toLowerCase())){
            list.add(s);
            s = reader.readLine();

        }
        for (String x: list)
        {
            System.out.println(x);
        }
    }
}
