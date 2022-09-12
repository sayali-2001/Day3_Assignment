package org.Example;
//Java Program to print the duplicate elements of an array
public class DuplicateArr {
    public static void main(String[] args) {
        String arr[] = {"Java","C", "Cpp", "Python", "JavaScript", "Java", "Cpp"};
        System.out.println("Given Array is: ");

        for( int i = 0; i< arr.length; i++){
            System.out.println(arr[i]);
        }
        for(int i=0 ; i< arr.length; i++){
            for (int j= i+1; j< arr.length; j++){
                if( arr[i] == arr[j]){
                    System.out.println("Duplicate Element in the given Array is: " +arr[i]);
                }
            }
        }
    }
}
