package com.javarush.test.level14.lesson06.home01;

/**
 * Created with IntelliJ IDEA.
 * User: Lesha
 * Date: 21.04.13
 * Time: 12:24
 * To change this template use File | Settings | File Templates.
 */
public abstract class Hen
{
    abstract int getCountOfEggsPerMonth();
    String getDescription()
    {
        return  "Я курица.";
    }
}
