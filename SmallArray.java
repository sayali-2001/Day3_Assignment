package org.Example;

import java.util.Scanner;
public class SmallArray {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter size of an array");
        int size = sc.nextInt();

        int arr[] = new int[size];

        System.out.println("enter values in an array");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int small = arr[0];
        for (int i= 0; i<arr.length; i++){
           if (arr[i] < small){
               small = arr[i];
           }
        }
        System.out.println("Smallest Element is: " +small);
    }
}
