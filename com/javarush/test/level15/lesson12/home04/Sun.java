package com.javarush.test.level15.lesson12.home04;

/**
 * Created with IntelliJ IDEA.
 * User: Lesha
 * Date: 07.05.13
 * Time: 18:17
 * To change this template use File | Settings | File Templates.
 */
public class Sun implements Planet
{
    private static Sun instance;
    private Sun(){}
    public static Sun getInstance()
    {
        if (instance == null)
            instance = new Sun();
        return instance;
    }
}
