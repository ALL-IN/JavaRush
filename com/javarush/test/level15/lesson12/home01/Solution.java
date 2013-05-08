package com.javarush.test.level15.lesson12.home01;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/*
1. Считать с консоли данные, пока не введено слово "exit"
2. Для каждого значения вызвать метод print. Если значение
2.1. содержит точку '.', то вызвать метод print для Double
2.2. больше нуля, но меньше 128, то вызвать метод print для short
2.3. больше либо равно 128, то вызвать метод print для Integer
2.4. иначе, вызвать метод print для String
 */
public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s;
        ArrayList <String> a = new ArrayList();
        while (!(s=br.readLine()).equals("exit"))
        {
             a.add(s);
        }
        for (int i = 0; i < a.size(); i++)
        {
            try
            {
                if (a.get(i).contains("."))
                    print(Double.parseDouble(a.get(i)));
                else if (Short.parseShort(a.get(i))>0 && Short.parseShort(a.get(i))<128)
                    print(Short.parseShort(a.get(i)));
                else if (Integer.parseInt(a.get(i))>=128)
                    print(Integer.parseInt(a.get(i)));
                else
                    print(a.get(i));
            }  catch (NumberFormatException e)
            {
                print(a.get(i));
            }

        }

    }

    public static void print(Double value) {
        System.out.println("Это тип Double, значение " + value);
    }

    public static void print(String value) {
        System.out.println("Это тип String, значение " + value);
    }

    public static void print(short value) {
        System.out.println("Это тип short, значение " + value);
    }

    public static void print(Integer value) {
        System.out.println("Это тип Integer, значение " + value);
    }
}