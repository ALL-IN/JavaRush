package com.javarush.test.level13.lesson11.home03;

import java.io.*;
import java.io.InputStream;
import java.io.InputStreamReader;

/*
1 Считать с консоли имя файла
2 Вывести в консоль(на экран) содержимое файла.
3 Не забыть закрыть файл и поток
 */
public class Solution
{
    public static void main(String[] args) throws IOException
    {
        String s = "";
        BufferedReader b = new BufferedReader((new InputStreamReader(System.in)));
        FileReader inStream = new FileReader(b.readLine());
        BufferedReader br = new BufferedReader(inStream);
        while ((s=br.readLine())!= null)
        {

            System.out.println(s);
        }
        br.close();

    }
}
