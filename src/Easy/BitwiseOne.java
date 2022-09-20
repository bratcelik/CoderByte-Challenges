package Easy;

import java.util.Scanner;

/*
* Bitwise One
*
* Have the function BitwiseOne(strArr) take the array of strings stored in strArr,
* which will only contain two strings of equal length that represent binary numbers,
* and return a final binary string that performed the bitwise OR operation on both strings.
* A bitwise OR operation places a 0 in the new string where there are zeroes in both binary strings,
* otherwise it places a 1 in that spot.
*
* For example:
*
* if strArr is ["1001", "0100"] then your program should return the string "1101"
*
* @author Berat Sercan Çelik
*/

public class BitwiseOne {

    public static String BitwiseOne(String[] strArr) {
        // code goes here
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < strArr[0].length(); i ++){
            if(strArr[0].charAt(i) == '1' || strArr[1].charAt(i) == '1'){
                result.append('1');
            }
            else{
                result.append('0');
            }
        }

        return result.toString();
    }

    public static void main(String[] args) {
        // keep this function call here
         Scanner s = new Scanner(System.in);
        // System.out.print(BitwiseOne(s.nextLine()));

    }
}
