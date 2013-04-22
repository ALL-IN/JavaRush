package com.javarush.test.level12.lesson12.home07;

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
        public void fly(){

        }
        public void swim(){

        }
    }

    public class Penguin   implements Swim, Run
    {
        public void swim(){

        }
        public void run(){

        }


    }

    public class Toad   implements Swim, Run, Fly
    {
        public void swim(){

        }
        public void run(){

        }
        public void fly(){

        }

    }

    public class CaptainJackSparrow implements Run, Swim
    {
        public void run(){

        }
        public void swim(){

        }
    }
}
