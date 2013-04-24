package com.javarush.test.level14.lesson08.home03;

public interface Person
{
    static class User implements Person
    {
        void live()
        {
            System.out.println("Usually I just live");
        }
    }

    static class Looser implements Person
    {
        void doNothing()
        {
            System.out.println("Usually I do nothing");
        }
    }

    static class Coder implements Person
    {
        void coding()
        {
            System.out.println("Usually I create code");
        }
    }

    static class Proger implements Person
    {
        void enjoy()
        {
            System.out.println("Wonderful life!");
        }
    }

}
