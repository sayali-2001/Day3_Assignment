package org.Example;

import java.util.Scanner;
import java.util.Arrays;

//Find 2nd Largest Number in an Array

public class LargestNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size of an Array");
        int size = sc.nextInt();
        int arr[] = new int[size];

        System.out.println("enter values in an array");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        System.out.println("Array in Ascending Order: ");

        for (int i = 0; i<arr.length ; i++) {
            System.out.print(arr[i]+ " ");
        }
        System.out.println(" ");
        System.out.println("2nd highest element is " +arr[arr.length-2]);
    }
}
