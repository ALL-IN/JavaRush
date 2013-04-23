package com.javarush.test.level14.lesson04.task02;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/*
1 Считывать строки(параметры) с консоли, пока пользователь не введет пустую строку(Enter)
2 Каждый параметр соответствует имени кота
Для каждого параметра:
3 Создать объект cat класса Cat, который равен коту из getCatByKey(String параметр)
4 Вывести на экран cat.toString()
*/
public class Solution
{

        public static void main(String[] args) throws Exception
        {
            BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
            String s;
            ArrayList<Cat> cats = new ArrayList<Cat>();

            while ((s = r.readLine()) != null) {
                cats.add(CatFactory.getCatByKey(s));
            }

            for (Cat x : cats) {
                System.out.println(x);
            }
        }

    }

     class CatFactory
    {

        static Cat getCatByKey(String key)
        {
            Cat cat = null;
            if ("vaska".equals(key))
            {
                cat = new MaleCat("Василий");
            } else if ("murka".equals(key))
            {
                cat = new FemaleCat("Мурочка");
            } else if ("kiska".equals(key))
            {
                cat = new FemaleCat("Кисюлька");
            } else
            {
                cat = new Cat(key);
            }

            return cat;
        }
    }

     class Cat
    {
        private String name;

        protected Cat(String name)
        {
            this.name = name;
        }

        public String getName()
        {
            return this.name;
        }

        public String toString()
        {
            return "Я уличный кот " + getName();
        }
    }

     class MaleCat extends Cat
    {
        MaleCat(String name)
        {
            super(name);
        }

        public String toString()
        {
            return "Я - солидный кошак по имени " + getName();
        }
    }

     class FemaleCat extends Cat
    {
        FemaleCat(String name)
        {
            super(name);
        }

        public String toString()
        {
            return "Я - милая кошечка по имени " + getName();
        }
    }
