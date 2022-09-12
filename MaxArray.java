package org.Example;
//Java Program to print the largest element in an array
public class MaxArray {
    public static void main(String[] args) {
        int arr[] = {2,13,5,7,20,40};
        int max = arr[0];

        for(int i= 0; i<6; i++){
            if (arr[i] > max){
                max = arr[i];
            }
        }
        System.out.println("Largest Elemnt is: " +max);
    }
}
