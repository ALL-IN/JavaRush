package com.javarush.test.level12.lesson12.home07;

/*
 Напиши интерфейсы Fly(летать), Swim(плавать), Run(бегать).
 Добавь эти интерфейсы классам Duck(утка), Penguin(пингвин), Toad(жаба), CaptainJackSparrow(Капитан Джек Воробей).
 */
public class Solution
{
    public static void main(String[] args)
    {

    }

    public interface Fly
    {
        public void fly();
    }

    public interface Run
    {
        public void run();
    }

    public interface Swim
    {
        public void swim();
    }

    public class Duck implements Fly, Swim
    {
        @Override
        public void fly()
        {
            //To change body of implemented methods use File | Settings | File Templates.
        }

        @Override
        public void swim()
        {
            //To change body of implemented methods use File | Settings | File Templates.
        }
        //не может бегать
    }

    public class Penguin  implements Run, Swim
    {

        @Override
        public void run()
        {
            //To change body of implemented methods use File | Settings | File Templates.
        }

        @Override
        public void swim()
        {
            //To change body of implemented methods use File | Settings | File Templates.
        }
    }

    public class Toad implements Swim
    {



        @Override
        public void swim()
        {
            //To change body of implemented methods use File | Settings | File Templates.
        }


    }

    public class CaptainJackSparrow implements Run, Swim, Fly//Капитан Джек Воробей :)
    {

        @Override
        public void run()
        {
            //To change body of implemented methods use File | Settings | File Templates.
        }

        @Override
        public void swim()
        {
            //To change body of implemented methods use File | Settings | File Templates.
        }

        @Override
        public void fly()
        {
            //To change body of implemented methods use File | Settings | File Templates.
        }
    }
}
