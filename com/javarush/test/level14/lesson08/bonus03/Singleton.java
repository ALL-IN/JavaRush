package com.javarush.test.level14.lesson08.bonus03;

/**
 * Created with IntelliJ IDEA.
 * User: Lesha
 * Date: 25.04.13
 * Time: 11:49
 * To change this template use File | Settings | File Templates.
 */
public class Singleton {

    private static Singleton instance;

    private Singleton (){
    }

    public static Singleton getIstance(){
        if (instance == null){
            instance = new Singleton();
        }
        return instance;
    }

}