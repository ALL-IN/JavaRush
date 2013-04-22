package com.javarush.test.level12.lesson12.bonus03;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        int[] data = new int[]{1, 2, 3, 5, -2, -8, 0, 77, 5, 5};

        Pair<Integer, Integer> result = getMinimumAndIndex(data);

        System.out.println("Minimum is " + result.x);
        System.out.println("Index of minimum element is " + result.y);
    }

    public static Pair<Integer, Integer> getMinimumAndIndex(int[] array)
    {
        if (array == null || array.length == 0)
        {
            return new Pair<Integer, Integer>(null, null);
        }

        else
        {
            int a = array[0];
            int in = 0;
            for (int i = 0; i < array.length-1; i++){
                if (a > array[i+1]){
                    a = array[i+1];
                    in = i+1;
                }
            }
            return new Pair<Integer, Integer>(a, in);
        }


    }


    public static class Pair<X, Y>
    {
        public X x;
        public Y y;

        public Pair(X x, Y y)
        {
            this.x = x;
            this.y = y;
        }
    }
}
