/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Array;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author VISHAL
 */
public class ReverseArray {
    
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.println("Enter the total no. of elements :");
        int n = kb.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = kb.nextInt();
        }
        reverseArray2(arr);

    }
    
    public static void reverseArray(int arr[]){
        
        int brr[] = new int[arr.length];
        int n = arr.length;
        for (int i = 0; i < arr.length; i++) {
            brr[n - 1] = arr[i];
            --n;
        }
        // printing the reversed array
        System.out.println("Reversed array is..");
        for(int x : brr)
            System.out.print(x+" ");
    }
    
    //2nd way reversing array
    public static void reverseArray2(int arr[]){
        
        int brr[] = new int[arr.length];
        int n = 0;
        for (int i = arr.length-1; i >=0; i--) {
            brr[n] = arr[i];
            ++n;
        }
        // printing the reversed array
        System.out.println("Reversed array is..");
        for(int x : brr)
            System.out.print(x+" ");
    }
}
