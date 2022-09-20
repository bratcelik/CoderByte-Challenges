package Easy;

import java.util.Scanner;

/*
* GCF
*
* Have the function GCF(arr) take the array of numbers stored in arr which will
* always contain only two positive integers, and return the greatest common factor of them.
*
* For example:
* if arr is [45, 12] then your program should return 3.
* There will always be two elements in the array and they will be positive integers.
*
* @author Berat Sercan Çelik
* */

public class GCF {
    public static int GCF(int[] arr) {
        // code goes here
        int a = arr[0];
        int b = arr[1];
        int min = Math.min(a, b);

        if (min > 1){
            for (int i = min; i > 0; i--){
                if (a % i == 0 && b % i == 0){
                    return i;
                }
            }
        }
        return 1;
    }

    public static void main (String[] args) {
        // keep this function call here
        Scanner s = new Scanner(System.in);
        //System.out.print(GCF(s.nextLine()));
    }
}
