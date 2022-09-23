package Medium;

import java.util.Scanner;

/*
* Triple Double
*
* Have the function TripleDouble(num1,num2) take both parameters being passed,
* and return 1 if there is a straight triple of a number at any place in
* num1 and also a straight double of the same number in num2.
*
* For example:
*
* if num1 equals 451999277 and num2 equals 41177722899,
* then return 1 because in the first parameter you have the straight triple 999 and
* you have a straight double, 99, of the same number in the second parameter.
* If this isn't the case, return 0.
*
* @author Berat Sercan Çelik
*/

public class TripleDouble {
    public static int TripleDouble(int num1, int num2) {
        // code goes here
        int[] arr = new int[10];
        int[] arr2 = new int[10];


        int temp = num1 % 10;
        int counter = 1;

        while(num1 != 0 )
        {
            num1 = num1 / 10;
            if(num1 % 10 == temp)
            {
                counter++; // 2
                if(counter >= 3)
                    arr[temp] = 1;
            }
            else
            {
                counter = 1;
            }

            temp = num1 % 10;
        }

        temp = num2 % 10;
        counter = 1;

        while(num2 != 0 )
        {
            num2 = num2 / 10;
            if(num2 % 10 == temp)
            {
                counter++;
                if(counter >= 2)
                    arr2[temp] = 1;
            }
            else
            {
                counter = 1;
            }

            temp = num2 % 10;
        }

        for(int i = 0; i < arr.length; i++)
        {
            if(arr[i] == 1 && arr2[i] == 1)
                return 1;
        }
        return 0;
    }

    public static void main (String[] args) {
        // keep this function call here
        Scanner s = new Scanner(System.in);
        System.out.print(TripleDouble(s.nextInt(),s.nextInt()));
    }
}
