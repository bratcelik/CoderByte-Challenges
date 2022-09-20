package Easy;

import java.util.Scanner;


/*
* Additive Persistence

* Have the function AdditivePersistence(num) take the num parameter being passed
* which will always be a positive integer and return its additive persistence
* which is the number of times you must add the digits in num until you reach a single digit.
* For example:
* if num is 2718 then your program should return 2 because 2 + 7 + 1 + 8 = 18 and 1 + 8 = 9 and you stop at 9.
*
* Examples:
*
* Input: 4
* Output: 0
*
* Input: 19
* Output: 2
*
* @author Berat Sercan Çelik
*/

public class AdditivePersistence {

    public static int AdditivePersistence(int x){
        int sum;
        int count = 0;

        while (x > 9){
            sum = 0;
            count++;
            while (x > 0){
                sum += x % 10;
                x /= 10;
            }
            x = sum;
        }
        return count;
    }

    public static void main(String[] args) {
        // keep this function call here
        Scanner s = new Scanner(System.in);
        System.out.print(AdditivePersistence(s.nextInt()));
    }
}
