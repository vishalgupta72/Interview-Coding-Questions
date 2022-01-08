/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Array;

import java.util.Scanner;

/**
 *
 * @author VISHAL
 */
public class Kth_Max_Min_Element {

    public static void main(String[] args) {

        Scanner kb = new Scanner(System.in);
        System.out.println("Enter the total no. of elements :");
        int n = kb.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = kb.nextInt();
        }

        sortArray(arr);
        
        System.out.println("Enter the Kth element : ");
        int k = kb.nextInt();
        
        System.out.println("Min for 1 & Max for 2");
        int choice = kb.nextInt();
        switch (choice) {
            case 1: {
                System.out.println("Kth min element is : " + arr[k - 1]);
                break;
            }
            case 2: {
                System.out.println("Kth min element is : " + arr[arr.length - k]);
                break;
            }
            default: {
                System.out.println("Wrong choice...");
            }
        }

    }

//    easy way sort array ...// after sorting you can find min ans max
    private static int[] sortArray(int arr[]) {

        int n = arr.length;
        int brr[] = arr;
        int temp = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i - 1; j++) {

                if (arr[j + 1] < arr[j]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        return brr;
    }
}
