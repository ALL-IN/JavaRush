package com.javarush.test.level14.lesson08.bonus02;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
Наибольший общий делитель (НОД)
Ввести с клавиатуры 2 целых положительных числа
Вывести в консоль наибольший общий делитель
Например, числа 24 и 16
Результат будет 8, т.к. и 24 и 16 нацело делятся на 8 - максимальное из всех делителей
 */
public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s1=br.readLine();
        String s2=br.readLine();
        int a = Integer.parseInt(s1);
        int b = Integer.parseInt(s2);
        int c = maxDiv(a,b);
        System.out.println(c);

    }

    public static int maxDiv(int w, int q)
    {
        int c = 0;

        int i = 1;
        while (i <= q && i <= w)
        {
            if ((q%i)==0 && (w%i)==0)
            {
                c = i;
                i++;
            }
            else
                i++;
        }
        return c;

    }
}
