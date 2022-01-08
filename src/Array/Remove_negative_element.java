/*Que :-Remove all negative elements

            Input : arr[] = {1, -1, 3, 2, -7, -5, 11, 6 }
            Output : 1  3  2  11  6
*/

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
public class Remove_negative_element {

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.println("Enter the total no. of elements :");
        int n = kb.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = kb.nextInt();
        }
        System.out.println(Arrays.toString(removeNegativeNumbers(arr)));
    }

    public static int[] removeNegativeNumbers(int[] num) {
        int[] output = new int[num.length];
        int k = 0;
        for (int i = 0; i < num.length; i++) {
            if (num[i] >= 0) {
                output[k++] = num[i];
            }
        }
        
        //System.out.println("Length of output "+output.length);
        
        return Arrays.copyOfRange(output, 0, k); //if you don't want to use pre-defined methods.So you can go with below the logic.Both are correct
        
//        int count = 0;
//        for(int i=0;i<num.length;i++){
//            if(num[i]>=0)
//                ++count;
//        }
//        
//        int result[] = new int[count];
//        int c =0;
//        for(int i=0;i<num.length;i++){
//            if (num[i] >= 0) {
//                result[c++] = num[i];
//            }
//        }
//        System.out.println("Length of result "+result.length);
//        return result;
        
        
        
    }
}
