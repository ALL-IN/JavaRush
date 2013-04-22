package com.javarush.test.level12.lesson12.bonus02;

public class Solution
{
    public static void main(String[] args)
    {
        Pegas horse = new Pegas();
    }

    public static interface Fly
    {
        public void fly();
    }

    public static class Horse
    {
        public void run()
        {

        }
    }

    public static class Pegas extends Horse implements Fly
    {
        public void fly(){

        }
    }
}
