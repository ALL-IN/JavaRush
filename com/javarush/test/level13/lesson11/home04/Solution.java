package com.javarush.test.level13.lesson11.home04;

import javax.annotation.processing.Filer;
import java.io.*;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.util.*;
/*
1 Прочесть с консоли имя файла.
2 Считывать строки с консоли, пока пользователь не введет строку "exit"
3 Вывести все строки в файл.
*/
public class Solution
{
    public static void main(String[] args)  throws IOException
    {
        String s ="";

        BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
        File flt =new File(b.readLine());
        PrintWriter wrt = new PrintWriter(flt);

        while ((s=b.readLine())!=null)
        {
            if (s.equals("exit"))
                break;

            else
            {
                wrt.println(s);
                wrt.flush();
            }

        }
        wrt.close();
    }
}