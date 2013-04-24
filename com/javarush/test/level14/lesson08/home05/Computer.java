package com.javarush.test.level14.lesson08.home05;

/**
 * Created with IntelliJ IDEA.
 * User: Lesha
 * Date: 22.04.13
 * Time: 18:17
 * To change this template use File | Settings | File Templates.
 */
public class Computer
{

    private Monitor monitor;
    private Mouse mouse;
    private Keyboard keyboard;

    public Monitor getMonitor()
    {
        return monitor;
    }

    public Mouse getMouse()
    {
        return mouse;
    }

    public Keyboard getKeyboard()
    {
        return keyboard;
    }



    public Computer(Keyboard keyboard, Mouse mouse, Monitor monitor)
    {
        this.keyboard = keyboard;
        this.mouse = mouse;
        this.monitor = monitor;
    }
}
