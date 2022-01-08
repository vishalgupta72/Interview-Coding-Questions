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
public class Max_Min_Element {

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.println("Enter the total no. of elements :");
        int n = kb.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = kb.nextInt();
        }

        System.out.println("Your Maximum element is :" + maxElement(arr));
        System.out.println("Your Minimum element is :" + minElement(arr));
    }

//    Maximum Element
    public static int maxElement(int arr[]) {

        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {

            if (arr[i] > max) {
                max = arr[i];
            }
        }

        return max;
    }

//    Minimum Element
    public static int minElement(int arr[]) {

        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {

            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }
}
