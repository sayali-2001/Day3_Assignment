package org.Example;

import java.util.Scanner;

public class EvenPositionArr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size of an Array");
        int size = sc.nextInt();
        int arr[] = new int[size];

        System.out.println("enter values in an array");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        for(int i = 2; i < arr.length; i=i+2){
            System.out.println("Index = " + i + ":" + "Value = " + arr[i]);
        }
    }
}
