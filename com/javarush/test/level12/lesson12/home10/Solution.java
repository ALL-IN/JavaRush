package com.javarush.test.level12.lesson12.home10;

public class Solution
{
    public static void main(String[] args) throws Exception
    {

        Fox bigFox = new BigFox();
        System.out.println(bigFox.getName());
        System.out.println(bigFox.getColor());

    }

    public interface Animal
    {
        Color getColor();
    }

    public static abstract class Fox implements Animal
    {
        public String getName() {
            return "Fox";
        }
    }
    public static class Color
    {
       static String GRAY="gray";
    }
    //add your code below
    public static class BigFox extends Fox
    {
        public String Color () {
            return Color.GRAY;
        }
        public Color getColor(){
          return new Color();
        }
    }

}

