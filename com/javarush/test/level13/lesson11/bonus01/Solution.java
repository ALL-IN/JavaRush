package com.javarush.test.level13.lesson11.bonus01;

import java.io.*;
import java.io.InputStreamReader;
import java.util.ArrayList;

/*
1 Ввести имя файла с консоли.
2 Прочитать из него набор чисел
3 Вывести на консоль только четные, отсортированные по возрастанию.
Пример ввода:
5
8
11
3
2
10
Пример вывода:
2
8
10
 */
public class Solution
{
    public static void main(String[] args)   throws IOException
    {
        BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
        File fl = new File(b.readLine());
        BufferedReader in = new BufferedReader(new FileReader(fl));
        int i = 0;
        String str = "";
        ArrayList<Integer> a = new ArrayList<Integer>();
        while ((str=in.readLine()) !=null){

            i=Integer.parseInt(str);
            a.add(i);

        }
        in.close();

        ArrayList<Integer> e = new ArrayList<Integer>();

        for (int n = 0;  n < e.size(); n++)
        {
            if (a.get(n)%2 ==0)
                e.add(a.get(n));
        }
        int [] z = new int [e.size()];
        for (int n = 0; n < z.length; n++)
            z[n] = e.get(n);
        boolean r=true;
        while (r)
        {
            r=false;
            for (int n = 0; n < z.length-1; n++)
            {
                if (z[n] > z[n+1])
                {
                    int q = z[n];
                    z[n] = z[n+1];
                    z[n+1] = q;
                    r = true;
                }
            }
        }


        for (int n = 0; n < z.length; n++)
            System.out.println(z[n]);




    }
}