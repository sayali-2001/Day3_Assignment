package org.Example;

import java.util.Scanner;

public class Array1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size of an Array");
        int size = sc.nextInt();
        int arr[] = new int[size];

        System.out.println("enter values in an array");
        for (int i = 0; i<arr.length ; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Elements of an Array is: ");
        for (int i = 0; i<arr.length ; i++) {
            System.out.print(arr[i]+ " ");
        }
    }

}
