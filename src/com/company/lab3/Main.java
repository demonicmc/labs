package com.company.lab3;


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* Гласные и согласные буквы
   Написать программу, которая вводит с клавиатуры строку текста.
   Программа должна вывести на экран две строки:
   1. первая строка содержит только гласные буквы
   2. вторая - только согласные буквы и знаки препинания из введённой строки.
   Буквы соединять пробелом, каждая строка должна заканчиваться пробелом.

   Пример ввода:
   Мама мыла раму.
   Пример вывода:
   а а ы а а у
   М м м л р м .
*/


public class Main {

    public static void main(String[] args) throws Exception
    {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        String s = r.readLine();
        char[] mas = s.toCharArray();
        ArrayList<Character> ch1 = new ArrayList<>();
        ArrayList<Character> ch2 = new ArrayList<>();
        for (int i =0; i<mas.length; i++){
            if (isVowel(mas[i])){
                ch1.add(mas[i]);
            } else{
                ch2.add(mas[i]);
            }
        }
        for (Character c: ch1)
        {
            System.out.print(c + " ");
        }
        System.out.println();
        for (Character l: ch2)
        {
            System.out.print(l + " ");
        }
    }


    public static char[] vowels = new char[]{'а', 'я', 'у', 'ю', 'и', 'ы', 'э', 'е', 'о', 'ё'};

    //метод проверяет, гласная ли буква
    public static boolean isVowel(char c)
    {
        c = Character.toLowerCase(c);  //приводим символ в нижний регистр - от заглавных к строчным буквам

        for (char d : vowels)   //ищем среди массива гласных
        {
            if (c == d)
                return true;
        }
        return false;
    }
}
