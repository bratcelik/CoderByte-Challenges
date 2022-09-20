package Easy;

import java.util.Scanner;

/*
* Dash Insert
*
* Have the function DashInsert(str) insert dashes ('-') between each two odd
* numbers in str.
*
* For example:
*
* if str is 454793 the output should be 4547-9-3.
* Don't count zero as an odd number.
*
* @author Berat Sercan Çelik
* */

public class DashInsert {

    public static String DashInsert(String str) {
        // code goes here
        char[] arr = str.toCharArray();
        StringBuilder builder = new StringBuilder();

        for (int i = 0; i < arr.length -1; i++){
            builder.append(arr[i]);
            if ((Character.getNumericValue(arr[i]) % 2 == 1) && (Character.getNumericValue(arr[i+1]) % 2 == 1)){
                builder.append('-');
            }
        }
        builder.append(arr[arr.length-1]);
        return builder.toString();
    }

    public static void main (String[] args) {
        // keep this function call here
        Scanner s = new Scanner(System.in);
        System.out.print(DashInsert(s.nextLine()));
    }
}
