package com.javarush.test.level14.lesson08.home05;

/*
1 Создайте интерфейс CompItem
2 Добавьте в него метод String getName()
3 Создайте классы Keyboard, Mouse, Monitor, которые реализуют интерфейс CompItem
4 Метод getName() должен возвращать имя класса, например, для класса Keyboard будет "Keyboard"
5 Создайте класс Computer
6 В класс Computer добавьте приватное поле типа Keyboard
7 В класс Computer добавьте приватное поле типа Mouse
8 В класс Computer добавьте приватное поле типа Monitor
9 Создайте конструктор в классе Computer используя комбинацию клавиш Alt+Insert внутри класса (команда Constructor)
10 Параметрами конструктора выберите все три поля (переменных) класса
11 Создайте геттеры для полей класса Computer (в классе используйте комбинацию клавиш Alt+Insert и выберите команду Getter)
12 Все созданные классы и интерфейс должны быть в отдельных файлах
 */
public class Solution
{

    public static void main(String[] args)
    {
        Computer computer = new Computer(new Keyboard(), new Mouse(), new Monitor());
        if (isWork(computer.getKeyboard()) &&
                isWork(computer.getMonitor()) &&
                isWork(computer.getMouse()))
        {
            System.out.println("Work!");
        }
    }

    public static boolean isWork(CompItem item)
    {
        System.out.println(item.getName());
        return item.getName() != null && item.getName().length() > 4;
    }

}
