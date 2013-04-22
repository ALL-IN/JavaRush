package com.javarush.test.level12.lesson12.home06;

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

    public class Cat  implements  Run
    {
        public void run(){

        }
    }

    public class Dog implements Run, Swim
    {
        public void run(){

        }
        public void swim(){

        }
    }

    public class Tiger extends Cat implements Swim
    {
        public void swim(){

        }
    }

    public class Lion extends Cat
    {
    }
}
