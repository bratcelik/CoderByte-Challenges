package Easy;

import java.util.Scanner;

/*
* Happy Numbers

* Have the function HappyNumbers(num) determine if a number is Happy,
* which is a number whose sum of the square of the digits eventually converges to 1.
* Return true if it's a Happy number, otherwise return false.
*
* @author Berat Sercan Çelik
*/


public class HappyNumbers {
    public static boolean HappyNumbers(int num) {
        // code goes here
        if(num < 0)
            num *= -1;
        if(num == 0)
            return false;

        int sum = 0;

        while(num > 0)
        {
            int temp = num % 10;
            num = num/10;
            sum += temp*temp;
        }

        if(sum == 1)
            return true;
        else
            return false;

    }

    public static void main (String[] args) {
        // keep this function call here
        Scanner s = new Scanner(System.in);
        System.out.print(HappyNumbers(s.nextInt()));
    }
}
