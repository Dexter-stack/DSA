package org.dexter.ArrayD.InsertArray;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        char [] myChar = {'B','C','D','A','E','H','G','F'};
        System.out.println(  InsertSort.insertionSort(myChar));

        //Using the Generic Method


        Integer [] integers = {56,40,56,30,76,12,1,3,7,90,5};

        System.out.println(Arrays.toString(InsertSort.insertionSortGeneric(integers)));

        Character [] character = {'E','A','F','J','C','D','B'};

        System.out.println(Arrays.toString(InsertSort.insertionSortGeneric(character)));
    }
}
