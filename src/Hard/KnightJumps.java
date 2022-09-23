package Hard;

import java.util.Scanner;

/*
* Knight Jumps
*
* Have the function KnightJumps(str) read str which will be
* a string consisting of the location of a knight on a standard 8x8
* chess board with no other pieces on the board. The structure of str will be the
* following: "(x y)" which represents the position of the knight with x and y ranging
* from 1 to 8. Your program should determine the number of spaces the knight can move to from a given location.
*
* For example:
*
* if str is "(4 5)" then your program should output 8 because the knight can move to 8 different
* spaces from position x=4 and y=5.
*
* Examples:
*
* Input: "(1 2)"
* Output: 2
*
* Input: "(2 8)"
* Output: 3
*
* @author Berat Sercan Çelik
*/

public class KnightJumps {
    public static int KnightJumps(String x){
        // code goes here
        int row = Character.getNumericValue(x.charAt(1));
        int column = Character.getNumericValue(x.charAt(3));
        int sum = 0;

        if((row +2) <= 8){
            if((column + 1) <= 8)
                sum++;
            if((column -1) >= 1)
                sum++;
        }

        if((row + 1) <= 8){
            if((column + 2) <= 8)
                sum++;
            if((column - 2) >= 1)
                sum++;
        }

        if((row - 2) >= 1){
            if((column + 1) <= 8)
                sum++;
            if((column -1) >= 1)
                sum++;
        }

        if((row - 1) >= 1){
            if((column + 2) <= 8)
                sum++;
            if((column - 2) >= 1)
                sum++;
        }

        return sum;
    }

    public static void main (String[] args) {
        // keep this function call here
        Scanner s = new Scanner(System.in);
        System.out.print(KnightJumps(s.nextLine()));
    }

}
