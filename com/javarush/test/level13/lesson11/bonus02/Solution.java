package com.javarush.test.level13.lesson11.bonus02;

import java.util.ArrayList;
import java.util.List;

/*
Сказка Репка:
1 реализовать интерфейс RepkaItem в классе Person
2 в классе Person реализовать метод pull(Person person), который выводит фразу типа '<name> за <person>'. Пример "Бабка за Дедку"
3 исправить логическую ошибку цикла в методе tell класса RepkaStory
4 выполнить метод main и наслаждаться сказкой!
*/
public class Solution
{
    public static void main(String[] args)
    {
        List<Person> plot = new ArrayList<Person>();
        plot.add(new Person("Репка", "Репку"));
        plot.add(new Person("Дедка", "Дедку"));
        plot.add(new Person("Бабка", "Бабку"));
        plot.add(new Person("Внучка", "Внучку"));
        RepkaStory.tell(plot);
    }


}
