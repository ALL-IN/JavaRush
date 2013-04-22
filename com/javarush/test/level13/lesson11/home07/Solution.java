package com.javarush.test.level13.lesson11.home07;

/*
1 Создайте класс StringObject
2 В классе StringObject реализуйте интерфейс SimpleObject с параметром типа String.
3 Программа должна компилироваться.
*/
public class Solution
{
    public static void main(String[] args) throws Exception
    {
       StringObject<Object> stringObject = new StringObject<Object>();
    }

    interface SimpleObject<T>
    {
        SimpleObject<T> getInstance();
    }
    public static  class StringObject<Object> implements SimpleObject<String>
    {
        public SimpleObject<String> getInstance()
        {
          return null;
        }


    }
}
