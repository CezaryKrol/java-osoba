package com.company;

public class ArrayUtils {
    public static <T> T getCentral(T[] a) {
        if (a == null || a.length == 0)
            return null;
        return (a[a.length / 2]);
    }
    public static <T extends Comparable<T>> int counterGreaterThan(T[] anArray, T elem){
        int count = 0;
        for (T e: anArray)
            if(e.compareTo(elem)>0)
                count++;
            return count;
    }
    public static<T extends Comparable<T>> T max(T[] arr){
        T max= arr[0];
        for(int i=1;i<arr.length;i++)
            if(arr[i].compareTo(max)>0) max=arr[i];
            return max;
    }
    public static <T> void printArray(T[] a){
        for(int i=0;i<a.length;i++){
            System.out.println(a[i]);
            if(i<a.length-1) System.out.println(", ");
        }
        System.out.println();
    }

}
