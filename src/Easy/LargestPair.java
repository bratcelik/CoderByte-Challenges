package Easy;

import java.util.Scanner;

/*
* Largest Pair
*
* Have the function LargestPair(num) take the num parameter being passed
* and determine the largest double digit number within the whole number.
*
* For example:
*
* if num is 4759472 then your program should return 94 because that is the largest double digit number.
* The input will always contain at least two positive digits.
*
* @author Berat Sercan Çelik
*/

public class LargestPair {

    public static int LargestPair(String num){
        // code goes here
        int max = 0;
        int temp;

        for (int i = 0; i < num.length()-1; i++){
            temp = Integer.parseInt(num.substring(i,i+2));
            max = (temp > max) ? temp : max;
        }
        return max;
    }

    public static void main(String[] args) {
        // keep this function call here
        Scanner s = new Scanner(System.in);
        System.out.println(LargestPair(s.nextLine()));
    }
}
