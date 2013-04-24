package com.javarush.test.level14.lesson08.home07;

import java.util.ArrayList;
import java.util.List;

/*
Клининговый центр
1 Реализовать метод cleanAllApartaments.
Для каждого объекта из apartaments:
2 для однокомнатных квартир (Apt1Room) вызвать метод clean1Room.
  т.е. если объект типа Apt1Room, то вызвать у него метод clean1Romm.
3 для двухкомнатных квартир (Apt2Room) вызвать метод clean2Rooms
  т.е. если объект типа Apt2Room, то вызвать у него метод clean2Rooms.
4 для трехкомнатных квартир (Apt3Room) вызвать метод clean3Rooms
  т.е. если объект типа Apt3Room, то вызвать у него метод clean3Rooms.
*/
public class Solution
{
    public static void main(String[] args)
    {
        List<Apartament> apartaments = new ArrayList<Apartament>();
        apartaments.add(new Apt1Room());
        apartaments.add(new Apt2Room());
        apartaments.add(new Apt3Room());

        cleanAllApartaments(apartaments);
    }

    public static void cleanAllApartaments(List<Apartament> apartaments)
    {
        for (int i = 0; i < apartaments.size(); i++)
        {
            if (apartaments.get(i) instanceof Apt1Room)
                ((Apt1Room) apartaments.get(i)).clean1Room();
            else if (apartaments.get(i) instanceof Apt2Room)
                ((Apt2Room) apartaments.get(i)).clean2Rooms();
            else if (apartaments.get(i) instanceof Apt3Room)
                ((Apt3Room) apartaments.get(i)).clean3Rooms();
        }
        //написать тут вашу реализацию пунктов 1-4
    }

    static interface Apartament
    {
    }

    static class Apt1Room implements Apartament
    {
        void clean1Room()
        {
            System.out.println("1 room is cleaned");
        }
    }

    static class Apt2Room implements Apartament
    {
        void clean2Rooms()
        {
            System.out.println("2 rooms are cleaned");
        }
    }

    static class Apt3Room implements Apartament
    {
        void clean3Rooms()
        {
            System.out.println("3 rooms are cleaned");
        }
    }
}
