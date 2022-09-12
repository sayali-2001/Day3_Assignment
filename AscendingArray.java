package org.Example;


//Java Program to sort the elements of an array in ascending order

import java.util.Scanner;

public class AscendingArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size of an Array");
        int size = sc.nextInt();
        int arr[] = new int[size];

        System.out.println("enter values in an array");
        for (int i = 0; i<arr.length ; i++) {
            arr[i] = sc.nextInt();
        }

        for(int i = 0 ; i<arr.length ; i++){
            for( int j = i+1 ; j<arr.length ; j++){
                if(arr[i] > arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp ;
                }
            }
        }
        System.out.println("Array in Ascending Order: ");

        for (int i = 0; i<arr.length ; i++) {
            System.out.print(arr[i]+ " ");
        }

    }
}
