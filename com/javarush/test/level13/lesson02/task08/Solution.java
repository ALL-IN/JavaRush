package com.javarush.test.level13.lesson02.task08;

/*
1 Создать интерфейс Person.
2 Добавьте в него метод isAlive(), который проверяет, жив человек или нет.
3 Подумайте, какой тип должен возвращать этот метод.
4 Создайте интерфейс Presidentable
5 Унаследовать интерфейс Presidentable от интерфейса Person.
 */
public class Solution
{
    public static void main(String[] args) throws Exception
    {
    }
    public interface Person
    {
        Boolean isAlive();

    }
    public interface Presidentable  extends Person
    {
    }
}
