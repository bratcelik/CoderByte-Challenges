package Medium;

import java.util.Scanner;

/*
* Off Binary
*
* Have the function OffBinary(strArr) read the array of strings stored in strArr,
* which will contain two elements, the first will be a positive decimal number and
* the second element will be a binary number.
* Your goal is to determine how many digits in the binary number need to be
* changed to represent the decimal number correctly (either 0 change to 1 or vice versa).
*
* For example:
*
* if strArr is ["56", "011000"] then your program should return 1
* because only 1 digit needs to change in the binary number
* (the first zero needs to become a 1) to correctly represent 56 in binary.
*
* Examples:
*
* Input: ["5624", "0010111111001"]
* Output: 2
*
* Input: ["44", "111111"]
* Output: 3
*
* @author Berat Sercan Çelik
*/

public class OffBinary {
    public static int OffBinary(String[] strArr) {
        // code goes here
        int decimal = Integer.parseInt(strArr[0]);
        int binary = 0;
        int count = 0;
        char[] binaryArr = strArr[1].toCharArray();
        for (int i = 0; i < binaryArr.length; i++){
            binary += (int)(Math.pow(2,(binaryArr.length-i-1))) * Character.getNumericValue(binaryArr[i]);
        }

        int countBits = decimal ^ binary;

        while(countBits != 0){
            if(countBits % 2 == 1){
                count++;
            }
            countBits >>= 1;
        }

        return count;
    }

    public static void main(String[] args) {
        // keep this function call here
        Scanner s = new Scanner(System.in);
        //System.out.print(OffBinary(s.nextLine()));
    }
}
