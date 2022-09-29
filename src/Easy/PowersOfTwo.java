package Easy;

/*
* Powers of Two
*
* Have the function PowersofTwo(num) take
* the num parameter being passed which will be
* an integer and return the string true if it's a
* power of two. If it's not return the string false.
* For example if the input is 16 then your
* program should return the string true but if the
* input is 22 then the output should be the string false.
*
*
* Examples
*
* Input: 4
* Output: true
*
* Input: 124
* Output: false
*
* @author Berat Sercan Çelik
* */


import java.util.Scanner;

public class PowersOfTwo {
    public static boolean PowersofTwo(int num) {
        // code goes here
        if (num == 0)
            return false;

        if (num == 1)
            return true;

        if (num % 2 != 0)
            return false;

        return PowersofTwo(num/2);
    }

    public static void main (String[] args) {
        // keep this function call here
        Scanner s = new Scanner(System.in);
        //System.out.print(PowersofTwo(s.nextLine()));
    }
}
