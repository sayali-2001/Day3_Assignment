package org.Example;

import java.util.Scanner;

public class RevArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size of an Array");
        int size = sc.nextInt();
        int arr[] = new int[size];

        System.out.println("enter values in an array");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Reversed Array is : ");
        for (int i =size-1; i >= 0; i--){
            System.out.println(arr[i]);
        }
    }
}
