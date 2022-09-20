package Easy;

import java.util.Arrays;
import java.util.Scanner;

/*
* Second Great Low
*
* Have the function SecondGreatLow(arr) take the array of numbers stored in arr
* and return the second lowest and second greatest numbers, respectively, separated by a space.
*
* For example:
*
* if arr contains [7, 7, 12, 98, 106] the output should be 12 98.
* The array will not be empty and will contain at least 2 numbers.
* It can get tricky if there's just two numbers!
*
* @author Berat Sercan Çelik
*/

public class SecondGreatLow {

    public static String SecondGreatLow(int[] arr){
        boolean isFind = false;
        int min = Arrays.stream(arr).min().getAsInt();
        int max = Arrays.stream(arr).max().getAsInt();
        int minn = Integer.MAX_VALUE;
        int maxx = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++){
            if (arr[i] != min && arr[i] != max){
                isFind = true;
                if (arr[i] < minn){
                    minn = arr[i];
                }
                if (arr[i] > maxx){
                    maxx = arr[i];
                }
            }
        }

        if (isFind){
            return minn + " " + maxx;
        }

        return min + " " + max;
    }

    public static void main(String[] args) {
        // keep this function call here
        Scanner s = new Scanner(System.in);
       //System.out.print(SecondGreatLow(s.nextLine()));
    }


}
