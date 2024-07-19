package org.dexter.ArrayD.InsertArray;

public class InsertSort {


    public static char [] insertionSort(char [] data){
        int n = data.length;
        for(int k = 1; k<n; k++){
            char currentChar = data[k];  // current character
            int j = k;     // current character index
            while(j>0 &&  data[j-1]>currentChar){
                data[j] = data[j-1];
                j--;

            }
            data[j] =currentChar;
        }




        return data;

    }



    // to generify the method

    public static <T extends Comparable<T>> T []insertionSortGeneric(T[] data){

        int n = data.length;  // array lenght
        for(int k =1; k<n ; k++){
            T currentChar =  data[k];
            int j = k;
            while(j>0 && data[j-1].compareTo(currentChar)>0){
                data[j]=data[j-1] ;
                j--;
            }
            data[j] = currentChar;
        }
        return data;

    }
}
