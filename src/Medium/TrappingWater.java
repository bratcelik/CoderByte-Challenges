package Medium;

/*
* Trapping Water
*
* Have the function TrappingWater(arr) take
* the array of non-negative integers stored in arr,
* and determine the largest amount of water that
* can be trapped. The numbers in the array
* represent the height of a building (where the
* width of each building is 1) and if you imagine it
* raining, water will be trapped between the two
* tallest buildings.
*
* Examples
*
* Input: [1, 2, 1, 2]
* Output: 1
*
* Input: [0, 2, 4, 0, 2, 1, 2, 6]
* Output: 11
*
* @author Berat Sercan Çelik
* */

import java.util.Scanner;

public class TrappingWater {
    public static int TrappingWater(int[] arr) {
        // code goes here
        int result = 0;

        for (int i = 1; i < arr.length - 1; i++){

            int l = arr[i];
            for (int j = 0; j < i; j++){
                l = Math.max(l, arr[j]);
            }

            int r = arr[i];
            for (int j = i + 1; j < arr.length; j++){
                r = Math.max(r,arr[j]);
            }

            result += Math.min(l,r) - arr[i];
        }

        return result;
    }

    public static void main (String[] args) {
        // keep this function call here
        Scanner s = new Scanner(System.in);
        //System.out.print(TrappingWater(s.nextLine()));
    }
}
