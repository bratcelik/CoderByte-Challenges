package Hard;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


/*
* Kaprekars Constant
*
* Have the function KaprekarsConstant(num) take the num parameter being passed which will be a
* 4-digit number with at least two distinct digits. Your program should perform the following routine
* on the number: Arrange the digits in descending order and in ascending order (adding zeroes to fit it to a 4-digit number),
* and subtract the smaller number from the bigger number. Then repeat the previous step. Performing this
* routine will always cause you to reach a fixed number: 6174.
* Then performing the routine on 6174 will always give you 6174 (7641 - 1467 = 6174).
* Your program should return the number of times this routine must be performed until 6174 is reached.
*
* For example:
*
* if num is 3524 your program should return 3 because of the following steps:
* (1)5432 - 2345 = 3087,(2)8730 - 0378 = 8352,(3)8532 - 2358 = 6174
*
* Examples:
*
* Input: 2111
* Output: 5
*
* Input: 9831
* Output: 7
*
* @author Berat Sercan Çelik
*/

public class KaprekarsConstant {
    public static int KaprekarsConstant(int num) {
        // code goes here
        int original = num;
        int count = 0;

        System.out.println(num);
        Scanner in = new Scanner(System.in);
        in.nextLine();

        do{
            count++;
            ArrayList<Character> arr = new ArrayList<Character>();
            while(num != 0){
                arr.add((char)(num%10 + '0'));
                num /= 10;
            }

            Collections.sort(arr);
            int min = toInt(arr);
            Collections.sort(arr, Collections.reverseOrder());
            int max = toInt(arr);
            num = max - min;
        }while(num != 6174);

        return count;
    }

    public static int toInt(ArrayList<Character> arr){
        StringBuilder builder = new StringBuilder(arr.size());
        for(Character c : arr){
            builder.append(c);
        }
        return Integer.parseInt(builder.toString());
    }

    public static void main(String[] args) {
        // keep this function call here
        Scanner s = new Scanner(System.in);
        //System.out.print(KaprekarsConstant(s.nextLine()));
    }
}
