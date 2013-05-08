package com.javarush.test.level15.lesson12.home09;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

/*
Парсер реквестов
Считать с консоли URl ссылку
Вывести на экран через пробел список всех параметров (Параметры идут после ? и разделяются & , например, lvl=15)
URL содержит минимум 1 параметр
Если присутствует параметр obj, то передать его значение в нужный метод alert.
alert(double value) - для чисел (дробные числа разделяются точкой)
alert(String value) - для строк

Пример 1
Ввод:
http://javarush.ru/alpha/index.html?lvl=15&view&name=Amigo
Вывод:
lvl view name

Пример 2
Ввод:
http://javarush.ru/alpha/index.html?obj=3.14&name=Amigo
Вывод:
obj name
double 3.14
 */
public class Solution {
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        String delim = "?";
        ArrayList<String> a= new ArrayList<String>();
        String delim1 = "&";
        ArrayList<String> b= new ArrayList<String>();
        StringTokenizer st = new StringTokenizer(s, delim, false);
        while (st.hasMoreTokens())
        {
            a.add(st.nextToken());
        }
        StringTokenizer st1 = new StringTokenizer(a.get(1), delim1, false);
        while (st1.hasMoreTokens())
        {
            b.add(st1.nextToken());
        }
        ArrayList<String> c= new ArrayList<String>();
        String delim2 = "=";
        ArrayList<String> d= new ArrayList<String>();
        ArrayList<String> e= new ArrayList<String>();
        for (int i = 0; i < b.size(); i++)
        {

            if (b.get(i).contains("obj"))
            {

                StringTokenizer st2 = new StringTokenizer(b.get(i), delim2, false);
                while (st2.hasMoreTokens())
                {
                    c.add(st2.nextToken());

                }
                d.add(c.get(0));
            }
            else
            {
                StringTokenizer st2 = new StringTokenizer(b.get(i), delim2, false);
                while (st2.hasMoreTokens())
                {
                    e.add(st2.nextToken());

                }
                d.add(e.get(0));
                e.clear();

            }
        }

//        for (int i =0; i < a.size(); i++)
//            System.out.println(a.get(i));
//        System.out.println();
//        for (int i =0; i < b.size(); i++)
//            System.out.println(b.get(i));
//        System.out.println();
        if (d.get(0).contains("obj"))
        {
            for (int i =0; i < d.size(); i++)
                System.out.print(d.get(i)+" ");
            System.out.println();
            try
            {
                alert(Double.parseDouble(c.get(1)));
            }  catch (NumberFormatException z)
            {
                alert(c.get(1));
            }

        }
        else
        {
            for (int i =0; i < d.size(); i++)
                System.out.print(d.get(i)+" ");
        }

    }

    public static void alert(double value) {
        System.out.println("double " + value);
    }

    public static void alert(String value) {
        System.out.println("String " + value);
    }
}
