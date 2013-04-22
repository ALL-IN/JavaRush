package com.javarush.test.level13.lesson11.bonus02;

public class Person  implements RepkaItem
{
    public String name;
    public String namePadezh;

    public Person(String name, String namePadezh)
    {
        this.name = name;
        this.namePadezh = namePadezh;
    }
    public String getName()
    {
        return name;
    }
    public void pull(Person person)
    {

    }


}
