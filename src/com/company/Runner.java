package com.company;

public class Runner {

    public static void main(String[] args)
    {
        int[] runnerArray = {8, 6, 7, 5, 3, 0};
        insertionSort(runnerArray);
        for (int i = 0; i < runnerArray.length; i++)
        {
            System.out.print(runnerArray[i] + " ");
        }
    }

    public static void swap(int[] arr, int i, int j)
    {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void insertionSort(int[] list1)
    {
        for (int i = 0; i < list1.length; i++)
        {
            for (int j = i; j > 0; j--)
            {
                if (list1[j-1] > list1[j])
                {
                    swap(list1, j, j-1);
                }
                else
                {
                    j = 0;
                }
            }
        }
    }
}
