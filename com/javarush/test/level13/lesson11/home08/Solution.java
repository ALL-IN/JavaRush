package com.javarush.test.level13.lesson11.home08;

/*
Реализовать интерфейс Updatable в классе Screen
 */
public class Solution
{
    public static void main(String[] args) throws Exception
    {
    }

    interface Selectable
    {
        void onSelect();
    }

    interface Updatable extends Selectable
    {
        void refresh();
    }

    class Screen  implements  Updatable
    {

        @Override
        public void refresh()
        {
            //To change body of implemented methods use File | Settings | File Templates.
        }

        @Override
        public void onSelect()
        {
            //To change body of implemented methods use File | Settings | File Templates.
        }
    }
}
